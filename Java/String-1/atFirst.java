public String atFirst(String str) {
  if (str.length() <= 0) {
    return "@@";
  } else if (str.length() <= 1) {
    return str.substring(0,1) + "@";
  } 
  return str.substring(0,2);
}
