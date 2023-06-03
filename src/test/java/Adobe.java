import java.util.HashMap;
import java.util.Map;

public class Adobe {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        String s = "Welcome";
//        String arr[] = s.split("\\s");
//        for(int i = 0 ; i<arr.length; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i] , map.get(arr[i] )+1);
//            }
//            else{
//                map.put(arr[i],1);
//            }
//        }
//
//        for(Map.Entry entry : map.entrySet()){
//            System.out.println("" +entry);
//        }

        char arr[] = s.toCharArray();
        for(int i = 0 ; i<arr.length; i++){
            System.out.println("" + arr[i] + "=" + (int) arr[i] );
        }
    }
}
