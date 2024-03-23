public class Palindroman {
    public static void main(String[] args){
        String word = "99";
        char[] array = stringToArray(word);
        boolean isPal = arrayCheck(array);
        System.out.println(RecursiveCheck(array, 0));
    }    

    public static void check(String word){

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()- 1 - i)){
                System.out.println(word);
            }
        }
        
    }

    public static char[] stringToArray(String word){
        char[] input = new char[word.length()];
        for(int i = 0; i<word.length(); i++){
            input[i] = word.charAt(i);
        }
        return input;
    }

    public static boolean arrayCheck(char[] word){
        for(int i = 0; i < word.length; i++){
            if(word[i] != word[word.length-1 - i]){
                return false;
            }
        }
        return true;
    }

    //Recursive way
    public static boolean RecursiveCheck(char[] input, int i){
        if(i == input.length/2) return true;
        if(input[i] != input[input.length -1 - i]){
            return false;
        }
        else return RecursiveCheck(input, i+1);

    }
}
