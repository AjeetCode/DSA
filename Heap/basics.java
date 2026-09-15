/*
Q: What is a Min Heap?
=> A Min Heap is a complete binary tree in which every parent is smaller than or equal to its children,
    so the minimum element is always at the root.
Q: How do you implement a Min Heap in Java?
=> Java's PriorityQueue provides Min Heap behavior by default.
1. PriorityQueue<Integer> pq = new PriorityQueue<>();

Q: What is a Max Heap?
=> A Max Heap is a complete binary tree in which every parent is greater than or equal to its children, 
    so the maximum element is always at the root.
Q: How do you implement a Max Heap in Java?
=> We can use PriorityQueue with Collections.reverseOrder().
1. PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
*\


/*
1. add() vs offer() in Queue:
- add() → inserts element; if it fails → throws exception, add() → O(log n).
- offer() → inserts element; if it fails → returns false, offer() → O(log n).

2.
- poll() → removes & returns the highest-priority element; if empty → returns null
- remove() → removes & returns the highest-priority element; if empty → throws exception
Complexity: Both → O(log n).

3.  peek(),	Returns top element, doesn't remove,	O(1)
4.  isEmpty(),	Checks whether queue is empty,	O(1)
5.  size(),	Returns number of elements,	O(1)
6.  contains(),	Checks if element exists,	O(n)
7.  clear(),	Removes all elements,	O(n)
*\


/*
    => minheap
    1. PriorityQueue<Integer> pq = new PriorityQueue<>();
    2. PriorityQueue<int[]> = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    3. PriorityQueue<int[]> = new PriorityQueue<>((a,b) -> a[1] - b[1]);

    => maxheap
    1. PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    2. PriorityQueue<int[]> = new PriorityQueue<>((a,b) -> b[0] - a[0]);
    3. PriorityQueue<int[]> = new PriorityQueue<>((a,b) -> b[1] - a[1]);

*\


