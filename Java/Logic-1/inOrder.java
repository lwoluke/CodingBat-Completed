public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (b > a && c > b || c > b && bOk) return true;
  return false;
}
