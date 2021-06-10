package collections.arrays;

import java.util.Arrays;

public class SwapArray {
    private int[] arr = new int[]{3,4,1,7,6};

    public void swap(int pos1, int pos2){
        int tempPos1 = arr[pos1];

        arr[pos1] = arr[pos2];
        arr[pos2] = tempPos1;
    }

    @Override
    public String toString() {
        return "arraytools.ArraySwap{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }


    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray();

        System.out.println(swapArray);
        swapArray.swap(1,2);
        System.out.println(swapArray);
    }
}
