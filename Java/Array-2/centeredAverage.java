public int centeredAverage(int[] nums) {
  int biggest = nums[0];
  int smallest = nums[0];
  int sum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    biggest = Math.max(biggest, nums[i]);
    smallest = Math.min(smallest, nums[i]);
    sum += nums[i];
  }
  sum = sum - biggest - smallest;
  sum = sum / (nums.length - 2);
  return sum;
}
