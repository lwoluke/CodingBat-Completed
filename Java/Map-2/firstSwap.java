public String[] firstSwap(String[] strings) {
  TreeMap<Character, Integer> tm = new TreeMap<>();
  
  for (int i = 0; i < strings.length; i++) {
    char cur = strings[i].charAt(0);
    
    if (tm.containsKey(cur)) {
      int mapping = tm.get(cur);
      
      if (mapping == -1) {
        continue;
        
      } else {
        String temp = strings[mapping];
        strings[mapping] = strings[i];
        strings[i] = temp;
        tm.replace(cur, -1);
      }
    } else {
      tm.put(cur, i);
    }
  }
  
  return strings;
}
