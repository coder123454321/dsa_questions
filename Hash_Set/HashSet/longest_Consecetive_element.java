package HashSet;

import java.util.HashSet;

public class longest_Consecetive_element {
    static int longest_Consecetive_element1st(int arr[]){
        int n=arr.length;
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
       for(int num:arr){
        hs.add(num);
       }
       int max=0;
       for(int nums:hs){
        if(!hs.contains(nums-1)){
            int curr=nums;
            int currLength=1;
            while(hs.contains(curr+1)){
                 currLength++;
                 curr++;
            }
            max=Math.max(max,currLength);
        }
       }
       return max;
    }
    public static void main(String[] args) {
        int arr[]={100,200,1,2,4,3};
        int a=longest_Consecetive_element1st(arr);
        System.out.println(a);
        
    }
}
