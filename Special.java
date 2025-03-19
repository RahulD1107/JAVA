import java.util.*;
class Special{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.next();
        }

         String start=arr[0];
         String  end=arr[n-1];
         
        // [a,@,c,#,d,$,e]

         for(String  str:arr){
            if(str instanceof Character){
                int temp=start;
                start=end;
                end=temp;
                 
            }
            end--;
            
            
         }
         System.out.print(Arrays.toString(arr));
    
    }
}