package collections.arrays.sort;

import java.util.Arrays;

/**
 * @author Matthias.Flueckiger
 */
public class BubbleSort {
    public static void bubbleSort(int[] a)
    {
        for (int i = a.length; --i >= 0;)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int t = a[j]; //swap
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{3,6,8,4,5};
        bubbleSort(arr);

    }
}
