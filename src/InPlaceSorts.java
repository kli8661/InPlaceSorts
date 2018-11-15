import java.util.Random;

public class InPlaceSorts {

    public static void insertionSort(int[] list1)
    {
        for(int i = 1; i < list1.length; i++)
        {
            int current = list1[i];
            int j = i - 1;
            while(j >= 0 && list1[j] > current)
            {
                list1[j + 1] = list1[j];
                j = j - 1;
            }
            list1[j + 1] = current;
        }
    }

    public static void selectionSort(double[] list1)
    {
        for(int i = 0; i < list1.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < list1.length; j++)
            {
                if(list1[j] < list1[min])
                {
                    min = (int)list1[j];
                }
                double temp = list1[min];
                list1[min] = list1[i];
                list1[i] = temp;
            }
        }
    }

    public static void bubbleSort(String[] list1)
    {
        String temp;
        for (int i = 0; i < list1.length - 1; i++)
        {
            if (list1[i].compareTo(list1[i + 1]) > 0)
            {
                temp = list1[i];
                list1[i] = list1[i + 1];
                list1[i + 1] = temp;
            }
        }
    }

    public void generateInts(int n)
    {
        int[] list1 = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = random.nextInt(10000);
        }
    }

    public void generateDoubles(int n)
    {
        double[] list1 = new double[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = (random.nextDouble() * 10);
        }
    }

    public void generateStrings(int n)
    {
        String[] list1 = new String[n];
        for(int i = 0; i < n; i++)
        {

        }
    }
}
