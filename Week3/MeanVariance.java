/**
 * Created by williamrobertshaw on 29/01/15.
 */
public class MeanVariance {
    public static void main(String[] args) {
        int length = args.length;

        double[] nums = new double[length];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            nums[i] = Double.parseDouble(args[i]);
            sum = sum + nums[i];
        }

        double mean = sum / length;

        double shifts = 0;

        for (int i = 0; i < length; i++) {
            shifts = shifts + Math.pow(nums[i] - mean, 2);
        }

        double var = shifts / length;

        System.out.println(mean);
        System.out.println(var);
    }
}
