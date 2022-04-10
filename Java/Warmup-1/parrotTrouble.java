public boolean parrotTrouble(boolean talking, int hour) {
  if (hour < 7 && talking || hour > 20 && talking) {
    return true;
  }
  return false;
}
