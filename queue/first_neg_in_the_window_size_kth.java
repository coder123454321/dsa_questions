
import java.util.ArrayDeque;
import java.util.Queue;

public class first_neg_in_the_window_size_kth {
    public static void neg(Queue<Integer>q1,int k,int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-k;i++){
           boolean flag=false;
           for(int j=i;j<i+k;j++){
            if(arr[j]<0){
                q1.add(arr[j]);
                flag=true;
                break;
            }
           }
           if(!flag){
            q1.add(0);
           }
        }

    }
    public  static  void printDequeue(Queue<Integer>q1){
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q1=new ArrayDeque<>();
        int k=3;
        int arr[]={12,-1,-7,8,-15,30,16,28};
        neg(q1,k,arr);
        printDequeue(q1);
        
    }
}
