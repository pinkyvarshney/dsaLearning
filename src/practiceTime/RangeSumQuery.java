package practiceTime;

public class RangeSumQuery {
    public static void main(String[] args) {

        int a[] = {2, 3, 1, 3, 4, 5, 6};

        Range obj = new Range(a);

        System.out.println(obj.sumRange(1, 3));
    }
}

class Range {

    int[] prefix;

    // constructor
    public Range(int[] a) {
        prefix = new int[a.length];
        prefix[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}
