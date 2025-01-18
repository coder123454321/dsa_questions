package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class targetSum {
    static boolean targetSum1st(int num[],int target){
        HashSet<Integer>hs=new HashSet<>();
        Arrays.sort(num);
        int n=num.length;
        for(int i=0;i<n;i++){
            int complement=target-num[i];
            if(hs.contains(complement)){
                return true;
            }
            hs.add(num[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int target=-2;
        int arr[]={0,-2,-2};
        System.out.println(targetSum1st(arr, target));
    }
}
