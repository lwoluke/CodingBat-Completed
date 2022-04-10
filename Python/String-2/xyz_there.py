def xyz_there(str):
  
  if str[:3] == "xyz":
    return True
  
  for i in range(len(str) - 3):
    if str[i] != "." and str[i+1:i+4] == "xyz":
      return True
      
  return False
