public String plusOut(String str, String word) {
  String result = "";
  int i = 0 ;

  while(i < str.length() ) {
    if (str.substring(i).startsWith(word)) {
      result += word;
      i += word.length();
    } else {
      result += "+" ;
      i++;
    }
  }

  return result;
}
