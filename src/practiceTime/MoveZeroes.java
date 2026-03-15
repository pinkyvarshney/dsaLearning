package practiceTime;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[]arg) {
        int[] a = {1, 4, 0, 3, 0, 0, 2, 2};
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            if (a[low] == 0) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                high--;
            } else {
                low++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
