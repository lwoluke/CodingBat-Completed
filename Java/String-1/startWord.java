public String startWord(String str, String word) {
  if (str.length() < 1) {
    return "";
  }
  String compare1 = str.substring(1);
  String compare2 = word.substring(1);
  if (str.length() >= 1 && compare1.startsWith(compare2)) {
    return str.substring(0, word.length());
  }
  return "";
}
