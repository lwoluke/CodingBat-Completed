public int sum67(int[] nums) {
  int sum = 0;
  boolean stop = false;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6)
      stop = true;
    if (stop == false)
      sum += nums[i];
    if (nums[i] == 7 && stop == true)
      stop = false;
  }
  return sum;
}
