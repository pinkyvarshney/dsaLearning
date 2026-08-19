package practiceTime;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int a[]={3,4,2,1,5,8};
        int low=0,high=a.length-1;
       int maxLen =0,area;
while (low<high){

    if(a[low]<a[high]){
        area=(high-low)*Math.min(a[low],a[high]);
        maxLen=Math.max(maxLen,area);
        low++;
    }
    else {
        area=(high-low)*Math.min(a[low],a[high]);
        maxLen=Math.max(maxLen,area);
        high--;
    }
}
        System.out.println(maxLen);
    }
}
