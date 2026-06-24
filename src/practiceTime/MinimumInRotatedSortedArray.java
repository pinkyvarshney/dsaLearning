package practiceTime;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int low=0;
        int high=a.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if(a[low]>a[high]){
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        System.out.println(a[low]);
    }
}
