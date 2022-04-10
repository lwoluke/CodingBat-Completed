public String doubleChar(String str) {
  String word = "";
  
  for (int character = 0; character < str.length(); character++) {
      word = word + str.charAt(character) + str.charAt(character);
  }
  
  return word;
}
