public String theEnd(String str, boolean front) {
  if (front == false) {
    return str.substring(str.length() - 1);
  }
  return str.substring(0, 1);
}
