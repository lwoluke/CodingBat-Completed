def close_far(a, b, c):
  
  a_b_diff = abs(a-b)
  a_c_diff = abs(a-c)
  b_c_diff = abs(b-c)
  
  if (a_b_diff <= 1 and a_c_diff >= 2 and b_c_diff >= 2
    or a_c_diff <= 1 and a_b_diff >= 2 and b_c_diff >= 2):
    return True
    
  return False
