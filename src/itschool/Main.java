package itschool;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {

    final static int N = 90;
    static int[][] arr = new int[N][N];

    public static void main(String[] args) {
        final int N = 20;
        int[] arr = new int[N];
/*
	    for(int i = 0;i<N;i++)
	    {
            arr[i]=(int)(Math.random()*100);
       }

        System.out.print("[");
        for (int element : arr){
            System.out.print(element+", ");
        }
        System.out.println("]");

        System.out.println();
        //Arrays.fill(arr, 5);
        System.out.println("Before sort: \n" + Arrays.toString(arr));


        //Arrays.sort(arr);
        System.out.println("After sort: \n" + Arrays.toString(arr));


        for (int i = 0; i < arr.length/2; i++)
        {
            int temp=arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("After reverse: \n" + Arrays.toString(arr));
*/

/*
        System.out.println(Arrays.binarySearch(arr, 50));

        int n = 10;
        for(int i = 0;i < arr.length;)
        {
            if(isSimple(n))
            {
                arr[i++]=n;
            }
            n++;
        }

        System.out.println(Arrays.toString(arr));
       // System.out.println(isSimple(28));

        for(int i = arr.length-1;i >= 0;i--){
            System.out.print("  " + arr[i]);
        }

        System.out.println("\n"+Arrays.toString(func16a(arr)));
        System.out.println("\n"+Arrays.toString(func16b(arr,5)));
        System.out.println("\n"+Arrays.toString(func16c(arr)));
        System.out.println("\n"+func17a(arr));
        System.out.println("\n"+func17b(arr));
        System.out.println("\n"+func17e(arr, 5,15));
        System.out.println("\n"+func17h(arr, 5,15));
        System.out.println("\n"+maxInArray(arr));
        System.out.println("\n"+minInArray(arr));

        System.out.println("\n"+Arrays.toString(changeInArray(arr, minInArray(arr), maxInArray(arr))));

        double [][] arr2 = new double[5][5];
        printArray(arr2);

        for (int r = 0; r < arr2.length; r++)
            for (int c = 0; c < arr2[r].length; c++)
                arr2[r][c] = Math.random()*11;

        printArray(arr2);

        double [][] arr2D = new double[3][];
        arr2D[0] = new double[5];
        arr2D[1] = new double[2];
        arr2D[2] = new double[4];

        for (int r = 0; r < arr2D.length; r++)
            for (int c = 0; c < arr2D[r].length; c++)
                arr2D[r][c] = Math.random()*101;

        printArray(arr2D);
*/

        //changeArray();
        //hormirr();
        //findDifferent();
        //sortRows();
        //change100();
        //task969();
        //task972();
        //pascktri();
        //square();
        snail();
    }


    private static void snail() {
        int N = 10, r = 0, c = 0, a = 0;
        int[][] arr = new int[N][N];
        for (int k = 1; k <= N * N; k++) {
            arr[r][c] = k;

            if (r == 0 + a && c < N - 1) {
                c++;
                if (c == N - a) {
                    c--;
                    r++;
                }
            } else {
                if ((c == N - 1 - a && r < N - 1 - a) || (r == a && c == N - a)) {
                    r++;
                } else {
                    if (r == N - 1 - a && c > 0) {
                        c--;
                        if (c == a - 1) {
                            c++;
                            r--;
                        }
                    } else {
                        if (c == 0 + a && r > a) {
                            r--;
                            if (r == a) {
                                a++;
                                r++;
                                c++;
                            }
                        }
                    }
                }
            }
            printArray(arr);
            System.out.println(r + " " + c + " " + k + " " + a);

        }

    }

    private static void square() {


        for (int r = 0; r < arr.length; r++) {
            Arrays.fill(arr[r], 1);
        }
        int k = N;

        cut(arr, k / 3, k / 3 * 2, k / 3, k / 3 * 2);


        cut(arr, k / 3 / 3, k / 3 * 2 / 3, k / 3 / 3, k / 3 * 2 / 3);
        cut(arr, k / 3 * 2 + k / 3 / 3, k / 3 * 2 + k / 3 / 3 * 2, k / 3 * 2 + k / 3 / 3, k / 3 * 2 + k / 3 / 3 * 2);
        cut(arr, k / 3 - k / 3 / 3 * 2, k / 3 - k / 3 / 3, k / 3 * 2 + k / 3 / 3, k / 3 * 2 + k / 3 / 3 * 2);
        cut(arr, k / 3 * 2 + k / 3 / 3, k / 3 * 2 + k / 3 / 3 * 2, k / 3 - k / 3 / 3 * 2, k / 3 - k / 3 / 3);


        //cut(arr, k/3/3/3,k/3*2/3/3,k/3/3/3,k/3*2/3/3);


        printArray(arr, 1);
    }

    private static void cut(int[][] arr, int r1, int r2, int c1, int c2) {
        for (int r = r1; r < r2; r++) {
            for (int c = c1; c < c2; c++) {
                arr[r][c] = 0;
            }
        }
    }


    private static void pascktri() {
        final int N = 500;
        int[][] arr = new int[N][N];
        arr[0][N / 2 - 1] = 1;
        arr[0][N / 2] = 1;
        for (int r = 1; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length / 2; c++) {
                arr[r][c] = arr[r - 1][c] + arr[r - 1][c + 1];
            }
            for (int c = arr.length / 2; c < arr[r].length; c++) {
                arr[r][c] = arr[r - 1][c] + arr[r - 1][c - 1];
            }
        }
        //printArray(arr);

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void task972() {
        final int N = 10;
        int[][] arr = new int[N][N];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                for (int i = 0; i < N; i++) {
                    if (r - i == c) {
                        arr[r][c] = N - i;
                    }
                }
            }
        }
        printArray(arr);
    }

    private static void task969() {
        final int M = 5, N = 8;
        Random random = new Random();
        int[][] arr = new int[N][M];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = 15 + random.nextInt(15);
            }
        }
        printArray(arr);
        int s = 0, k;
        for (int r = 0; r < arr.length; r++) {
            s += arr[r][2];

        }
        System.out.println(s / arr.length);
    }

    private static void change100() {
        final int N = 6;
        int[][] arr = new int[N][N];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(arr);

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (r + c == N - 1) {
                    arr[r][c] = 100;
                }
            }
        }
        printArray(arr);


    }


    private static void sortRows() {
        final int N = 6;
        int[][] arr = new int[N][N];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(arr);

        for (int r = 0; r < arr.length; r++) {
            Arrays.sort(arr[r]);
            if (r % 2 == 1) {
                for (int c = 0; c < arr[r].length / 2; c++) {
                    int t = arr[r][c];
                    arr[r][c] = arr[r][arr.length - 1 - c];
                    arr[r][arr.length - 1 - c] = t;
                }

            }

        }

        printArray(arr);
    }

    private static void findDifferent() {
        final int N = 4;
        int[][] arr = new int[N][N];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(arr);

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                int t = arr[r][c];
                int k = 0;
                for (int r1 = 0; r1 < arr.length; r1++) {
                    for (int c1 = 0; c1 < arr[r].length; c1++) {
                        if (t == arr[r1][c1]) {
                            k++;
                        }
                    }
                }
                if (k == 1) {
                    System.out.println(t);
                }
            }
        }
    }

    public static void printArray(double[][] array) {
        Locale.setDefault(Locale.US);
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++)
                System.out.print(String.format("%7.2f", array[r][c]));
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(int[][] array) {
        Locale.setDefault(Locale.US);
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++)
                System.out.print(String.format("%8d", array[r][c]));
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(int[][] array, int n) {
        Locale.setDefault(Locale.US);
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++)
                System.out.print(String.format("%" + n + "d", array[r][c]));
            System.out.println();
        }
        System.out.println();
    }

    public static void changeArray() {
        final int N = 10;
        int[][] array2 = new int[N][N];
        for (int r = 0; r < array2.length; r++) {
            for (int c = 0; c < array2[r].length; c++) {
                array2[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(array2);

        // exchange

        int t = 0;
        for (int r = 0; r < array2.length; r++) {
            for (int c = 0; c < array2[r].length; c++) {
                if (r > c) {
                    t = array2[r][c];
                    array2[r][c] = array2[c][r];
                    array2[c][r] = t;
                }
            }
        }
        printArray(array2);
    }

    //horizontal mirroring

    public static void hormirr() {
        final int B = 4;
        int[][] arr3 = new int[B][B];
        for (int r = 0; r < arr3.length; r++) {
            for (int c = 0; c < arr3[r].length; c++) {
                arr3[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(arr3);

        //exchange horizontal mirroring

        int t = 0;
        for (int r = 0; r < arr3.length; r++) {
            for (int c = 0; c < arr3[r].length / 2; c++) {
                //System.out.println(arr3[r][c]+"<==>"+arr3[r][arr3.length-1-c]);
                t = arr3[r][c];
                arr3[r][c] = arr3[r][arr3.length - 1 - c];
                arr3[r][arr3.length - 1 - c] = t;
            }
        }
        printArray(arr3);
    }


    private static boolean isSimple(int n) {
        int i = 2, j = 0;
        while (i * i <= n && j != 1) {
            if (n % i == 0) {
                j = 1;
            }
            i++;
        }
        return j != 1;
    }

    private static int[] func16a(final int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            array[i] *= 2;
        }

        return array;
    }

    private static int[] func16c(final int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            array[i] /= arr[0];
        }

        return array;
    }

    private static int func17a(final int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int[] func16b(final int[] arr, int a) {
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            array[i] -= a;
        }

        return array;
    }

    private static double func17b(final int[] arr) {
        double proiz = 1;
        for (int i = 0; i < arr.length; i++) {
            proiz *= arr[i];
        }

        return proiz;
    }

    private static int func17e(final int[] arr, int k1, int k2) {
        int sum = 0;
        for (int i = k1; i < k2; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int func17h(final int[] arr, int k1, int k2) {
        return func17e(arr, k1, k2) / (k2 - k1);
    }

    private static int maxInArray(final int[] arr) {
        int maxNumber = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (maxNumber <= arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int minInArray(final int[] arr) {
        int minNumber = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (minNumber >= arr[i]) {
                minNumber = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] changeInArray(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
