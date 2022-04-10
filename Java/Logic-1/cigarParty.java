public boolean cigarParty(int cigars, boolean isWeekend) {
  boolean success = false;
  if (cigars >= 40 && cigars <= 60 || isWeekend && cigars >= 40) {
    success = true;
  }
  return success;
}
