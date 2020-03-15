import java. util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        if(array==null||array.length==0){
            System.out.println(0);
        }
        int cur,res;
        cur=array[0];       //当前子向量和
        res=cur;            //存储最大的子向量和
        for(int i=1;i<array.length;i++)
        {
            //开头是负数就一直不算数，直到找到第一个整数才开始加，
            //要是全部都是负数的话，那就返回第一负数，肯定是最大和
            if(cur<0){
                cur=0;
            }
            cur=cur+array[i];
            if(cur>res){
                res=cur;
            }
        }
        System.out.println(res);
    }
}
