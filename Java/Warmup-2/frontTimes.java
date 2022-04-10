public String frontTimes(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++) {
    if (str.length() >= 3) {
      result += str.substring(0, 3);
    } else if (str.length() < 3) {
      result += str;
    }
  }
  return result;
}
