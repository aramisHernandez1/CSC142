package Lectures;
import java.io.*;

public class ArrayIntoFile {
    public static void main(String[] args) throws IOException //Whwen accessing a file must have throws IOException
    {
        String[] A = {"West", "East", "South", "North"};

        PrintWriter out = new PrintWriter("testingcsc142.txt"); //Used to write to the file.

        for(int i = 0; i<A.length; i++){
            out.println(A[i]);

        }
        out.close();
    }
}
