class Solution {
    public int rob(int[] nums) {
       
	if(nums.length == 0) {
            return 0;
        }

        int[] maxValHomes = new int[nums.length];
        maxValHomes[0] = nums[0];
        if(nums.length == 1) {
            return nums[0];
        }
        maxValHomes[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            maxValHomes[i] = Math.max(maxValHomes[i - 2] + nums[i], maxValHomes[i-1]);
            
        }
        return maxValHomes[nums.length - 1];
        
    }
}
