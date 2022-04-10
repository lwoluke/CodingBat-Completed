public int[] copyEvens(int[] nums, int count) {
  int[] results = new int[count];
  int pos = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0 && count > 0) {
      results[pos] = nums[i];
      pos++;
      count--;
    }
  }
  
  return results;
}
