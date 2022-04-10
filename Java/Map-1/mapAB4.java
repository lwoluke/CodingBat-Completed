public Map<String, String> mapAB4(Map<String, String> map) {
  
  if (map.get("a") != null && map.get("b") != null) {
    if (map.get("b").length() < map.get("a").length()) {
      map.put("c", map.get("a"));
    } 
    if (map.get("b").length() > map.get("a").length()) {
      map.put("c", map.get("b"));
    } 
    if (map.get("b").length() == map.get("a").length()) {
      map.put("a", "");
      map.put("b", "");
    } 
  }
  
  return map;
}
