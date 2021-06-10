package collections.arrays;

import java.util.Arrays;

public class ReturnRandomArrayUnique {

    public int[] randomArrayUnique(int minValue, int maxValue, int size){
        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++) {
            int random =(int) (Math.random() * (maxValue - minValue + 1) + minValue);
            boolean doubleValue = false;

            for (int j = 0; j < arr.length; j++) {
                if (random == arr[j]){
                    doubleValue = true;
                    i--;
                    break;
                }
            }

            if (doubleValue ==false){
                arr[i] =random;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        ReturnRandomArrayUnique example = new ReturnRandomArrayUnique();

        System.out.println(Arrays.toString(example.randomArrayUnique(1, 10, 10)));
    }
}
