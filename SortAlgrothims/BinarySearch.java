package SortAlgrothims;

public class BinarySearch {
    //In order to use binary search your data must be sortted

    public static void main(String[] args) {
        int[] data = {-3, 0, 1, 5, 9, 13, 26, 100};
        int target = 100;
    
    }

    private static boolean search(int[] A, int target){
        int left = 0;
        int right = A.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(A[mid] == target) return true;
            
            if(A[mid] < value) left = mid +1;
            else right = mid-1;
            
            return false;
        }

        private static int recursion(int[] A, int target){
            
        }

    }
}

