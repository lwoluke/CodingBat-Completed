def make_bricks(small, big, goal):
  
  while big > 0 and goal >= 5:
    goal -= 5
    big -= 1
    
  if small >= goal or goal == 0:
    return True
    
  return False
