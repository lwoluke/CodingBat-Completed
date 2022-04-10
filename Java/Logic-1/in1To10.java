public boolean in1To10(int n, boolean outsideMode) {
  
  if (n >= 1 && n <= 10 && !outsideMode 
      || n >= 10 && outsideMode
      || n <= 1 && outsideMode) 
  {
    return true;
  }
  return false;
}
