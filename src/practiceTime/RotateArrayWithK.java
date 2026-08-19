package practiceTime;

import java.util.Arrays;

public class RotateArrayWithK {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int low = 0;
        int high = a.length - 1;
        int k=3;
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
        int[] rev = new int[0];
        for (int i = 0; i < a.length; i++) {
            rev = new int[]{a[i]};
        }


    }
}
