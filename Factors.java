import java.util.*;
class Factors{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
       
       int n=scan.nextInt();
       int []arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
       }
       int fact[]=new int[n];
       int freq[]=new int[n];
       int c=0;
       for(int i=0;i<n;i++){
         int count=0;
        for(int j=1;j<=arr[i];j++){
          
        if(arr[i]%j==0){
           count++;
            }
        }
         freq[c]=count;
         fact[c]=arr[i];
         c++;
           
         }

         for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(freq[j]<freq[j+1]){

                    int tempfreq=freq[j];
                    freq[j]=freq[j+1];
                    freq[j+1]=tempfreq;

                    int tempfac=fact[j];
                    fact[j]=fact[j+1];
                    fact[j+1]=tempfac;
               }
            }

         }
         System.out.print(Arrays.toString(fact));


     }


    }
