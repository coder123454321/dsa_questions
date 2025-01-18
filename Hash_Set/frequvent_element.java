
import java.util.HashMap;

public class frequvent_element {
    static void frequvent_element1(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el, 1);
            }else{
                mp.put(el, mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int maxFre=0;
        int ans=0;
        // by using entryset
       for(var e:mp.entrySet()){
        if(e.getValue()>maxFre){
            maxFre=e.getValue();
            ans=e.getKey();
        }
       }
       System.out.printf("%d has the highest frequency of %d",ans,maxFre);
       //by using keyset---


       
    //    for(var key:mp.keySet()){
    //     if(mp.get(key)>maxFre){
    //         maxFre=mp.get(key);
    //         ans=key;

    //     }
    //    }
    //    System.out.printf("%d has the highest frequency of %d",ans,maxFre);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,1};
        frequvent_element1(arr);
        
    }
}
