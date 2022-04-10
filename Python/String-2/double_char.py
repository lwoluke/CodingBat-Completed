def double_char(str):
  
  result = ""
  
  for char in range(len(str)):
    result += str[char] + str[char]
    
  return result
