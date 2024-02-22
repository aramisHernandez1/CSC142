public class Exam1Q2 {

    public static void main(String[] args) {
        int[] data = {};

        data = Permute(data);

        if(data != null){

            for(int i = 0; i < data.length; i++){
                System.out.print(data[i] + " ");
            }
        }
        
        else System.out.print("Error: Please input values in your array.");
    }
    

    //Sort in decreasing index order.
    private static int[] Permute(int[] array){
        if(array.length < 1) return null;

        int temp = array[0];

        for(int i = 1; i < array.length; i++){ //Start at one because we have first index, and to avoid negative index.
            array[i-1] = array[i];
        }

        array[array.length-1] = temp; //Move first original element to the last index.

        return array;
    }
}
