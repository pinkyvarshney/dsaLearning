package practiceTime;

public class RemoveOnlyOneCharacterAndMakeStringPalindrome {
    public static void main(String[] args) {

                int a[] = {1, 2, 3, 4, 2, 1};

                int low = 0;
                int high = a.length - 1;
                int count = 0;

                while (low < high) {

                    if (a[low] == a[high]) {
                        low++;
                        high--;
                    } else {
                        count++;

                        if (count > 1) {
                            System.out.println(false);
                            return;
                        }

                        // decide kis side skip karein
                        if (a[low + 1] == a[high]) {
                            low++;   // left skip
                        } else if (a[low] == a[high - 1]) {
                            high--;  // right skip
                        } else {
                            System.out.println(false);
                            return;
                        }
                    }
                }

                System.out.println(true);
            }
        }



