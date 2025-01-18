
import java.util.HashMap;

public class Two_Sum {
    static  void TwoSum(int arr[],int target){
        int n = arr.length;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Indices: " + i + ", " + j);
                    flag=false;
                }
            }
        }
    }
    static int[] TwoSumUsing_HashMap(int arr[],int target){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]={-1};
        for(int i=0;i<n;i++){
           
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                ans=new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);

        }
        return  ans;
    }
    public static void main(String[] args) {
        int target=9;
        int arr[]={5,3,4,9};
        TwoSum(arr, target);
    }
}
