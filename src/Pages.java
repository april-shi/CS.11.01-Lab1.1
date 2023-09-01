import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = Integer.parseInt(scan.nextLine());
        int mathhaha = 100-age;

        System.out.println(age + "-year olds should read at least " + mathhaha + " pages before giving up on a book.");

    }
}
