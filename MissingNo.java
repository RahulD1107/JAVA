import java.util.*;
class MissingNo{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
         Arrays.sort(arr);
         int last=arr[n-1];
        for(int i=0;i<last;i++){
            boolean found=false;
            
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                found=true;
                break;
                }
            }
            if(found==false){
                System.out.print(i + " ");
            }
        }
    }
}