def squirrel_play(temp, is_summer):
  
  if (is_summer and temp in range(60, 101)
      or not is_summer and temp in range(60, 91)):
    return True
    
  return False
