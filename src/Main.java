import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        int row = 10, col = 10;
        int arr1[] = new int [10];
        int arr2 [][] = new int[row][col];

        TestArrays.fillm(arr1);
        TestArrays.printm (arr1);
        TestArrays.sortm(arr1);
        TestArrays.printm (arr1);
        TestArrays2.fillm2(arr2, row, col);
        System.out.println(TestArrays2.printm2(arr2, row, col));
    }


    public static class TestArrays {

        static void fillm(int m[]){
            for (int i=0; i<m.length; i++){
                m[i] = (int) (20*Math.random());
            }
        }

        static void printm(int m[]){
            System.out.println(Arrays.toString(m));
        }

        static void sortm(int m[]){
            boolean t = true;
            while (t == true){
                t = false;
                for (int j = 0; j < m.length - 1; j++)
                    if (m[j] > m[j + 1]) {
                        swap(m, j);
                        t = true;
                    }
            }
        }

        static void swap(int mas[], int i){
            int sp;
            sp = mas[i];
            mas[i] = mas[i + 1];
            mas[i + 1] = sp;
        }
    }

///////////////For MAS [][]////////////////
    public static class TestArrays2 {

        static String printm2(int m[][], int r, int c){
            if (m == null)
                return "null";
            int iMax = c - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();

            for (int i = 0; i < r; i++){
                b.append('[');
                for(int j = 0; j < c; j++){
                    b.append(String.valueOf(m[i][j]));
                    if (j == iMax) {
                        b.append("]\n");
                        break;
                    }
                    b.append(", ");
                }
            }
            return b.toString();
        }

        static void fillm2(int m[][], int r, int c){
            for (int i=0; i < r; i++){
                for(int j = 0; j < c; j++){
                    m[i][j] = (int) (10*Math.random());
               }
            }
        }

        static void sortm(int m[][], int r, int c) {
            boolean t = true;
            while (t == true) {
                t = false;

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (m[i][j] > m[i][j + 1]) {
                            swap(m, i, j);
                            t = true;
                        }
                    }
                }
            }
        }

        static void swap(int mas[][], int i, int j){
            int sp;
            sp = mas[i][j];
            mas[i][j] = mas[i][j + 1];
            mas[i][j + 1] = sp;
        }






    }
}
