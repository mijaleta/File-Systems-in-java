import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        //use of scanner class wich is used to take input from user and parse them into standard primitive data types
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Your  name is "+name);
    }
}
