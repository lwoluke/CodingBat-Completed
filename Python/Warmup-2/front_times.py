def front_times(str, n):
  
  if len(str) > 3:
    str = str[:3]
  
  result = ""
  
  for i in range(n):
    result += str
    
  return result
