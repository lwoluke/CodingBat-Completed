def sum13(nums):

  result = 0
  i = 0
  
  while i < len(nums):
    if nums[i] == 13:
      i += 1
    else:
      result += nums[i]
    i += 1
    
  return result
