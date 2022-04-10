public boolean endOther(String a, String b) {
  String aLower = a.toLowerCase();
  String bLower = b.toLowerCase();
  String longer = aLower;
  String shorter = bLower;
  
  if (a.length() < b.length()) {
    longer = bLower;
    shorter = aLower;
  }
  
  if (longer.endsWith(shorter)) {
    return true;
  }
  
  return false;
}
