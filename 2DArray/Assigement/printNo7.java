
public class printNo7 {

    public static int count(int nums[][], int key){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[][] = {{4,7,8},
                        {8,8,7}};

        System.out.println(count(nums, 8));
    }
}
