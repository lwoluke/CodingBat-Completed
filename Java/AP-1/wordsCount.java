public int wordsCount(String[] words, int len) {
  int count = 0;
  
  for (String word: words) {
    if (word.length() == len) {
      count++;
    }
  }
  
  return count;
}
