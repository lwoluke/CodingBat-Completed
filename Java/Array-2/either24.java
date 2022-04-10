public boolean either24(int[] nums) {
  boolean two2 = false;
  boolean four4 = false;
  
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 2 && nums[i + 1] == 2) {
      two2 = true;
    }
    if (nums[i] == 4 && nums[i + 1] == 4) {
      four4 = true;
    }
  }
  return two2 != four4;
}
