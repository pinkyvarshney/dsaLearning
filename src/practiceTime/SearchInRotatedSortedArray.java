package practiceTime;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int a[]={5,7,9,12,1,2,4};
        int low=0;
        int high =a.length-1;
        int tar=2;
        while (low<high) {
            int mid = low + (high - low) / 2;
            if(a[mid]==tar){
                System.out.println(" found "+a[mid]+" target index "+mid);
            }
            if(a[low]>a[mid]){
                if(a[low]<a[mid]&&a[low]>tar){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            else {
                if(a[high]<a[mid]&&a[high]>tar){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }

        }
    }
}
