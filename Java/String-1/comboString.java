public String comboString(String a, String b) {
  String longer = "";
  String shorter = "";
  if (a.length() >= b.length()) {
    return b + a + b;
  }
  return a + b + a;
}
