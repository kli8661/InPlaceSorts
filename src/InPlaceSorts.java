import java.nio.charset.Charset;
import java.util.Random;

public class InPlaceSorts {

    public static void insertionSort(int[] list1)
    {
        for(int i = 1; i < list1.length; i++)
        {
            int min = list1[i];
            int j = i - 1;
            while(j >= 0 && list1[j] > min)
            {
                list1[j + 1] = list1[j];
                j = j - 1;
            }
            list1[j + 1] = min;
        }
    }

    public static void selectionSort(double[] list1)
    {
        double min;
        int pos;
        for(int i = 0; i < list1.length; i++)
        {
            pos = i;
            min = list1[i];
            for(int j = i; j < list1.length; j++)
            {
                if(list1[j] < min)
                {
                    pos = j;
                    min = list1[j];
                }
            }
            list1[pos] = list1[i];
            list1[i] = min;
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

    public int[] generateInts(int n)
    {
        int[] list1 = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = random.nextInt(10000);
        }
        return list1;
    }

    public double[] generateDoubles(int n)
    {
        double[] list1 = new double[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = (random.nextDouble() * 10);
        }
        return list1;
    }

    public String[] generateStrings(int n)
    {
        String[] list1 = new String[n];
        Random random = new Random();
        String atoz = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < n; i++)
        {
            byte[] array = new byte[random.nextInt(8) + 3];
            new Random().nextBytes(array);
            String generatedString = generateRandom(atoz);
            list1[i] = generatedString;
        }
        return list1;
    }

    public String generateRandom(String atoz)
    {
        Random random = new Random();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < 7; i ++)
        {
            int rand = random.nextInt(atoz.length());
            res.append(atoz.charAt(rand));
        }
        return res.toString();
    }


}
