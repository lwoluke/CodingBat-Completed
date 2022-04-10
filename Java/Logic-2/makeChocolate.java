public int makeChocolate(int small, int big, int goal) {
  while(big > 0 && goal >= 5) {
    big--;
    goal-=5;
  }
  
  if(goal <= small) {
    return goal;
  } else {
    return - 1;
  }
}
