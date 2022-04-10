public String stringX(String str) {
  String result = "";
  if (str.length() == 0) return str;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x' && i > 0 && i < str.length() - 1) {
      continue;
    }
    result += str.charAt(i); 
  }
  return result;
}
