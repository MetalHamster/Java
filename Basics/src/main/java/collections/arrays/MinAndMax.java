package collections.arrays;

public class MinAndMax {
    int[] arr = new int[]{13, 5, 10, 44, 9};

    public static void main(String[] args) {
        //int minInArr=0;
        MinAndMax minAndMax = new MinAndMax();
        System.out.println(minAndMax.maxForLoop());
        System.out.println(minAndMax.maxForLoopMath());
        System.out.println(minAndMax.maxEnhancedForLoop());
        System.out.println(minAndMax.minForLoop());
        System.out.println(minAndMax.minEnhancedForLoop());
    }

    public int maxForLoopMath() {
        int maximal = 0;
        for (int i = 0; i < arr.length; i++) {
            maximal = Math.max(arr[i], maximal);
        }
        return maximal;
    }

    public int maxEnhancedForLoop() {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int maxForLoop() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int minForLoop() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int minEnhancedForLoop() {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
