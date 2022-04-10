public int[] post4(int[] nums) {
  int count = 0;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] == 4) {
      count = i + 1;
      break;
    }
  }
  int[] result = new int[nums.length - count];
  for (int j = count; j < nums.length; j++) {
    result[j - count] = nums[j];
  }
  return result;
}
