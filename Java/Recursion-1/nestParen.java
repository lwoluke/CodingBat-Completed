public boolean nestParen(String str) {
  
  if (str.length() <= 1 && !str.equals("")) return false;
  
  if (str.length() == 2 && str.equals("()") || str.equals("")) return true;
  
  if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
    return nestParen(str.substring(1, str.length() - 1));
  }
  
  return nestParen(str.substring(1));
}
