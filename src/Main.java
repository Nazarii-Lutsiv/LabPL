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

        TestArrays2.sortm(arr2, row, col);
        TestArrays2.printm2(arr2, row, col);

        TestArrays2.tablePifg(arr1, arr2, row, col);
        TestArrays2.printm2(arr2, row, col);




    }


    public static class TestArrays {

        static void fillm(int m[]){
            for (int i=0; i<m.length; i++){
                m[i] = (int) (20*Math.random() + 1);
            }
        }

        static void printm(int m[]){
            System.out.println(Arrays.toString(m) + "\n");
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

        private static String Strm2(int m[][], int r, int c){
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

        static void printm2(int m[][], int r, int c){
        System.out.println(Strm2(m, r, c));}


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
                    for (int j = 0; j < c - 1; j++) {
                        if (m[i][j] > m[i][j + 1]) {
                            swapx(m, i, j);
                            t = true;
                        }
                    }
                }
            }
            t = true;
            while (t == true) {
                t = false;
                for (int j = 0; j < r; j++) {
                    for (int i = 0; i < r - 1; i++) {
                        if (m[i][j] > m[i + 1][j]) {
                            swapy(m, i, j);
                            t = true;
                        }
                    }
                }
            }
        }

        static void swapx(int mas[][], int i, int j){
            int sp;
            sp = mas[i][j];
            mas[i][j] = mas[i][j + 1];
            mas[i][j + 1] = sp;
        }
        static void swapy(int mas[][], int i, int j){
            int sp;
            sp = mas[i][j];
            mas[i][j] = mas[i + 1][j];
            mas[i + 1][j] = sp;
        }

        static void tablePifg(int[] m, int arrP[][], int r, int c){
            boolean ii = true;
            while (ii == true){
                for(int j = 1; j < c; j++){
                    arrP[0][j] = m[j];
                }
                ii = false;
            }
            for (int i = 1; i < r; i++) {
                arrP[i][0] = m[i];
                for (int j = 1; j < c; j++) {
                    arrP[i][j] = arrP[i][0] * m[j];
                }
            }
        }


    }
}
