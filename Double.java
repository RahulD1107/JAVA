import java.util.*;
class Double{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        System.out.print(Arrays.toString(arr));
        
       //input  is [1 ,2 ,2, 3 ,4 ]
       //output is [1,4,0,3,4]
    }
}