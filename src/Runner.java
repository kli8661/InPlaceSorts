import java.util.Arrays;
public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();
        String[] arrayStr = list1.generateStrings(10);
        System.out.println("Bubble Sorting Strings");
        list1.bubbleSort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));
        int[] arrayInt = list1.generateInts(10);
        System.out.println("Insertion Sorting Ints");
        list1.insertionSort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        double[] arrayDouble = list1.generateDoubles(10);
        System.out.println("Selection Sorting Doubles");
        list1.selectionSort(arrayDouble);
        System.out.println(Arrays.toString(arrayDouble));
    }
}
