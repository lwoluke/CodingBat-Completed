public int scoresAverage(int[] scores) {
  int first = average(scores, 0, scores.length / 2);
  int second = average(scores, scores.length / 2, scores.length);
  return Math.max(first, second);
}

public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    sum += scores[i];
  }
  double mean = Math.round(sum / (end - start));
  
  return (int)Math.round(mean);
}
