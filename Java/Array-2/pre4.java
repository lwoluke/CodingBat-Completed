public int[] pre4(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      break;
    }
    count++;
  }
  int [] result = new int[count];
  for (int i = 0; i < result.length; i++) {
    result[i] = nums[i];
  }
  return result;
}
