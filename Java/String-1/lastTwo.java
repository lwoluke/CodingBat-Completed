public String lastTwo(String str) {
  if (str.length() < 2) {
    return str;
  }
  String last = str.substring(str.length() - 1);
  String secLast = str.substring(str.length() - 2, str.length() - 1);
  return str.substring(0, str.length() - 2) + last + secLast;
}
