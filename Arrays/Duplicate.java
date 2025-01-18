
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    static  void DuplicateNumber(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        HashSet<Integer>seen=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
       for(int num:arr){
        if(seen.contains(num)){
            duplicate.add(num);
        }else{
            seen.add(num);
        }
       }
       System.out.println("duplicate element is "+duplicate);
       System.out.println("seen element is"+seen);

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
        DuplicateNumber(arr);
    }
}
