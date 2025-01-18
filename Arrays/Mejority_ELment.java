
import java.util.HashSet;
import java.util.Scanner;

public class Mejority_ELment {
    static void Mejority_ELment1(int arr[]){
        int n = arr.length;
        HashSet<Integer>hs=new HashSet<>();
        int count=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                count++;
                hs.add(count);
            }
            i++;
            j--;
        }
        System.out.println(hs);

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
        Mejority_ELment1(arr);
    }

}
