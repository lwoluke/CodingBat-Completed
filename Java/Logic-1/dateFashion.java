public int dateFashion(int you, int date) {
  int value = 0;
  if (you <= 10 && date <= 10) {
    if (you >= 8 && date > 2|| date >= 8 && you > 2) {
      value = 2;
    } else if (you <= 2 || date <= 2) {
      value = 0;
    } else {
      value = 1;
    }
  }
  return value;
}
