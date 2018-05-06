package my.mainui;

//java.io.* contains the input/output classes that are used to read and write 
//string data to file on the hard disk
import java.io.*;
public class Writefile{
    private FileOutputStream filename;

    Writefile(String inputfilename)
    {
        try
        {
            filename = new FileOutputStream(inputfilename,false);
        }
        catch (IOException e) {}
     }

     public void write(String item)
     {
        PrintStream output = new PrintStream(filename);
        output.println(item);
     }

     public void close()
     {
        try
        {
            filename.close();
        }
        catch (IOException e) {}
     }
}
