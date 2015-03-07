package Week5;

/**
 * Created by williamrobertshaw on 07/03/15.
 */
public class DivisibleBy2 {
    public
    static void main(String nums[]) {
        int low = Integer.parseInt(nums[0]);
        int hi = Integer.parseInt(nums[1]);
        if (low <= hi) {
            for(int i = low; i <= hi; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println(low + " cannot be greater than " + hi);
        }
    }
}
