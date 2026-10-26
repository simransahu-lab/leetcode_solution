class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        for(int i=0; i<n; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;

            }

        }

        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna