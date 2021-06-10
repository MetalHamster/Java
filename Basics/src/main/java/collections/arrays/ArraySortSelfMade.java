package collections.arrays;

import java.util.Arrays;

public class ArraySortSelfMade {
    private int[] a;
    private int maxValue;
    private int minValue;

    public ArraySortSelfMade(int MAX_SIZE, int minValue, int maxValue){
        a = new int[MAX_SIZE];
        this.minValue= minValue;
        this.maxValue = maxValue;
    }

    public int randomNum(){
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }

    public void randomArr(){
        for (int i=0; i< a.length; i++) {
            int random = randomNum();
            boolean doubleValue = false;

            for (int j = 0; j < a.length; j++) {
                if (random == a[j]){
                    doubleValue = true;
                    i--;
                    break;
                }
            }

            if (doubleValue ==false){
                a[i] =random;
            }

        }
    }

    @Override
    public String toString() {
        return "arraytools.ArraySortSelfMade{" +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public void swap(){
        //swap
        for (int z = 0; z < a.length-1; z++) {
            int tempPos1 = a[z];
            int tempPos2 = a[(z+1)];

            if (tempPos1 > tempPos2) {
                a[z] = tempPos2;
                a[(z+1)] = tempPos1;
                System.out.println(toString());
            }
        }
        /* CHECK
        i = pos1
        j = pos2
        */
        for (int i = 0; i < a.length-1; i++) {
            for (int j=i; j < a.length-1;j++) {
                if (a[i] > a[j+1]){
                    swap();
                }
            }
        }
    }

    public static void main(String[] args) {
        ArraySortSelfMade random = new ArraySortSelfMade(20,1,20);

        random.randomArr();
        random.swap();
    }
}
