import java.util.*;
class TwoSum{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
         int x=scan.nextInt();


         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(i+" "+j);
                }
            }
         }

    }
}