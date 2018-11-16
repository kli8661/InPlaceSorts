import java.util.Arrays;
public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();
        String[] arrayStr = list1.generateStrings(6);
        list1.bubbleSort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));
        int[] arrayInt = list1.generateInts(6);
        list1.insertionSort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        double[] arrayDouble = list1.generateDoubles(6);
        list1.selectionSort(arrayDouble);
        System.out.println(Arrays.toString(arrayDouble));
    }
}
