import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {

    static void readFile() throws Exception
    {
        try(FileReader reader = new FileReader("fileNotFound.txt")){

            reader.read();
        }catch (Exception e)
        {
            System.out.println("--------- Executed 1st ---------");
            System.out.println(""+e.getCause());
            throw new Exception("IOException occurred ",e);
        }
    }

    static void test() throws Exception
    {
        try{

            readFile();
        }catch(Exception e)
        {
            System.out.println("--------- Executed 2nd ---------");
            System.out.println(""+e.getCause());
            throw new Exception("Arithmetic Exception",e);
        }
    }

    public static void main(String[] args) {
        try{
            test();
        }catch (Exception e){
            System.out.println("--------- Executed last ---------");
            System.out.println("Exception cause  "+e.getCause());
            System.out.println("The original cause of the exception '"+e.getCause()+"'");
        }
    }
}
