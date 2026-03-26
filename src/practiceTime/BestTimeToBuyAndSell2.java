package practiceTime;

public class BestTimeToBuyAndSell2 {
    public static void main(String[] args) {
        int a[]={5,3,7,3,9,2,7};
        int profit=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i+1]>a[i]){
                profit=profit+a[i+1]-a[i];
            }

        }
        System.out.println(profit);
    }
}
