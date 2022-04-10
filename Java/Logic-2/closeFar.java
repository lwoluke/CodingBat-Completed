public boolean closeFar(int a, int b, int c) {
  int abDiff = Math.abs(a - b);
  int acDiff = Math.abs(a - c);
  int bcDiff = Math.abs(b - c);
  
  if (abDiff <= 1 && acDiff >= 2 && bcDiff >= 2) {
    return true;
    
  } else if (acDiff <= 1 && abDiff >= 2 && bcDiff >= 2) {
    return true;
    
  }
  
  return false;
}
