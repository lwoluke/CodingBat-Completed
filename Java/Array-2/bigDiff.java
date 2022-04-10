public int bigDiff(int[] nums) {
  int largest = nums[0];
  int smallest = nums[0];
  for (int i = 1; i < nums.length; i++) {
    largest = Math.max(largest, nums[i]);
    smallest = Math.min(smallest, nums[i]);
  }
  return largest - smallest;
}
