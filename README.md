# Java Algorithms

### NOTE: This thing is still a Work in Progress. Files, instructions, and other stuff might change!
### NOTE: For more info about algorithms please read following document https://github.com/ikostan/Algorithms/blob/master/files/searchSort.pdf

## Introduction:<br/>

### Efficiency: 
Algorithmic efficiency is the measure of how well a routine can perform a computational task. One analogy for algorithmic efficiency and its dependence on hardware (memory capacity and processor speed) is the task of moving a ton of bricks from one location to another a mile a way.  If you use a Lamborghini for this job (small storage but fast acceleration), you will be able to move a small amount of bricks very quickly, but the down side is that you will have to repeat the trip multiple times.  On the other hand, if you use a flatbed truck (large storage but slow acceleration) you will be able to complete the entire project in a single run, albeit at slower pace.

### Notation: 
The expression for algorithmic efficiency is commonly referred to as “Big O” notation.  This is a mathematical representation of how the algorithm grows over time. When plotted as a function, algorithms will remain flat, grow steadily over time, or follow varying curves.

### The Pessimistic Nature of Algorithms: 
In the world of algorithm analysis, we always assume the worst case scenario.  For example, if you have an unsorted list of unique numbers and it’s going to take your routine an hour to go through it, then it is possible in the best case scenario that you could find your value on the first try (taking only a minute). But following the worst case scenario theory, your number could end up being the last one in the list (taking you the full 60 minutes to find it). When we look at efficiency, it’s necessary to assume the worst case scenario.

![GUI](https://apelbaum.files.wordpress.com/2011/10/yaacovapelbaumbigoplot_thumb.jpg?w=576&h=441?raw=true "GUI screenshot")<br/>

Ideally, when talking about any algorithm, we want the number of operations in the algorithm to increase
as slowly as possible as N increases. The best-performing algorithm is O(1), which means that the algorithm
executes in constant time. There are very few algorithms for which this is true, so the next best algorithm
is O(logN).<br/>

![GUI](https://github.com/ikostan/Algorithms/blob/master/files/BigOh.JPG?raw=true "GUI screenshot")
![GUI](https://courses.cs.vt.edu/~csonline/Algorithms/Lessons/OrderNotation/chart.gif?raw=true "GUI screenshot")


## In this project included the following search algorithms:

### -Linear search: <br/>
The simplest search algorithm is linear search. In linear search, we look at each item in the list in turn,
quitting once we find an item that matches the search term or once we’ve reached the end of the list. Our
“return value” is the index at which the search term was found, or some indicator that the search term was
not found in the list.<br/>

### -Binary search:<br/>
Binary search exploits the ordering of a list. The idea behind binary search is that each time we make
a comparison, we eliminate half of the list, until we either find the search term or determine that the term
is not in the list. We do this by looking at the middle item in the list, and determining if our search term
is higher or lower than the middle item. If it’s lower, we eliminate the upper half of the list and repeat our
search starting at the point halfway between the first item and the middle item. If it’s higher, we eliminate
the lower half of the list and repeat our search starting at the point halfway between the middle item and
the last item.

## In this project included the following sorting algorithms:

### -Bubble sort:<br/>
The idea behind bubble sort is similar to the idea behind selection sort: on each pass through the algorithm,
we place at least one item in its proper location. The differences between bubble sort and selection sort lie
in how many times data is swapped and when the algorithm terminates. Bubble sort performs more swaps
in each pass, in the hopes that it will finish sorting the list sooner than selection sort will.
Like selection sort, bubble sort works by comparing two items in the list at a time. Unlike selection sort,
bubble sort will always compare two consecutive items in the list, and swap them if they are out of order.
If we assume that we start at the beginning of the list, this means that at each pass through the algorithm,
the largest remaining item in the list will be placed at its proper location in the list.

### -Insertion sort:<br/>
This is the idea behind insertion sort. Loop over positions in the array, starting with index 1. Each new position is like the new card handed to you by the dealer, and you need to insert it into the correct place in the sorted subarray to the left of that position.<br/>

### -Selection sort:<br/>
The idea behind selection sort is that we put a list in order by placing each item in turn. In other words,
we put the smallest item at the start of the list, then the next smallest item at the second position in the
list, and so on until the list is in order.<br/>

### -Quicksort:<br/>
Quicksort is in fact a very fast sorting algorithm. We will see just how fast it is later on in this section. The
algorithm itself is a bit tricky to understand, but it works very well.
The basic idea behind quicksort is this: Specify one element in the list as a “pivot” point. Then, go
through all of the elements in the list, swapping items that are on the “wrong” side of the pivot. In other
words, swap items that are smaller than the pivot but on the right side of the pivot with items that are
larger than the pivot but on the left side of the pivot. Once you’ve done all possible swaps, move the pivot
to wherever it belongs in the list. Now we can ignore the pivot, since it’s in position, and repeat the process
for the two halves of the list (on each side of the pivot). We repeat this until all of the items in the list have
been sorted.<br/>

### -Merge sort:<br/>
Merge sort is a neat algorithm, because it’s “the sort that sorts itself”. This means that merge sort requires
very few comparisons and swaps; it instead relies on a “divide and conquer” strategy that’s slightly different
from the one that quicksort uses.<br/>
Merge sort starts by dividing the list to be sorted in half. Then, it divides each of these halves in half.
The algorithm repeats until all of these “sublists” have exactly one element in them. At that point, each
10 sublist is sorted. In the next phase of the algorithm, the sublists are gradually merged back together (hence
the name), until we get our original list back — sorted, of course.<br/>


### Summary:<br/>
• Selection sort’s advantage is that the number of swaps is O(N), since we perform at most one data
swap per pass through the algorithm. Its disadvantage is that it does not stop early if the list is sorted;
it looks at every element in the list in turn.<br/><br/>
• Bubble sort’s advantage is that it stops once it determines that the list is sorted. Its disadvantage is
that it is O(N2) in both swaps and comparisons. For this reason, bubble sort is actually the least
efficient sorting method.<br/><br/>
• Quicksort is the fastest sort: it is O(NlogN) in both the number of comparisons and the number of
swaps. The disadvantages of quicksort are that the algorithm is a bit tricky to understand, and if we
continually select poor pivots then the algorithm can approach O(N2) in the worst case.<br/><br/>
• Merge sort is as fast as quicksort: it is O(NlogN) in both swaps and comparisons. The disadvantage
of merge sort is that it requires more copying of data from temporary lists back to the “full” list, which
slows down the algorithm a bit.
