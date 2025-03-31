import java.util.*;
class RemoveWord{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();

        List<String> arr1=new ArrayList<>(Arrays.asList(str1.split(" ")));
        List<String>arr2=Arrays.asList(str2.split(" "));

        arr1.removeAll(arr2);
        System.out.print(arr1);

    }
}