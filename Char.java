import java.util.*;
class Char{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        String  str1=scan.nextLine();
         String str2=scan.nextLine();

         List<Character>arr1=new ArrayList<>();
         for(char s:str1.toCharArray()){
            arr1.add(s);
         }
         Set<Character> arr2=new HashSet<>();
          for(char s:str2.toCharArray()){
            arr2.add(s);
         }

         arr1.removeIf(arr2::contains);
         
         for(char c:arr1){
            System.out.print(c);
         }
    }
}