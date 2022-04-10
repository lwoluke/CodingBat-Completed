public boolean frontAgain(String str) {
  if (str.length() < 2) {
    return false;
  }
  String first = str.substring(0,2);
  return first.equals(str.substring(str.length() - 2));
}
