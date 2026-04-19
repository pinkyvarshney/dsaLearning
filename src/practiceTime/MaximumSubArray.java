package practiceTime;

public class MaximumSubArray {
    public static void main(String[] args) {
        int a[]={-1,2,3,-5,2};
        int sum=0;
       int  maxSum=0;
        for(int i=0;i<a.length-1;i++){

            if(a[i]>sum+a[i]){
                sum=0;

            }

                sum+=a[i];
                maxSum=Math.max(maxSum,sum);


        }
        System.out.println(maxSum);
    }
}
