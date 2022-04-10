public boolean sum28(int[] nums) {
  int sumOf2 = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      sumOf2 += nums[i];
    }
    if (i == nums.length - 1 && sumOf2 == 8) {
      return true;
    }
  }
  return false;
}
