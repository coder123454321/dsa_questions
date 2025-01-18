package HashSet;

import java.util.HashSet;

public class Subset_of_another_Array {
    static boolean Subset_of_another_Array1st(int arr[],int num[]){
        HashSet<Integer>hs=new HashSet<>();
        for(int nums:arr){
           hs.add(nums);
        }
        for(int nums:num){
            if(!hs.contains(nums)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={100,200,1,2,4,3};
        int arr2[]={1,2,3,45};
        System.out.println(Subset_of_another_Array1st(arr, arr2));
    }
}
