package collections.arrays;

/**
 * @author Matthias.Flueckiger
 */
public class ReturnRandomArrayUniqueAlain {
    public int[] generateRandomArrayWithoutDoubles(int size) {
        int a[] = new int[size];
        for (int i = size - 1; i > 0; i--) {
            a[i] = i;
        }
        for (int i = size - 1; i-- > 0; i--) {
            int j = (int) (i * Math.random());
            swap(a, i, j);
        }
        return a;
    }

    public void swap(int[] list, int pos1, int pos2) {
        int mem;
        mem = list[pos1];
        list[pos1] = list[pos2];
        list[pos2] = mem;
    }

    public static void main(String[] args) {
        ReturnRandomArrayUniqueAlain arrayUniqueAlain = new ReturnRandomArrayUniqueAlain();
        int[] randomArray = arrayUniqueAlain.generateRandomArrayWithoutDoubles(10);

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(i);
        }
    }
}
