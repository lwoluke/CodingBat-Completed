public Map<String, String> topping2(Map<String, String> map) {
  
  if(map.get("ice cream") != null) {
    map.put("yogurt", map.get("ice cream"));
  }
  if (map.get("spinach") != null) {
    map.put("spinach", "nuts");
  }
  
  return map;
}
