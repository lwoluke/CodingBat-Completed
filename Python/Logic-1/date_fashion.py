def date_fashion(you, date):
  if you <= 2 or date <= 2:
    return 0
  
  if you in range(8, 11) or date in range(8, 11):
    return 2
  
  return 1
