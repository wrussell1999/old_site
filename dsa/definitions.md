# Definitions

## Quad Tree

Either of the following:
- A root node with a value (Base case)
- A root without a value and four quad tree children. (Inductive step) 

## Binary Tree

Either of the following:
- The empty tree `EmptyTree` (Base case).
- It consists of a node and two binary trees (Inductive step).
    - The left subtree.
    - The right subtree.

_sub trees are always simipilar than the original one. This eventually results in an empty tree_

## Binary Search Tree

Either of the following:
1. Empty.
2. Satisfies the following:
    - All values occurring in the left subtree are smaller than that of the root.
    - All values occurring in the right subtree are larger than that of the root.
    - The left and right subtrees are themselves binary search trees.

_Binary tree with node values that are the search keys_

## B-tree

A tree, of order n, which satisfies the following:
- Every node has at most n children.
- Every non-leaf node (expect the root node) has at least n/2 children.
- The root node if it is not a leaf node, has at least two children.
- A non-leaf node with c children contains `c-1` search keys which act as separation values to divide its sub-trees.
- All leaf nodes appear in the same level, and carry information.

## Complete Binary Tree

A binary tree is complete if:
- every level, expect possibly the last, is completely filled.
- All the leaves on the last level are placed as far to the **left** as possible.

## Binary Heap Tree

A complete binary tree which is either empty or satisifies the following conditions:
- The priority of the root is higher than (or equal to) that of its children.
- The left and right subtrees of the root are heap trees.

## Bionomial Tree

Defined recursively as follows:
- A binomial tree of order 0 is a single node
- A binomial tree of order _k_ has a root node with children that are roots of binomial trees of orders _k_ - 1, _k_ - 2, ..., 2, 1, 0 (in that order).

_Binomial tree of order _k_:
- Height: _k_
- Contains: 2^_k_ nodes