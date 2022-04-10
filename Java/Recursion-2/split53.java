public boolean split53(int[] nums) {
  return recursive(0, nums, 0, 0); 
}

public boolean recursive(
  int start, 
  int[] nums, 
  int mult3, 
  int mult5) 
{
   if (start >= nums.length) {
        return mult3 == mult5;
   }
   
  if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
    return recursive(start + 1, nums, mult3 + nums[start], mult5);
  }
   
  if (nums[start] % 5 == 0 && nums[start] % 3 != 0) {
    return recursive(start + 1, nums, mult3, mult5 + nums[start]);
  }
  
  return recursive(start + 1, nums, mult3 + nums[start], mult5) 
  || recursive(start + 1, nums, mult3, mult5 + nums[start]);

}
