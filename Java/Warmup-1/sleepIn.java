public boolean sleepIn(boolean weekday, boolean vacation) {
  boolean tf = false;
  if (weekday && !vacation) {
    tf = false;
  } else {
    tf = true;
  }
  return tf;
}
