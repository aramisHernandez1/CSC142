package FileWritingExamples;
import java.io.*;
import java.util.*;

public class MoreFiles {
    public static void main(String[] args) throws IOException //Due to any issue that can happen with a file you need IOExpection
    {
        File in = new File("C:\\Users\\ajdab\\OneDrive\\Documents\\GitHub\\CSC142\\FileWritingExamples\\file.txt"); //How you say you are going to acess a file.
        Scanner read = new Scanner(in); //Read file
        int lineNum = 0;

        while(read.hasNext())
        {
            System.out.println(read.nextLine());
            lineNum++;
        }

        System.out.println(lineNum);
        read.close();

    }

}
