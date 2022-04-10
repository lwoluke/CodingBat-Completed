public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
  if (!isMorning && !isMom && !isAsleep 
      || isMom && !isAsleep) 
  {
    return true;
  } 
  return false;
}
