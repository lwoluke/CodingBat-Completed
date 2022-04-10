def string_splosion(str):
  
  result = ""
  count = 1
  
  for i in range(len(str)):
    result += str[:count]
    count += 1
    
  return result
