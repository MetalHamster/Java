package algorythms;

import java.util.Arrays;

public class ReturnRandomArray {
    public int[] generateRandomArray(int size, int minValue, int maxValue){
        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return arr;
    }

    public static void main(String[] args) {
        ReturnRandomArray example = new ReturnRandomArray();
        System.out.println(Arrays.toString(example.generateRandomArray(10,1,100)));

    }
}
