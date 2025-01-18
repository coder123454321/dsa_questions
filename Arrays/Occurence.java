import java.util.Scanner;

public class Occurence {
    static int Occurence_Number(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        System.out.println("enter the occuer element:");
        int count=sc.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=Occurence_Number(arr,count);
        System.out.println("occurence of the  is:"+result);
    }
}
