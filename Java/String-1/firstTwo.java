public String firstTwo(String str) {
  if (str.length() < 3) {
    return str;
  }
  return str.substring(0, 2);
}
