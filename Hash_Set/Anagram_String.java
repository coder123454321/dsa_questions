
import java.util.HashMap;

public class Anagram_String {
    static  void Anagram_String1stApporach(String str1,String str2){
        HashMap<Character,Integer> mp1=new HashMap<>();
        HashMap<Character,Integer>mp2=new HashMap<>();
        if(str1.length()!=str2.length()){
            System.out.println("this string is not a alagrams due to length");
        }
        for(int i=0;i<str1.length();i++){
            if(!mp1.containsKey(str1.charAt(i))){
                mp1.put(str1.charAt(i), 1);
            }else{
                mp1.put(str1.charAt(i), str1.charAt(i)+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!mp2.containsKey(str2.charAt(i))){
                mp2.put(str2.charAt(i), 1);
            }else{
                mp1.put(str2.charAt(i), str2.charAt(i)+1);
            }
        }
        if(mp1.equals(mp2)){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
    static boolean Anagram_String2ndApproach(String str1,String str2){
        HashMap<Character,Integer>hs=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
           hs.put(ch,hs.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!hs.containsKey(ch)){
                return  false;
            }
            hs.put(ch,hs.get(ch)-1);
            if(hs.get(ch)==0){
                hs.remove(ch);
            }
        }
        if(hs.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="anagrem";
        String str2="nagaram";
        // Anagram_String1stApporach(str1, str2);
        boolean n=Anagram_String2ndApproach(str1, str2);
        System.out.println(n);
    }
}
