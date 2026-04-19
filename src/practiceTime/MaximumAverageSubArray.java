package practiceTime;

public class MaximumAverageSubArray {
    public static void main(String[] args) {
int k=2;
int sum=0;
int ave=0;
int maxAve=0;
        int a[]={-1,2,3,-5,2};
        for (int i=0;i<k;i++){
            sum=sum+a[i];

        }
        ave=sum/k;
        for (int j=k-1;j<a.length-1;j++){
            sum=sum+a[j];
            ave=sum/k;
            maxAve=Math.max(ave,maxAve);
        }
        System.out.println(maxAve);

    }
}
