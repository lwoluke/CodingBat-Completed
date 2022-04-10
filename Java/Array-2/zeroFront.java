public int[] zeroFront(int[] nums) {
  int zeroCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      nums[i] = nums[zeroCount];
      nums[zeroCount] = 0;
      zeroCount++;
    }
  }
  return nums;
}
