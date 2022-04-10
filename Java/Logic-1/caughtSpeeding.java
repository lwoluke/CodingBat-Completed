public int caughtSpeeding(int speed, boolean isBirthday) {
  int ticket = 0;
  
  if (speed >= 81 && isBirthday == false|| speed >= 86) {
    ticket = 2;
  } else if (speed >= 61 && isBirthday == false || speed >= 66) {
    ticket = 1;
  } else if (speed < 61 && isBirthday == false || speed < 66) {
    ticket = 0;
  }
  
  return ticket;
}
