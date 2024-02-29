package FileWritingExamples;
import java.io.*;
import java.util.*;

public class CopyFileToArray {

    public static void main(String[] args) throws IOException
    {
        File input = new File("C:\\Users\\ajdab\\OneDrive\\Documents\\GitHub\\CSC142\\FileWritingExamples\\file.txt");
        Scanner read = new Scanner(input);
        int lineNum = 0;

        while(read.hasNext())
        {
            read.nextLine();
            lineNum++;
        }

        read.close();
        String[] data = new String[lineNum];
        Scanner copyRead = new Scanner(input);
        int i = 0;

        while(copyRead.hasNext())
        {
            data[i] = copyRead.nextLine();
            i++;
        }


        for(int j = 0; j < data.length; j++){
            System.out.println(data[j]);

        }

        copyRead.close();
    }
    
}
