import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();
        InPlaceSorts list2 = new InPlaceSorts();
        Scanner size = new Scanner(System.in);
        System.out.println("Sorting algorithms are ordered from fastest to slowest for your sanity.");
        System.out.println("Printed out the arrays are commented out, you can put the line back in if you want to see the array.");
        System.out.println("Input array size for all arrays.");
        int temp = size.nextInt();

        System.out.println("Tim Sorting Ints");
        int[] arrayIntTim = list2.generateInts(temp);
        long starttime3 = System.nanoTime();
        list2.timSort3(arrayIntTim,1000);
        long endtime3 = System.nanoTime();
        long totaltime3 = endtime3 - starttime3;
        System.out.println("This operation took: " + totaltime3/1000000 + " milliseconds.");
        System.out.println(Arrays.toString(arrayIntTim));
        System.out.println();

        System.out.println("Quick Sorting Ints");
        int[] arrayIntQuick = list2.generateInts(temp);
        long starttime = System.nanoTime();
        list2.quickSort(arrayIntQuick,1,arrayIntQuick.length-1);
        long endtime = System.nanoTime();
        long totaltime = endtime - starttime;
        System.out.println("This operation took: " + totaltime/1000000 + " milliseconds.");
        System.out.println();

        System.out.println("Quick Sorting Strings");
        String[] arrayStrQuick = list2.generateStrings(temp);
        long starttime1 = System.nanoTime();
        list2.quickSortStr(arrayStrQuick,1,arrayStrQuick.length-1);
        long endtime1 = System.nanoTime();
        long totaltime1 = endtime1 - starttime1;
        System.out.println("This operation took: " + totaltime1/1000000 + " milliseconds.");
        System.out.println();

        System.out.println("Merge Sorting Ints");
        int[] arrayIntMerge = list1.generateInts(temp);
        long startTime3 = System.nanoTime();
        list2.mergeSort(arrayIntMerge);
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        //System.out.println(Arrays.toString(arrayIntMerge));
        System.out.println("This operation took: " + totalTime3/1000000 + " milliseconds.");
        System.out.println();

        System.out.println("Merge Sorting Strings");
        String[] arrayMergeStrings = list2.generateStrings(temp);
        long startTime4 = System.nanoTime();
        list2.mergeSortStrings(arrayMergeStrings);
        long endTime4 = System.nanoTime();
        long totalTime4 = endTime4 - startTime4;
        //System.out.println(Arrays.toString(arrayMergeStrings));
        System.out.println("This operation took: " + totalTime4/1000000 + " milliseconds.");
        System.out.println();

        System.out.println("Insertion Sorting Ints");
        int[] arrayInt = list1.generateInts(temp);
        long startTime1 = System.nanoTime();
        list1.insertionSort(arrayInt);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        //System.out.println(Arrays.toString(arrayInt));
        System.out.println("This operation took: " + totalTime1/1000000 + " milliseconds.");
        System.out.println();

        System.out.println("Selection Sorting Doubles");
        double[] arrayDouble = list1.generateDoubles(temp);
        long startTime2 = System.nanoTime();
        list1.selectionSort(arrayDouble);
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        //System.out.println(Arrays.toString(arrayDouble));
        System.out.println("This operation took: " + totalTime2/1000000 + " milliseconds.");
        System.out.println();

        /*
        System.out.println("Bubble Sorting Strings");
        String[] arrayStr = list1.generateStrings(temp);
        long startTime = System.nanoTime();
        list1.bubbleSort(arrayStr);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        //System.out.println(Arrays.toString(arrayStr));
        System.out.println("This operation took: " + totalTime/1000000 + " milliseconds.");
        */

        size.close();
    }
}
