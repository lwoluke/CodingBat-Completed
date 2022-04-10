public boolean modThree(int[] nums) {
  for (int i = 1; i < nums.length - 1; i++) {
    if (nums[i - 1] % 2 == nums[i] % 2 && 
        nums[i] % 2 == nums[i + 1] % 2) {
      return true;
    }
  }
  return false;
}
