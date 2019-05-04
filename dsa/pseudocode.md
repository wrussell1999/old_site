# Pseudocode

## Searching

### Linear Search
```
// This assumes we are given an array a of size n and a key x.

For i = 0,1,...,n-1,
    if a[i] is equal to x,
        then we have a suitable i and can terminate returning i.
If we reach this point,
    then x is not in a and hence we must terminate returning -1
```
Translated to look like a programming language, such as C or Java:
```java
for ( i = 0 ; i < n ; i++ ) {
    if ( a[i] == x ) {
        return i;
    }
}
return -1;
```

### Binary Search
```
// This assumes we are given a sorted array a of size n and a key x.
// Use integers left and right (initially set to 0 and n-1) and mid.

While left is less than right,
    set mid to the integer part of (left+right)/2, and
    if x is greater than a[mid],
        then set left to mid+1,
        otherwise set right to mid.
If a[left] is equal to x,
    then terminate returning left,
    otherwise terminate returning -1.
```
Translated to look like a programming language, such as C or Java:
```java
/* DATA */
int a = [1,3,4,4,6,17,79,81,90];
int n = 9;
int x = 79;

/* PROGRAM */
int left = 0, right = n-1, mid;
while ( left < right ) {
    mid = ( left + right ) / 2;
    if ( x > a[mid] ){
         left = mid+1;
    } else {
        right = mid;
    }
}
if ( a[left] == x ) {
    return left;
} else {
    return -1;
}
```
## Trees

### Quad-trees

**Primiative operations**
- `baseQT(value)`
- `makeQT(luqt, ruqt, llqt, rlqt)`
- `lu(qt)`
- `ru(qt)`
- `ll(qt)`
- `rl(qt)`

**Rotate**
```java
rotate(qt) {
    if ( isValue(qt) ) {
        return qt

    } else {
        return makeQT(
            rotate(rl(qt)), rotate(ll(qt)),
            rotate(ru(qt)), rotate(lu(qt)))
    }
}
```

### Binary Trees

**Primiative operations**
- `EmptyTree`
- `MakeTree(v, l, r)`
- `isEmpty(t)`
- `root(t)`
- `left(t)`
- `right(t)`  

**Derived constructor**
```java
Leaf(v) = MakeTree(v, EmptyTree, EmptyTree)
```
Can be used to make the construction simpler than using primitive operators.

_Before_
```java
t = MakeTree(8, MakeTree(3,MakeTree(1,EmptyTree,EmptyTree), MakeTree(6,EmptyTree,MakeTree(7,EmptyTree,EmptyTree))), MakeTree(11,MakeTree(9,EmptyTree,MakeTree(10,EmptyTree,EmptyTree)), MakeTree(14,MakeTree(12,EmptyTree,EmptyTree), MakeTree(15,EmptyTree,EmptyTree))))
```
_After_
```java
t = MakeTree(8, MakeTree(3,Leaf(1),MakeTree(6,EmptyTree,Leaf(7))), MakeTree(11,MakeTree(9,EmptyTree,Leaf(10)),MakeTree(14,Leaf(12),Leaf(15))))
```

**Size**
```java
size(t) {
    if ( isEmpty(t) ) {
    return 0

    } else {
        return (1 + size(left(t)) + size(right(t)))
    }
}
```
## Binary Search Trees

```java
insert(v,bst) {
    if ( isEmpty(bst) ) {
        return MakeTree(v, EmptyTree, EmptyTree)
    } elseif ( v < root(bst) ) {
        return MakeTree(root(bst), insert(v,left(bst)), right(bst))
    } elseif ( v > root(bst) ) {
        return MakeTree(root(bst), left(bst), insert(v,right(bst)))
    } else {
        error(‘Error: violated assumption in procedure insert.’)
    }
}
```

_Recursive_
```java
isIn(value v, tree t) {
    if ( isEmpty(t) ) {
        return false
    } elseif ( v == root(t) ) {
        return true
    } elseif ( v < root(t) ) {
        return isIn(v, left(t))
    } else {
        return isIn(v, right(t))
    }
}
```
_while-loop_
```java
isIn(value v, tree t) {
while ( (not isEmpty(t)) and (v != root(t)) )
if (v < root(t) )
t = left(t)
else
t = right(t)
return ( not isEmpty(t) )
}
```

```java
delete(value v, tree t) {
    if ( isEmpty(t) ) {
        error(‘Error: given item is not in given tree’)
    } else {
        if ( v < root(t) ) { // delete from left sub-tree
            return MakeTree(root(t), delete(v,left(t)), right(t));
        else if ( v > root(t) ) { // delete from right sub-tree
            return MakeTree(root(t), left(t), delete(v,right(t)));
        else { // the item v to be deleted is root(t)
            if (] isEmpty(left(t)) ) {
                return right(t)
            } elseif ( isEmpty(right(t)) ) {
                return left(t)
            } else { // difficult case with both subtrees non-empty
                return MakeTree(smallestNode(right(t)), left(t), removeSmallestNode(right(t)))
            }
        }
    }
}
```

