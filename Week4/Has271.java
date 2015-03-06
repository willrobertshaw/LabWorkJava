/**
 * Created by williamrobertshaw on 06/03/15.
 */
public class Has271 {
    public static boolean has271(int[] nums){
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] + 5 == nums[i+1] && nums[i] - 1 == nums[i+2]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int n = args.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i ++){
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(has271(nums));
    }
}
