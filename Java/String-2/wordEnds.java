public String wordEnds(String str, String word) {
  String result = "";
  int strLen = str.length();
  int wordLen = word.length();

  for (int i = 0; i < strLen - wordLen + 1; i++) {
    String strCheck = str.substring(i, i + wordLen);
    
    if (i > 0 && strCheck.equals(word)) {
      result += str.substring(i - 1, i);
    }
    
    if (i < strLen - wordLen && strCheck.equals(word)) {
      result += str.substring(i + wordLen, i + wordLen + 1);
    }
  }

  return result;
}
