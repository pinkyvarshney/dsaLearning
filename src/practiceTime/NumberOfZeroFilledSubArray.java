package practiceTime;

public class NumberOfZeroFilledSubArray {
    public static void main(String[] args) {
        int a[]={2,3,0,0,2,0,0,0,3};
        int count =0;
        int ans=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==0){
                count++;
                ans=ans+count;
            }
            else {
                count=0;
            }
        }
        System.out.println(ans);
    }
}
