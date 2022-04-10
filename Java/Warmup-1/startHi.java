public boolean startHi(String str) {
  if(str.length() > 1 && str.substring(0,2).equals("hi")) {
    return true;
  }
  return false;
}
