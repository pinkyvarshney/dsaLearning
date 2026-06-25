package practiceTime;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CheckValidAnagramOrNot {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first value  ");
        String s=sc.nextLine();
        System.out.println("enter second value  ");
        String t=sc.nextLine();

        if(s.length()!=t.length()){
            System.out.println("false");
        }
        Map<Character,Integer> smap=new HashMap<>();
        Map<Character,Integer> tmap=new HashMap<>();
        for (char el:s.toCharArray()) {
            if (!smap.containsKey(el)) {
                smap.put(el, 1);
            } else {
                smap.put(el, smap.get(el) + 1);
            }
        }

        for (char el:t.toCharArray()){

            if(!tmap.containsKey(el)){
                tmap.put(el,1);
            }
            else {
                tmap.put(el,tmap.get(el)+1);
            }
        }
        if(tmap.equals(smap)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
