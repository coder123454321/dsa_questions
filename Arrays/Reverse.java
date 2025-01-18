
import java.util.Scanner;
public class Reverse {
    static  void Reverse_Array(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        // Arrays.sort(arr);
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
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
        Reverse_Array(arr);
        PrintArray(arr);
    }
}
