import java.util.Scanner;
public class IT26102391Lab6Q2b {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        String numbers = "";
        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = Input.nextInt();

            numbers = numbers + num + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers.trim());
    }
}