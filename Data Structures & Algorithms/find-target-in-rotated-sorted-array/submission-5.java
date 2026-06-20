class Solution {
    public int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length - 1;
        int mp = 0;

        while (lp <= rp) {
            mp = (lp + rp) / 2;
            int diffLeft = Math.abs(target - nums[lp]);
            int diffRight = Math.abs(target - nums[rp]);
            if (nums[mp] == target) {
                return mp;
            } else if (diffRight < diffLeft) {
                if (mp > 0 && mp < nums.length - 1) {
                    diffLeft = Math.abs(target - nums[mp - 1]);
                    diffRight = Math.abs(target - nums[mp + 1]);
                    if (diffLeft < diffRight
                        && Math.abs(target - nums[mp]) < Math.abs(target - nums[rp])) {
                        rp = mp - 1;
                    } else {
                        lp = mp + 1;
                    }
                } else {
                    lp = mp + 1;
                }

            } else {
                if (mp > 0 && mp < nums.length - 1) {
                    diffLeft = Math.abs(target - nums[mp - 1]);
                    diffRight = Math.abs(target - nums[mp + 1]);
                    if (diffLeft > diffRight
                        && Math.abs(target - nums[mp]) < Math.abs(target - nums[lp])) {
                        lp = mp + 1;
                    } else {
                        rp = mp - 1;
                    }
                } else {
                    rp = mp - 1;
                }

            }
        }
        return -1;
    }
}
