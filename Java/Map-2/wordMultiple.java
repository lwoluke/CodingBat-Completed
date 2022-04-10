public Map<String, Boolean> wordMultiple(String[] strings) {
  String result = "";
  Map<String, Boolean> map = new HashMap<String, Boolean> ();
  for (int i = 0; i < strings.length; i++) {
    if (map.containsKey(strings[i])) {
      map.put(strings[i], true);
    } else {
      map.put(strings[i], false);
    }
  }
  return map;
}
