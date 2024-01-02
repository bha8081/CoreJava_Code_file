public class multi_Dimensional{
    public static void main(String[] args) {
        int nums[][] = new int[4][5];
// Math.random are use to give default value automatic.
// 100 will give the dubble digit value,if you want to Single digit value then you will pass the 10 place of 100.  
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

// inhense the loop.
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }        

    }
}