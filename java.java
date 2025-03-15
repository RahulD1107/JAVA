import java.util.Scanner;
class java{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char []arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.next().charAt(0);
        }
          char  []unique=new char[n];
         
       
        for(int i=0;i<n;i++){
            
            int freq=0;
            for(int j=0;j<n;j++){
                 if (arr[i]==arr[j])
                  freq++;
                  }
            if(freq==1){
              System.out.print(arr[i]+ " ");
            }
        }
    }
}
