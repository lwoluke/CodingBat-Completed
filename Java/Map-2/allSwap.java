public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer> ();
  
  for (int i = 0; i < strings.length; i++) {
    
    String key = String.valueOf(strings[i].charAt(0));
    
    if (map.containsKey(key)) {
      
      int pos = map.get(key);
      String tmp = strings[pos];
      strings[pos] = strings[i];
      strings[i] = tmp;
      map.remove(key);
    }
    else {
      map.put(key, i);
    }
  }
  
  return strings;
}
