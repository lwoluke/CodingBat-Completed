def make_chocolate(small, big, goal):
  
  big *= 5
  
  if goal >= big:
    remainder = goal - big
  else:
    remainder = goal % 5
  
  if remainder <= small:
    return remainder
    
  return -1
