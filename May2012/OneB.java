public class OneB {
  
    public static int longestSeq(int[] nums, int n) {
        int max = 0;
        int curLength = 0;
        for(int i=0; i<nums.length; i++){
        	if(nums[i] == n){
        		curLength++;
        		if(curLength > max){
        			max = curLength;
        		}
        	}
        	else curLength = 0;
        }
        return max;
    }
    
    public static void main(String[] args){
    	int n = args.length;
    	int[] nums = new int[n];
    	for(int i=0; i<n; i++){
    		nums[i] = Integer.parseInt(args[i]);
    	}
    	System.out.println(longestSeq(nums, 0));
    }
}
