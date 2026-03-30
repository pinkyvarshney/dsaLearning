package practiceTime;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int a[]={3,4,2,1,5,8};
        int low=0,high=a.length-1;
       int maxLen =0,area;
while (low<high){
    area=(high-low)*Math.min(a[low],a[high]);
    maxLen=Math.max(maxLen,area);
    if(a[low]<a[high]){
        low++;
    }
    else {
        high--;
    }
}
        System.out.println(maxLen);
    }
}
