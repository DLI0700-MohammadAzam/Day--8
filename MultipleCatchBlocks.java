import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("The division "+result);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred bcoz "+e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Oops! you have to enter an Integer "+e);
        }

    }

}
