public boolean splitOdd10(int[] nums) {
  return recursive(0, nums, 0, 0);
}

public boolean recursive(
  int start, 
  int[] nums, 
  int group1, 
  int group2) 
{
    
  if (start >= nums.length) {
    return group1 % 10 == 0 && group2 % 2 == 1;  
  }
  
  if (recursive(start + 1, nums, group1 + nums[start], group2)) {
    return true;
  }
  
  if (recursive(start + 1, nums, group1, group2 + nums[start])) {
    return true;
  }
  
  return false;
}
