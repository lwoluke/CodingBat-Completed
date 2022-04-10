def alarm_clock(day, vacation):
  
  if vacation:
    if day in range(1, 6):
      return "10:00"
    else:
      return "off"
  elif not vacation:
    if day in range(1, 6):
      return "7:00"
    else:
      return "10:00"
