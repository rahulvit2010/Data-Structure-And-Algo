#Palindrome

the process of merge sort is to divide the array into two halves, sort each half, and then merge the sorted halves back together. This process is repeated until the entire array is sorted.

Code in MergeSort.java illustrate the merge Sort Algorithm.

Time Complexity:- The time complexity of the given code is O(n), where n is the length of the input string. This is because the `checkifPalidrome` function recursively calls itself for the characters at positions (start+1, end-1) until the pointers start and end cross each other or the characters at the pointers are not equal. Since we compare each character in the string exactly once, the time complexity is O(n).

Space Complexity:- The space complexity of the code is O(n), where n is the length of the input string. This is because each recursive call creates a new stack frame that stores the current values of the function parameters and local variables. In the worst case, the function call stack may grow as large as n/2 (when the input string is a palindrome), so the space complexity is O(n).