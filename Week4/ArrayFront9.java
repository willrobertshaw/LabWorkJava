/**
 * Created by williamrobertshaw on 05/02/15.
 */
public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums){
        boolean result = false;
        int stop;

        if(nums.length == 0){
            return false;
        }else if(nums.length < 4){
            stop = nums.length;
        }else {
            stop = 4;
        }

        for(int i = 0; i < stop; i++){
            if (nums[i] == 9){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}
