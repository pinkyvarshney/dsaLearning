package practiceTime;

public class MissingFirstPositive {
    public static void main(String[] args) {
        int a []={1,2,4,3,5};
        int n =a.length;
        for(int i=0;i<a.length;i++){
            while(a[i]>0&&a[i]<=n&&a[a[i]-1]!=a[i]){
                int temp;
                int currentIndex=a[i]-1;
                temp=a[i];
               a[i]= a[currentIndex];
              a[currentIndex]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                System.out.println(i+1);
            }
        }
        System.out.println(n+1);
    }
}
