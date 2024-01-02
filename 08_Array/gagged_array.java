public class gagged_array {
    public static void main(String[] args){
        int nums[][] = new int[3][];  //jagged

        // Gives the number of length of array.
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
