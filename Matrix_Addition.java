public class Matrix_Addition {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 ,9 }};
        for (int i = 0; i < matrix1.length; ++i) {
            for (int j = 0; j < matrix1.length; ++j) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        for (int i = 0; i < matrix2.length; ++i) {
            for (int j = 0; j < matrix2.length; ++j) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Addition of given matrix :  ");                     // We require 3 matrix for addition of two matrices

        int rows1=matrix1.length;
        int col1=matrix1[0].length;
        int rows2=matrix2.length;
        int col2=matrix2[0].length;

        if (rows1==rows2 && col1==col2) {
            for (int i = 0; i < rows1; ++i) {
                for (int j = 0; j < col1; ++j) {
                    System.out.print(matrix2[i][j] + matrix1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
/*public class Matrix_Addition{
    public static void main(String[] args){
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 ,9 }};
        int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        if(matrix1.length==matrix2.length){
            int len=matrix1.length;
            for(int i=0;i<len;++i){
                for(int j=0;j<len;++j){
                    System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}*/
