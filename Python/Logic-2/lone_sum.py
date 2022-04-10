def lone_sum(a, b, c):
  
  result = 0
  
  if a != b and a != c: result += a
  if b != a and b != c: result += b
  if c != a and c != b: result += c
  
  return result
  
