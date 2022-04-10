public boolean xyzMiddle(String str) {
  int frontEnd = 0;
  int backEnd = 0;
  
  if (str.length() < 3) return false;
  
  for (int i = 0; i < str.length() - 2; i++) {
    
    if (str.substring(i, i + 3).equals("xyz")) {
      frontEnd = str.substring(0, i).length();
      backEnd = str.substring(i + 3).length();
      
      if (Math.abs(frontEnd - backEnd) <= 1) {
        return true; 
      }
    }
  }
  return false;
}
