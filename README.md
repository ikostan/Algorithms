# Java Algorithms

### NOTE: This thing is still a Work in Progress. Files, instructions, and other stuff might change!

#### In this project included the following internal search algorithms:

-Linear search: 
The simplest search algorithm is linear search. In linear search, we look at each item in the list in turn,
quitting once we find an item that matches the search term or once we’ve reached the end of the list. Our
“return value” is the index at which the search term was found, or some indicator that the search term was
not found in the list.

-Binary search:
Binary search exploits the ordering of a list. The idea behind binary search is that each time we make
a comparison, we eliminate half of the list, until we either find the search term or determine that the term
is not in the list. We do this by looking at the middle item in the list, and determining if our search term
is higher or lower than the middle item. If it’s lower, we eliminate the upper half of the list and repeat our
search starting at the point halfway between the first item and the middle item. If it’s higher, we eliminate
the lower half of the list and repeat our search starting at the point halfway between the middle item and
the last item.

#### In this project included the following internal sorting algorithms:

-Bubble sort:
The idea behind bubble sort is similar to the idea behind selection sort: on each pass through the algorithm,
we place at least one item in its proper location. The differences between bubble sort and selection sort lie
in how many times data is swapped and when the algorithm terminates. Bubble sort performs more swaps
in each pass, in the hopes that it will finish sorting the list sooner than selection sort will.
Like selection sort, bubble sort works by comparing two items in the list at a time. Unlike selection sort,
bubble sort will always compare two consecutive items in the list, and swap them if they are out of order.
If we assume that we start at the beginning of the list, this means that at each pass through the algorithm,
the largest remaining item in the list will be placed at its proper location in the list.

-Insertion sort:

-Selection sort:
The idea behind selection sort is that we put a list in order by placing each item in turn. In other words,
we put the smallest item at the start of the list, then the next smallest item at the second position in the
list, and so on until the list is in order.

-Quicksort:
Quicksort is in fact a very fast sorting algorithm. We will see just how fast it is later on in this section. The
algorithm itself is a bit tricky to understand, but it works very well.
The basic idea behind quicksort is this: Specify one element in the list as a “pivot” point. Then, go
through all of the elements in the list, swapping items that are on the “wrong” side of the pivot. In other
words, swap items that are smaller than the pivot but on the right side of the pivot with items that are
larger than the pivot but on the left side of the pivot. Once you’ve done all possible swaps, move the pivot
to wherever it belongs in the list. Now we can ignore the pivot, since it’s in position, and repeat the process
for the two halves of the list (on each side of the pivot). We repeat this until all of the items in the list have
been sorted.

-Merge sort:
Merge sort is a neat algorithm, because it’s “the sort that sorts itself”. This means that merge sort requires
very few comparisons and swaps; it instead relies on a “divide and conquer” strategy that’s slightly different
from the one that quicksort uses.
Merge sort starts by dividing the list to be sorted in half. Then, it divides each of these halves in half.
The algorithm repeats until all of these “sublists” have exactly one element in them. At that point, each
10 sublist is sorted. In the next phase of the algorithm, the sublists are gradually merged back together (hence
the name), until we get our original list back — sorted, of course.


### Summary: two O(N2
) sorts (selection sort and bubble sort), and two
O(NlogN) sorts (quicksort and merge sort). Each sorting algorithm has its advantages and disadvantages:
• Selection sort’s advantage is that the number of swaps is O(N), since we perform at most one data
swap per pass through the algorithm. Its disadvantage is that it does not stop early if the list is sorted;
it looks at every element in the list in turn.
• Bubble sort’s advantage is that it stops once it determines that the list is sorted. Its disadvantage is
that it is O(N2
) in both swaps and comparisons. For this reason, bubble sort is actually the least
efficient sorting method.
• Quicksort is the fastest sort: it is O(NlogN) in both the number of comparisons and the number of
swaps. The disadvantages of quicksort are that the algorithm is a bit tricky to understand, and if we
continually select poor pivots then the algorithm can approach O(N2
) in the worst case.
• Merge sort is as fast as quicksort: it is O(NlogN) in both swaps and comparisons. The disadvantage
of merge sort is that it requires more copying of data from temporary lists back to the “full” list, which
slows down the algorithm a bit.
