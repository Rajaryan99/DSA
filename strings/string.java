import java.util.*;

public class string {

    public static void printChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");


        //String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        // name  = sc.next();
        System.out.println("Enter any String/ name/ brnad or anything: ");
        name  = sc.nextLine();
        System.out.println(name);

        String firstName = "raj";

        String fullName = firstName + " " + name;
        // System.out.println(fullName);

        printChar(fullName);

    }
}
