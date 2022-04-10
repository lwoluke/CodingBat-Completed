def parrot_trouble(talking, hour):
  if talking and (hour > 20 or hour < 7):
    return True
  return False
