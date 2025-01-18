public class LargestSubarray_Sum {
    static int LargestSubarray_Sum_Zero(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, 5};
        int a=LargestSubarray_Sum_Zero(arr);
        System.out.println(a);

    }
}
