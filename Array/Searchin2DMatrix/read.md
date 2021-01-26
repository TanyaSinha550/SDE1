Search in 2D Matrix

GFG :-
1) Row-wise elements are sorted
2) Column-wise elements are sorted

App1 
Tranverse through nested loop and search for the element
Time Complexity- O(n*m)

App2
As row are sorted , do binary search for each row
Time Complexity - O( n * log m )

App2
Use pointer as rows and columns are sorted.
Time Complexity- O(N)


LeetCode 
1) Row-wise elements are sorted
2) Column-wise elements are sorted
3) First elements of row is greater than the last element of  previous row


App -
Doing Binary Search as all elements are sorted 
Time Complexity - O(log (n*m))









