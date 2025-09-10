public class StringHandling {
    public static void main(String[] args) {
        char[] name = { 'J', 'a', 'v', 'a', ' ', 'T', 'u', 't', 'o', 'r', 'i', 'a', 'l', 's' };
        System.out.println(name);                                       
        // name[14] = '@'; //ArrayIndexOutOfBoundsException
        name[4] = 's';
        System.out.println(name);
        name[5] = '-';
        System.out.println(name);
        String[] Name = { "Hello", "World!", "How", "Are", "You", "?" };
        System.out.println(Name[0]);
        String siteName = "btechsmartclass.com";
        siteName = "www.btechsmartclass.com";
        System.out.println(siteName);
        String title = "Np's Java Tutorial";                                // Using literals
        String subtitle="Java Tutorial";
        String sitename = new String("www.btechsmartclass.com");  // Using constructor
        System.out.println(title);
        System.out.println(sitename);
        for(int i=0;i<siteName.length();++i){                               //iterating thorugh string
            System.out.print(siteName.charAt(i)+" ");
        }
        System.out.println("");
        System.out.println(title.compareTo(sitename));
        System.out.println(title.compareToIgnoreCase(sitename));
        System.out.println(title.concat(" @ "+sitename));                   //concatenation
        System.out.println(title.toLowerCase());
        System.out.println(title.toUpperCase());
        System.out.println(title.trim());
        System.out.println(title.contains(subtitle));
        
    }
}
