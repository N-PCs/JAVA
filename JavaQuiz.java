import java.util.Scanner;

public class JavaQuiz {

    // Shared flag to indicate if time is up
    private static volatile boolean timeUp = false;

    public static void main(String[] args) {
        // Total time for the quiz in seconds
        int quizTime = 50;

        // Create and start the timer thread
        Thread timerThread = new Thread(new Timer(quizTime));
        timerThread.start();

        // Run the quiz in the main thread
        runQuiz();

        try {
            // Wait for timer thread to finish before exiting
            timerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Timer class implements Runnable to run in a separate thread
    static class Timer implements Runnable {
        private int seconds;

        public Timer(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            System.out.println("Timer started: You have " + seconds + " seconds to complete the quiz.");
            System.out.println("Answer in options only i.e A , B , c...");
            try {
                Thread.sleep(seconds * 1000); // Sleep for specified seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeUp = true; // Set flag when time is up
            System.out.println("\nTime's up! The quiz will end now.");
        }
    }

    // Method to run the quiz questions
    public static void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Array of questions and answers
        String[][] quiz = {
            {"What is the default value of an int variable in Java?\nA. 0\nB. null\nC. 1\nD. undefined", "A"},
            {"Which keyword is used to inherit a class in Java?\nA. implements\nB. extends\nC. inherits\nD. super", "B"},
            {"What is the size of int data type in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes\nD. Depends on JVM", "B"},
            {"Which collection class allows duplicate elements?\nA. Set\nB. Map\nC. List\nD. Queue", "C"},
            {"What is the parent class of all Java classes?\nA. Object\nB. Class\nC. Main\nD. Root", "A"},
            {"Which method is used to start a thread in Java?\nA. run()\nB. start()\nC. execute()\nD. begin()", "B"},
            {"What is the output of: System.out.println(10 + 20 + \"Java\");\nA. 30Java\nB. 1020Java\nC. Error\nD. 10Java20", "A"},
            {"Which keyword is used to create an object in Java?\nA. create\nB. new\nC. object\nD. instantiate", "B"},
            {"What is the default value of a boolean variable?\nA. true\nB. false\nC. null\nD. 0", "B"},
            {"Which package is automatically imported in every Java program?\nA. java.util\nB. java.lang\nC. java.io\nD. java.awt", "B"}
        };

        for (int i = 0; i < quiz.length; i++) {
            if (timeUp) {
                break; // Stop asking if time is up
            }
            System.out.print(quiz[i][0] + " ");
            System.out.println();
            String answer = scanner.nextLine();

            if (timeUp) {
                break; // Check again in case time ran out during input
            }

            if (answer.trim().equalsIgnoreCase(quiz[i][1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + quiz[i][1] + ".");
            }
        }

        System.out.println("\nQuiz finished! Your score: " + score + "/" + quiz.length);
        scanner.close();
    }
}
