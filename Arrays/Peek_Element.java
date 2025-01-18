
import java.util.Scanner;

public class Peek_Element {
    static int Peek_Element1(int arr[]){
        int peek=0;
        int n=arr.length;
        if(arr.length==0) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                peek=i;
            }
        }
        return peek;
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
        int a=Peek_Element1(arr);
        System.out.println(a);

    }
}
