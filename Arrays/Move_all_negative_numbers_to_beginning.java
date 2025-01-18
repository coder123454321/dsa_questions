import java.util.Scanner;
public class Move_all_negative_numbers_to_beginning {
    static void rearrange(int arr[]) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            if(arr[low]<0){
                low++;
            }else{
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrange(arr);
        PrintArray(arr);
    }
}
