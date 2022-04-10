public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> results = new ArrayList<String>();
  
  for (String word: words) {
    if (word.length() != len) {
      results.add(word);
    }
  }
  
  return results;
}
