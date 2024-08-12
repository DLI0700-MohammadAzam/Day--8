import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =input.nextInt();

        try
        {
            int result = 100/n;
            System.out.println("Result "+result);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception occurred "+e.getMessage());
        }
        finally {
            System.out.println("Executable code ");
        }
    }
}
