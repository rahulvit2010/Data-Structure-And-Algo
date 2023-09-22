package com.rahul.ds.practice.array.DistanceIdenticalDiagram;

import java.util.HashMap;

public class Solution {
  public int solution(String S) {
    int N = S.length();
    HashMap<String, Integer> digramToPosition = new HashMap<>();
    int maxDistance = -1;

    for (int i = 0; i < N - 1; i++) {
      String currentDigram = S.substring(i, i + 2);

      if (digramToPosition.containsKey(currentDigram)) {
        int previousPosition = digramToPosition.get(currentDigram);
        int currentDistance = i - previousPosition;

        if (currentDistance > maxDistance) {
          maxDistance = currentDistance;
        }
      } else {
        digramToPosition.put(currentDigram, i);
      }
    }

    return maxDistance > 0 ? maxDistance : -1;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    String S1 = "aabcaabcabda";
    String S2 = "aaa";
    String S3 = "codility";
    String S4 = "aakmaakmakda";

    System.out.println(solution.solution(S1)); // Output: 7
    System.out.println(solution.solution(S2)); // Output: 1
    System.out.println(solution.solution(S3)); // Output: -1
    System.out.println(solution.solution(S4));
  }
}

