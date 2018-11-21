import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();
        InPlaceSorts list2 = new InPlaceSorts();
        Scanner size = new Scanner(System.in);
        System.out.println("Input array size.");
        int arraysize = size.nextInt();

        String[] arrayStr = list1.generateStrings(arraysize);
        System.out.println("Bubble Sorting Strings");
        long startTime = System.nanoTime();
        list1.bubbleSort(arrayStr);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(Arrays.toString(arrayStr));
        System.out.println("This operation took: " + totalTime/1000000 + " milliseconds.");

        int[] arrayInt = list1.generateInts(arraysize);
        System.out.println("Insertion Sorting Ints");
        long startTime1 = System.nanoTime();
        list1.insertionSort(arrayInt);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("This operation took: " + totalTime1/1000000 + " milliseconds.");

        double[] arrayDouble = list1.generateDoubles(arraysize);
        System.out.println("Selection Sorting Doubles");
        long startTime2 = System.nanoTime();
        list1.selectionSort(arrayDouble);
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("This operation took: " + totalTime2/1000000 + " milliseconds.");

        int[] arrayIntMerge = list1.generateInts(arraysize);
        System.out.println("Merge Sorting Ints");
        long startTime3 = System.nanoTime();
        list2.mergeSort(arrayIntMerge);
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        System.out.println(Arrays.toString(arrayIntMerge));
        System.out.println("This operation took: " + totalTime3/1000000 + " milliseconds.");
    }
}
