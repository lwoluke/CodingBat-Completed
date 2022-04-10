public int[] maxEnd3(int[] nums) {
  int largest = nums[2];
  if (nums[0] >= nums[2]) {
    largest = nums[0];
  }
  return new int[] {largest, largest, largest};
}
