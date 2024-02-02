import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("f:/abc.text");
        System.out.println(fis);
        // other statements
    }
    void saveFile() throws FileNotFoundException
    {
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("f:/xyz.text");
        System.out.println(text);
        System.out.println(fos);
        // other statements
    }
}

public class Throws_Keyword
{
    public static void main(String[] args) // throws FileNotFoundException
    {
        ReadAndWrite red = new ReadAndWrite();
        try
        {
            red.readFile();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            red.saveFile();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("Complet");
    }
}