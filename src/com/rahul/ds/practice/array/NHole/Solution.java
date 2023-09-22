package com.rahul.ds.practice.array.NHole;

import java.util.Arrays;

public class Solution {
  public int solution(int[] A) {
    Arrays.sort(A);
    int N = A.length;
    int left = 1; // Minimum possible length of the boards (since it has to be a positive integer)
    int right = A[N - 1] - A[0]; // Maximum possible length of the boards

    int result = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (canCoverWithBoards(A, mid)) {
        result = mid;
        right = mid - 1; // Search for smaller lengths to find the minimum
      } else {
        left = mid + 1; // Search for larger lengths
      }
    }

    return result;
  }

  private boolean canCoverWithBoards(int[] A, int length) {
    int boards = 2;
    int currentPosition = A[0] + length;

    for (int i = 1; i < A.length; i++) {
      if (A[i] > currentPosition) {
        boards--;
        currentPosition = A[i] + length;
      }
    }

    return boards >= 1;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] A1 = {11, 20, 15};
    int[] A2 = {15, 20, 9, 11};

    System.out.println(solution.solution(A1)); // Output: 4
    System.out.println(solution.solution(A2)); // Output: 5
  }
}
