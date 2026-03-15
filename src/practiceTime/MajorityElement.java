package practiceTime;

public class MajorityElement {
    public static void main(String[] args) {
        int a[]={1,2,1,3,1,4,1,1};
        int val;
        int count=0;
        for(int i=0;i<a.length-1;i++){
         if(count==0){
             val=a[i];
         }
         else if(a[i]==val){
              count++;
          }
          else{
             count--;
          }
        }

        if(count>a.length-1/2){
            System.out.println(a[i]);
        }
        System.out.println("-1");
    }
}
