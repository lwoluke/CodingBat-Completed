public int[] midThree(int[] nums) {
  int first = nums.length / 2 - 1;
  int second = nums.length / 2;
  int third = nums.length / 2 + 1;
  return new int[] {nums[first], nums[second], nums[third]};
}
