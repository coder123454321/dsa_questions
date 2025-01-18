import java.util.Scanner;

public class Cycle_Rotate_array {
    static void Cycle_Rotate_array_by_one_Postion(int arr[]){
        int n=arr.length;
        int last=arr[n-1];
        for(int i=0;i<=n;i++){
            arr[i]=arr[i-1];
            arr[0]=last;
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
        System.out.println("Original array:");
        PrintArray(arr);
        Cycle_Rotate_array_by_one_Postion(arr);;
        System.out.println("Reverse array:");
        PrintArray(arr);
    }
}
