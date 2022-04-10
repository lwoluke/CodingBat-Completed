public boolean xyzThere(String str) {
  if (str.startsWith("xyz")) return true;
  
  for (int i = 1; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
      return true;
    }
  }
  
  return false;
}
