public boolean squirrelPlay(int temp, boolean isSummer) {
  boolean play = false;
  
  if (temp >= 60 && temp <= 90 || isSummer && temp >= 60 && temp <= 100) {
    play = true;
  }
  return play;
}
