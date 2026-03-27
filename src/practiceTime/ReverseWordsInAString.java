package practiceTime;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str="abbab";
        char[] ch=str.toCharArray();
       int low=0;
       int high=ch.length-1;
       while (low<high){
           char temp=ch[low];
           ch[low]=ch[high];
           ch[high]=temp;
           low++;
           high--;
       }

           System.out.print(new String(ch));

    }
}
