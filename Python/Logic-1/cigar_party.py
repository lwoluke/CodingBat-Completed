def cigar_party(cigars, is_weekend):
  if (is_weekend and cigars >= 40 or
    not is_weekend and cigars in range(40, 61)):
    return True
    
  return False
