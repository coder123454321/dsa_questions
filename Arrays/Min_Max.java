
import java.util.Scanner;

public class Min_Max{
    public static void Min_Max_array(int arr[]){
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];

            }else if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("max element in the array is: " + max);
        System.out.println("min element in the array is: " + min);
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
        Min_Max_array(arr);
    }
}