import java.sql.JDBCType;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String s = "Yellow";
        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()
             ) {
            System.out.println("Key : " + entry.getKey()+" "+ "Value : "+ entry.getValue());
        }
    }

}
