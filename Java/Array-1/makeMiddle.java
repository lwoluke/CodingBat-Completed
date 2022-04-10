public int[] makeMiddle(int[] nums) {
  int first = nums.length / 2 - 1;
  int second = nums.length / 2;
  return new int[] {nums[first], nums[second]};
}
