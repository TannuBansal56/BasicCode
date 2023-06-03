import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Frequency {

    public static Map.Entry<Character,Integer> secondMostFrequent(String s ){
        HashMap<Character,Integer> map  = new HashMap<Character,Integer>();
        for(int i =0 ; i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && s.charAt(i)!=' '){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        int largest = 0;
        int secondLargest = 0;
        Map.Entry<Character,Integer> y = null;
       Set<Map.Entry<Character,Integer>> set = map.entrySet();
        for(Map.Entry<Character, Integer> x : set){
            if(largest< x.getValue()){
                largest = x.getValue();
            }
        }

        for(Map.Entry<Character, Integer> x : set){
            if(secondLargest < x.getValue() && x.getValue()!=largest){
                secondLargest = x.getValue();
                y = x;
            }
        }
        return y;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        Map.Entry<Character,Integer> x = secondMostFrequent(s);
        assert x != null;
        System.out.println("Character : " + x.getKey());
        System.out.println("Frequency : " + x.getValue());

    }
}
