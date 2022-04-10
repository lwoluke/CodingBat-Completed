def caught_speeding(speed, is_birthday):
  
  if is_birthday:
    speed -= 5
    
  if speed in range(61, 81):
    return 1
  elif speed >= 81:
    return 2
    
  return 0
