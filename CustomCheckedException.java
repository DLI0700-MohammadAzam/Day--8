import java.util.Scanner;


public class CustomCheckedException {
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
            throw new InvalidAgeException("Age is Invalid");
        else
            System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter age ");
        int age = input.nextInt();
        try {
            validate(age);
        } catch (InvalidAgeException e) {
            System.out.println(""+e);
//            throw new RuntimeException(e);
        }
    }
}
