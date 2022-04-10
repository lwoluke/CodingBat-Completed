public boolean groupSumClump(int start, int[] nums, int target) {
  
  if (start >= nums.length) return target == 0;
  
  int sum = 0;
  int i = 0;
  
  for (i = start; i < nums.length; i++) {
    if (nums[start] == nums[i]) {
      sum += nums[i];    
    } else {
      break;
    }
  }
  
  if (groupSumClump(i, nums, target - sum)) return true;
  
  if (groupSumClump(i, nums, target)) return true;
  
  return false;
  
}
