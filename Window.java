public class Window {
    
    public static void main(String[] args){
        int size = 2;

        for(int i = 0; i < size; i++){
            if(i < size){
                System.out.println("********");
                for(int j = 0; j < size; j++){
                    System.out.println("|    |   |");
                }
            }
            else{
                System.out.println("********");
            }


        }


    }
    
}
