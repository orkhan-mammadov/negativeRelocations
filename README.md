This solution is using PriorityQueue to keep track of negative numbers
that has been added to the total sum but not resulting in a negative sum.
Later in process, if there is a negative number that results in negative sum,
in summation operation, that number will be compared to the previous negative
numbers that has been added to the total sum and if needed, adjustments will be made
by calculating relocations. Advantage of PriorityQueue is that its insertion 
time complexity is O(logN) which is efficient for this case, and it keeps the
elements in their natural order and always keeps the smallest negative number in 
first place, which is usefull for for peek() and poll() operations with O(1) time 
complexity to get minimum negative number.
