import java.util.*;

public class first {
    public static void count(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','c'};
        String str="tony";
        String str2= new String("stark");

        Scanner sc=new Scanner(System.in);
        String name,name2;
        System.out.println("Enter the String: ");
        name=sc.nextLine();
        name2=sc.nextLine();
        System.out.println(name+" "+name2);
        System.out.println(name.charAt(3));
        count(name);
    }
}
