package practiceTime;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int []a ={10,1,4,5,7,1};
        int buy=a[0];
       int  profit=0;
        for(int i=1;i<a.length-1;i++){
            if(buy>a[i]){
                buy=a[i];
            }
            {
                int diff=a[i]-buy;
              profit=Math.max(diff,profit);
            }

        }
        System.out.println(profit);

    }
}
