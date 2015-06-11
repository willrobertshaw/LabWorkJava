public class OneA {

    public static double geometricMean(int[] nums) {
        double G = 1;
        for(int i=0; i < nums.length; i++){
        	double rootNums = Math.pow(nums[i], 1.0/nums.length);
        	G = G * rootNums;
        }
        return G;
    }
    
    public static void main(String[] args){
    	int n = args.length;
    	int[] nums = new int[n];
    	for(int i=0; i < n; i++){
    		nums[i] = Integer.parseInt(args[i]);
    	}
    	System.out.println(geometricMean(nums));
    }
}
