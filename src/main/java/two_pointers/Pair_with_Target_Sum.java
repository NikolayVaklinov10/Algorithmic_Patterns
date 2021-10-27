package two_pointers;

public class Pair_with_Target_Sum {


        public static int[] search(int[] arr, int targetSum){

            int left = 0, right=arr.length-1;
            while (left < right){
                int currentSum = arr[left] + arr[right];
                if(currentSum == targetSum){
                    return new int[] {left, right}; // found the pair
                } else if (targetSum > currentSum){
                    left++; // we need a pair with bigger sum
                } else {
                    right--; // the pair have to be smaller
                }
            }
            return new int[]{-1, -1};
        }

    public static void main(String[] args) {

    }
}
