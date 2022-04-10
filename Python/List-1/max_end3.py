def max_end3(nums):
  
  max_val = nums[0]
  
  if (nums[2] > max_val):
    max_val = nums[2]
    
  return [max_val, max_val, max_val]
