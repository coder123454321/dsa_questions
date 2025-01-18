
import java.util.HashMap;

public  class P1{
    static void HashMapExa(){
        HashMap<String,Integer>mp=new HashMap<>();
        mp.put("Akash",18);
        mp.put("ankur",29);
        mp.put("Aditya",28);
        mp.put("Prabhat",25);
        mp.put("Amit",16);
        mp.put("Yash",20);
        System.out.println(mp);
        System.out.println(mp.get("Amit"));
        mp.put("Amit",24);
        System.out.println(mp);
        System.out.println(mp.get("akesh"));
        // traverse in hash/map----
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        

    }
    public static void main(String[] args) {
        HashMapExa();
    }
}