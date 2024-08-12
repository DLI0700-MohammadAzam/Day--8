import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = null;

        try
        {
            int result = 11/n;
            int[] arr= new int[5];
            System.out.println(arr[6]);
            if(str==null)
                throw new NullPointerException("This is a null ");


        }catch (ArithmeticException e){
            System.out.println(e);;
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
