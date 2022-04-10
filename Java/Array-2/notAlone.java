public int[] notAlone(int[] nums, int val) {
  int[] result = new int[nums.length];
  
  if (nums.length >= 1) {
    result[0] = nums[0];
    result[nums.length - 1] = nums[nums.length - 1];
  }
  
  for (int i = 1; i < nums.length - 1; i++) {
    if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
      result[i] = Math.max(nums[i - 1], nums[i + 1]);
    } else {
      result[i] = nums[i];
    }
  }
  
  return result;
}
