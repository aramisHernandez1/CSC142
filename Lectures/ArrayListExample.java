package Lectures;
import java.util.*;

public class ArrayListExample {
    //Main point of using array list is for the memory management.
    //Another good reason is they are just eaiser to use.
    public static void main(String[] args) {
        Example4();
    }

    
    private static void Example1(){
        ArrayList <String> A = new ArrayList<>(100); //Array list is similar to a list in python.
        //Size can vary and you can initalize the size if you want.
        //Anytime you have brackets [] at the end and not {} it means its a list not array.

        A.add("Animal");
        A.add("Bee");
        A.add("Fish");

        System.out.println(A);
        System.out.println(A.size());
        System.out.println(A.get(0)); //No negative indexing in array list.
        System.out.println(A.remove(1));
        System.out.println(A);
    }


    private static void Example2(){
        ArrayList<Character> B = new ArrayList<>();
        B.add('@');
        System.out.println(B);
    }

    private static void Example3(){
        ArrayList<Double> B = new ArrayList<>();
        B.add(0.5d);
        B.add(1.8d);
        B.add(2.0d);

        System.out.println(B);
    }

    private static void Example4(){
        ArrayList<String> A = new ArrayList<>();

        A.add("A");
        A.add("B");
        A.add("C");
        A.add("D");
        A.add("C");

        System.out.println(A);

        A.add(0, "F"); //Dpnt overide the first element just move it over and add one.

        System.out.println(A);

        //Remove will only remove element.
    }

    private static void Example5(){
        ArrayList<String> A = new ArrayList<>();
        A.add("1");
        A.add("2");
        A.add("3");

        A.set(0, "1000");//Overides the element instead of moving it.
        System.out.println(A);

    }

    private static void Example6(){
        String[] A = {"W", "E", "S", "N"};
        ArrayList<String> Alist = new ArrayList<String>(Arrays.asList(A)); //How to change a array to an arraylist

        String[] B = Alist.toArray(new String[4]); //Copies it the other way around.


    }
}
