public String starOut(String str) {
  String result = "";

  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == '*') continue;
    if (i > 0 && str.charAt(i - 1) == '*') continue;
    if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
    
    result += str.charAt(i);
  }

  return result;
}
