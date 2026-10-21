import java.util.Scanner;

public class IT26102391Lab6Q2c {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        String numbers = "";
        int count = 1;
        int sum = 0; 

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = Input.nextInt();

            numbers = numbers + num + " ";
            sum += num; 
            count++;
        }

        double average = (double) sum / 10; 

        System.out.println("\nThe numbers you entered are:");

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
    }
}