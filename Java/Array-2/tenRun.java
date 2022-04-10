public int[] tenRun(int[] nums) {
  int tenMult = 0;
  boolean valueChange = false;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      tenMult = nums[i];
      valueChange = true;
    }
    if (valueChange) {
      nums[i] = tenMult; 
    }
  }
  return nums;
}
