public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  
  for (String word: words) {
    if (!word.equals(target)) {
      count++;
    }
  }
  
  String[] results = new String[count];
  int pos = 0;
  
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      results[pos] = words[i];
      pos++;
    }
  }
  
  return results;
}
