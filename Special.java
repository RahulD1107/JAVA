import java.util.*;
class Special{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.next();
        }

        List<Integer> letter =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i].matches("[a-xA-Z]")){
                 letter.add(i);
            }
        }


      // [a ,@ ,c,#,e,$,g,%]
      //[0,2,4,6]
      //so the index of 0th the 0 consists and the index of 1 the 2 consists
      //so the 2nd place of the array the c exits and the 0th place of the array the a exits then it swap
        for(int i=0;i<letter.size()-1;i++){
            int inx1=letter.get(i);
            int inx2=letter.get(i+1);

            String  temp=arr[inx1];
            arr[inx1]=arr[inx2];
            arr[inx2]=temp;

        }
        System.out.print(Arrays.toString(arr));
    }
}