def combo_string(a, b):
  
  longer = a
  shorter = b
  
  if len(b) > len(a):
    longer = b
    shorter = a
    
  return shorter + longer + shorter
