def string_bits(str):
  
  result = ""
  
  for char in range(0, len(str), 2):
    result += str[char]
    
  return result
