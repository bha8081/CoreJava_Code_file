import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally_FileInput {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = null;
        try
        {
                // fis = new FileInputStream("F:/BHAVESH 6th sem.pdf");
                fis = new FileInputStream("d:/abc.text");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        finally
        {

            int a = 60;
            int b = 20;
            int c;
            c = a + b;

            //  cleanup here
            if (fis != null)
            {
                fis.close();
            }
            System.out.println("file closed");
            System.out.println(c);
        }
    }
}
