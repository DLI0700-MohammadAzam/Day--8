import java.util.Scanner;

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class CustomUncheckedExceptions  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt() ;
        try {


            if (n < 0) throw new NegativeNumberException("Negative number is not allowed");
        }catch (NegativeNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }





}
