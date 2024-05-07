public class MinValue {
    static int minValue(int nums[]){
        int min = nums[0];
        for(int i=0; i < nums.length -1; i++){
            if(nums[i] < min){
                min = nums[i];
            }

        }
        return  min;
    }

    public static void main(String[] args) {
        int nums[] = {5, 9, 3, 15, 1, 2};
        System.out.println(minValue(nums));


    }
}
