
import java.util.HashSet;
import java.util.Scanner;

public class Check_if_an_array_is_subset_of_another_array {
    static boolean subset_Of_another_array(int arr1[],int arr2[]){
        HashSet<Integer>hs=new HashSet<>();
        for(int num:arr1){
            hs.add(num);
        }
        for(int num:arr2){
            if(!hs.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the 1st array:");
        int n=sc.nextInt();
        System.out.println("enter the length of the 2nd array:");
        int n1=sc.nextInt();
        System.out.println("enter the first array element:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the 2nd array element:");
        int arr2[]=new int[n1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean a=subset_Of_another_array(arr2, arr2);
        System.out.println(a);
    }
}
