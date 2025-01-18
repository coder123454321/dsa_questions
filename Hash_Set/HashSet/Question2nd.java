package HashSet;

import java.util.HashSet;

public class Question2nd {
    static  int maxNumberOnTable(int nums[]){
        int count=0;
        HashSet<Integer>table=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(table.contains(num)){
            table.remove(num);
        }else{
            table.add(num);
            count=Math.max(count, table.size());
        }
       }
        return count;
    }
    public static void main(String[] args) {
        int num[]={1,1};
        System.out.println(maxNumberOnTable(num));
    }
}
