import java.text.DecimalFormat;
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

    public static void quickSortStr(String[] a, int start, int end)
    {
        int i = start;
        int j = end;
        if (j - i >= 1)
        {
            String pivot = a[i];
            while (j > i)
            {
                while (a[i].compareTo(pivot) <= 0 && i < end && j > i){
                    i++;
                }
                while (a[j].compareTo(pivot) >= 0 && j > start && j >= i){
                    j--;
                }
                if (j > i)
                    swapStr(a, i, j);
            }
            swapStr(a, start, j);
            quickSortStr(a, start, j - 1);
            quickSortStr(a, j + 1, end);
        }
    }

    public static void swapStr(String[] a, int i, int j)
    {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left -1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp2 = arr[right];
        arr[right] = arr[i + 1];
        arr[i + 1] = temp2;
        return i + 1;
    }

    public static void mergeSortStrings(String[] string1)
    {
        int n = string1.length;
        String[] tempstring = new String[n];
        mergeSortStringHelper(string1, 0,n-1,tempstring);
    }

    public static void mergeSortStringHelper(String[] string1, int strleft, int strright, String[] tempstring)
    {
        if(strleft < strright)
        {
            int strmiddle = (strleft + strright) / 2;
            mergeSortStringHelper(string1, strleft, strmiddle, tempstring);
            mergeSortStringHelper(string1, strmiddle + 1, strright, tempstring);
            mergeStrings(string1, strleft, strmiddle, strright, tempstring);
        }
    }

    public static void mergeStrings(String[] string1, int strleft, int strmiddle, int strright, String[] tempstring)
    {
        for(int i = strleft; i <= strright; i++)
        {
            tempstring[i] = string1[i];
        }
        int i = strleft;
        int j = strmiddle + 1;
        int k = strleft;
        while(i <= strmiddle && j <= strright)
        {
            if(tempstring[i].compareTo(tempstring[j]) < 0)
            {
                string1[k] = tempstring[i];
                i++;
            }
            else
            {
                string1[k] = tempstring[j];
                j++;
            }
            k++;
        }
        while(i <= strmiddle)
        {
            string1[k] = tempstring[i];
            k++;
            i++;
        }
        while(j <= strright)
        {
            string1[k] = tempstring[j];
            k++;
            j++;
        }
    }

    public static void mergeSort(int[] list1)
    {
        int n = list1.length;
        int[] temp = new int[n];
        mergeSortHelper(list1, 0, n-1, temp);
    }

    public static void mergeSortHelper(int[] list1, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int middle = (left + right) / 2;
            mergeSortHelper(list1, left, middle, temp);
            mergeSortHelper(list1, middle + 1, right, temp);
            merge(list1, left, middle, right, temp);
        }
    }

    public static void merge(int[] list1, int left, int middle, int right, int[] temp)
    {
        for(int i = left; i <= right; i++)
        {
            temp[i] = list1[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while(i <= middle && j <= right)
        {
            if(temp[i] < temp[j])
            {
                list1[k] = temp[i];
                i++;
            }
            else
            {
                list1[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= middle)
        {
            list1[k] = temp[i];
            k++;
            i++;
        }
        while(j <= right)
        {
            list1[k] = temp[j];
            k++;
            j++;
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
        int swaps = 0;
        boolean swapped = true;
        while(swapped) {
            for (int i = 0; i < list1.length - 1; i++) {
                if (list1[i].compareTo(list1[i + 1]) > 0) {
                    temp = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = temp;
                    swaps++;
                }
            }
            if(swaps > 0)
            {
                swaps = 0;
            }
            else
            {
                if(swaps == 0)
                    swapped = false;
            }
        }
    }

    public int[] generateInts(int n)
    {
        int[] list1 = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            list1[i] = random.nextInt(1000000000);
        }
        return list1;
    }

    public double[] generateDoubles(int n)
    {
        double[] list1 = new double[n];
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.###");
        for(int i = 0; i < n; i++)
        {
            list1[i] = Double.valueOf(df.format((random.nextDouble() * 100)));
        }
        return list1;
    }

    public String[] generateStrings(int n)
    {
        String[] list1 = new String[n];
        Random random = new Random();
        String atoz = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < n; i++)
        {
            byte[] array = new byte[random.nextInt(5) + 3];
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
