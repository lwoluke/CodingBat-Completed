public String firstHalf(String str) {
  if (str.length() < 1) {
    return str;
  }
  return str.substring(0,str.length() / 2);
}
