public class ReverseArray {

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 7, 1};
        nums = RecursiveReverse(nums, 2);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    
    public static int[] reverse(int[]input, int start, int end){
        while(start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
        return input;
    }


    public static int[] RecursiveReverse(int[] input, int start){

        if(start < input.length/2){
            int temp = input[start];
            input[start] = input[input.length-1-start];
            input[input.length-1-start] = temp;
            RecursiveReverse(input, start+1);
        }

        return input;
    }
}
