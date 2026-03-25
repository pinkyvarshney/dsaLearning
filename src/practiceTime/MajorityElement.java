package practiceTime;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 1, 4, 1, 1};
        int count = 0;
        int val=0;
        for (int i = 0; i < a.length; i++){
            if (count == 0) {
                val = a[i];
                count=1;
            } else if (a[i] == val) {
                count++;
            } else {
                count--;
            }
        }
            count = 0;
            for (int i = 0; i < a.length; i++){
              if (a[i] == val) {
            count++;
        }
    }
            if (count > a.length / 2) {
                    System.out.println(val);
                }
            System.out.println("-1");
            }

        }

