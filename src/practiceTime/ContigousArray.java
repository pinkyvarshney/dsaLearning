package practiceTime;

import java.util.HashMap;
import java.util.Map;

public class ContigousArray {
    public static void main(String[] args) {


        int num[] = {1,0,1,0,0,1};
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                sum=sum-1;

            }
            else {
                sum=sum+1;
            }
            if(mp.containsKey(sum)){
                maxLength=Math.max(maxLength,i-mp.get(sum));

            }
            else {
                mp.put(sum,i);
            }
        }
        System.out.println(maxLength);

    }
}