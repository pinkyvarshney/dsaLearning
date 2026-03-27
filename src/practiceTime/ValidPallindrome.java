package practiceTime;

public class ValidPallindrome {
    public static void main(String[] args) {
    int a[]={1,2,3,3,1};

        int low = 0;
        int high = a.length-1;
        boolean isPallindrome=true;
        while (low<high){
            if(a[low]==a[high]){
                low++;
                high--;

            }
            else {

                isPallindrome=false;
                break;
            }
        }
        if(isPallindrome) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

}