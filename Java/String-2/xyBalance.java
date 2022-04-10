public boolean xyBalance(String str) {
  int lastY = str.lastIndexOf("y");
  int lastX = str.lastIndexOf("x");
  if (lastX > lastY) {
    return false;
  }
  return true;
}
