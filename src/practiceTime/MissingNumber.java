package practiceTime;

public class MissingNumber {
    public static void main(String[] args) {

        int a[] = {1, 3, 2, 6, 5, 7, 8};
        int n = a.length + 1;
        int sum = n*(n + 1) / 2;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        int missing = sum - sum1;
        System.out.println(missing);

    }


}
