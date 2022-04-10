def has22(nums):
  
  for i in range(len(nums) - 1):
    if nums[i] == nums[i+1] == 2:
      return True
      
  return False
