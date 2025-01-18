
import java.util.HashMap;

public class Isomorphic {
    static  boolean  isIsomorphic(String s,String t){
        HashMap<Character,Character>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch1=s.charAt(i);
            char tch2=t.charAt(i);
            if(mp.containsKey(sch1)){
                if(mp.get(sch1)!=tch2){
                    return false;
                }
            }else if(mp.containsValue(tch2)){
                return  false;
            }else{
                mp.put(sch1, tch2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="aaba";
        String str2="xxye";
        boolean n=isIsomorphic(str1, str2);
        System.out.println(n);
    }
}
