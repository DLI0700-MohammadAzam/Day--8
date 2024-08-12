import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TryAndCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        int result=0;

        try
        {
             result  = 100/n;

        }catch (ArithmeticException e){
        System.out.println(" ArithmeticException  occurred0"+e.getMessage());
        }
        System.out.println("Result "+result);



        }
    }
