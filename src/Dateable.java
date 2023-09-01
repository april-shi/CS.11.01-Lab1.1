import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = Integer.parseInt(scan.nextLine());
        int math1 = 7+ (age/2);
        String output = age + "-year olds should date somebody who is at least " + math1 + " years old.";
        System.out.println(output);

    }
}