```java
smallestNode(tree t) {
// Precondition: t is a non-empty binary search tree
    if ( isEmpty(left(t) ) {
        return root(t)
    } else {
        return smallestNode(left(t));
    }
}
```

```java
removeSmallestNode(tree t) {
// Precondition: t is a non-empty binary search tree
    if ( isEmpty(left(t) ) {
        return right(t)
    } else {
        return MakeTree(root(t), removeSmallestNode(left(t)), right(t))
    }
}
```
**Binary Search Tree or Binary Tree?**
```java
isbst(tree t) {
    if ( isEmpty(t) ) {
        return true
    } else {
        return ( allsmaller(left(t),root(t)) and isbst(left(t)) and allbigger(right(t),root(t)) and isbst(right(t)) )
    }
}
```
```java
allsmaller(tree t, value v) {
    if ( isEmpty(t) ) {
        return true
    } else {
        return ( (root(t) < v) and allsmaller(left(t),v) and allsmaller(right(t),v) )
    }
}   
```
```java
allbigger(tree t, value v) {
    if ( isEmpty(t) ) {
        return true
    } else {
        return ( (root(t) > v) and allbigger(left(t),v) and allbigger(right(t),v) )
    }
}
```

**Sorting**
```java
printInOrder(tree t) {
    if ( not isEmpty(t) ) {
        printInOrder(left(t))
        print(root(t))
        printInOrder(right(t))
    }
}
```
```java
sort(array a of size n) {
    t = EmptyTree
    for i = 0,1,...,n-1
        t = insert(a[i],t)
        printInOrder(t)
}
```

## Priority Queues and Heap Trees
Similar to the pseudocode in the notes, but written in pure Java and all works. 
<script src="https://gist.github.com/wrussell1999/954bd9dc7ea43f4cf61ce56f4ac5b24c.js"></script>

## Sorting Algorithms

## Hash Tables

## Graphs

### Dijkstra's Algorithm

**Version 1**
```java
// Input: A directed graph with weight matrix ‘weight’ and a start vertex ‘s’.
// Output: An array ‘D’ of distances as explained above.
// We begin by buiding the distance overestimates.

D[s] = 0 // The shortest path from s to itself has length zero.

for ( each vertex z of the graph ) {
    if ( z is not the start vertex s )
        D[z] = infinity // This is certainly an overestimate.
}

// We use an auxiliary array ‘tight’ indexed by the vertices,
// that records for which nodes the shortest path estimates
// are ‘‘known’’ to be tight by the algorithm.

for ( each vertex z of the graph ) {
    tight[z] = false
}

// We now repeatedly update the arrays ‘D’ and ‘tight’ until
// all entries in the array ‘tight’ hold the value true.

repeat as many times as there are vertices in the graph {
    find a vertex u with tight[u] false and minimal estimate D[u]
    tight[u] = true

    for ( each vertex z adjacent to u )
        if ( D[u] + weight[u][z] < D[z] )
            D[z] = D[u] + weight[u][z] // Lower overestimate exists.
}

// At this point, all entries of array ‘D’ hold tight estimates.
```
**Version 2** _with Priority Queue_
```java
// Input: A directed graph with weight matrix ‘weight’ and a start vertex ‘s’.
// Output: An array ‘D’ of distances as explained above.
// We begin by buiding the distance overestimates.

D[s] = 0 // The shortest path from s to itself has length zero.

for ( each vertex z of the graph ) {
    if ( z is not the start vertex s )
        D[z] = infinity // This is certainly an overestimate.
}

// Then we set up a priority queue based on the overestimates.
Create a priority queue containing all the vertices of the graph,
with the entries of D as the priorities
// Then we implicitly build the path tree discussed above.

while ( priority queue is not empty ) {
    // The next vertex of the path tree is called u.
    u = remove vertex with smallest priority from queue
    for ( each vertex z in the queue which is adjacent to u ) {
        if ( D[u] + weight[u][z] < D[z] ) {
            D[z] = D[u] + weight[u][z] // Lower overestimate exists.
            Change the priority of vertex z in queue to D[z]
        }
    }
}
// At this point, all entries of array ‘D’ hold tight estimates.
```

### Floyd's Algorithm
```java
// Store initial estimates and predecessors.
for ( each vertex s ) {
    for ( each vertex z ) {
        distance[s][z] = weight[s][z]
        predecessor[s][z] = s
    }
}

// Improve them by considering all possible shortcuts u.
for ( each vertex u ) {
    for ( each vertex s ) {
        for ( each vertex z ) {
            if ( distance[s][u]+distance[u][z] < distance[s][z] ) {
                distance[s][z] = distance[s][u]+distance[u][z]
                predecessor[s][z] = predecessor[u][z]
            }
        }
    }
}
```