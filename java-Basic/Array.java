
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc  = new Scanner(System.in);

    System.out.println("Enter Marks of Accounts: ");
    marks[0] = sc.nextInt(); //acc

     System.out.println("Enter Marks of Eco: ");
    marks[1] = sc.nextInt(); //Eco

    System.out.println("Enter Marks of BS: ");
    marks[2] = sc.nextInt(); // Bs

        System.out.println("Accounts : " + marks[0]);
        System.out.println("Economic : " + marks[1]);
        System.out.println("Business Studies : " + marks[2]);
        
    }
}
