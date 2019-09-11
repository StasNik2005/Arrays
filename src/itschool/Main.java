package itschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        final int N = 20;
	    int []arr = new int[N];
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

    }

    private static boolean isSimple(int n)
    {
        int i = 2,j = 0;
        while(i*i<=n && j != 1)
        {
            if(n%i==0){
                j = 1;
            }
            i++;
        }
        if(j==1){
            return false;
        }
        else{
            return true;
        }
    }

    private static int[] func16a(final int [] arr)
    {
        int [] array = Arrays.copyOf(arr, arr.length);
        for(int i = 0;i < arr.length;i++){
            array[i] *= 2;
        }

        return array;
    }

    private static int[] func16c(final int [] arr)
    {
        int [] array = Arrays.copyOf(arr, arr.length);
        for(int i = 0;i < arr.length;i++){
            array[i] /= arr[0];
        }

        return array;
    }

    private static int func17a(final int [] arr)
    {
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }

    private static int[] func16b(final int [] arr, int a)
    {
        int [] array = Arrays.copyOf(arr, arr.length);
        for(int i = 0;i < arr.length;i++){
            array[i] -= a;
        }

        return array;
    }

    private static double func17b(final int [] arr)
    {
        double proiz = 1;
        for(int i = 0;i < arr.length;i++){
            proiz *= arr[i];
        }

        return proiz;
    }

    private static int func17e(final int [] arr,int k1,int k2)
    {
        int sum = 0;
        for(int i = k1;i < k2;i++){
            sum += arr[i];
        }

        return sum;
    }

    private static int func17h(final int [] arr,int k1,int k2){
        return func17e(arr, k1, k2)/(k2-k1);
    }

    private static int maxInArray(final int [] arr){
        int maxNumber=arr[0];
        int maxIndex=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(maxNumber <= arr[i])
            {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int minInArray(final int [] arr){
        int minNumber=arr[0];
        int minIndex=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(minNumber >= arr[i])
            {
                minNumber = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] changeInArray(int [] arr, int a, int b)
    {
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
