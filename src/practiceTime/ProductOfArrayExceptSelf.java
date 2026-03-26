package practiceTime;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] a={1,5,3,2,7};
        int prefix[]=new int [5];

         prefix[0]=1;
      for(int i=1;i<a.length;i++){
          prefix[i]=prefix[i-1]*a[i-1];
      }
      int result =1;
     int suffix=1;
      for(int i=a.length-2;i>=0;i--){
         suffix=suffix*a[i+1];
       prefix[i]=prefix[i]*suffix;

      }
      for (int i=0;i<a.length;i++) {
          System.out.print(prefix[i]+" ");
      }

    }
}
