# Natural Numbers

## The Peano Axioms

Axiom being a statement that is taken to be true. Think of it like a premise.

1. 0 is a natural number.
2. If _n_ is a natural number then so is _sn_.
3. A number of the form _sn_ os always different from 0.
4. Two numbers _sn_ and _sm_ are equal precisely iff _n_ and _m_ are equal.

_s_ refers to the successor of a natural number, or the next natural number. We can look at _sn_ as _s + 1_

## Induction

We have to use induction to prove things, when it will go on infinetly. 

Induction is split into 3 sections:
- Base Case: 
- Inductive Hypothesis
- Inductive Step

## Theory 1
_Given a fixed number b ≠ 0, every natural number can (uniquely) be written in the form m × b + r where m and r are natural numbers and r < b holds._

## Semi Ring Laws

A ring is an algebraic structure. Think of it as a set together with the binary operators + and ×.

### Neural elements
_a_ + 0 = _a_

_a_ × 1 = _a_

### Annihilation

_a_ × 0 = 0 

### Commutativity

_a_ + _b_ = _b_ + _a_

_a_ × _b_ = _b_ × _a_

### Associativity

(_a_ + _b_) + _c_ = _a_ + (_b_ + _c_)

(_a_ × _b_) × _c_ = _a_ × (_b_ × _c_)

### Distributivity

_a_ × (_b_ + _c_) = _a_ × _b_ + _a_ × _c_ 

## Ring Laws

These follow the semi ring laws with the addition of:

### Cancellation

_a_ + (-a) = 0

They are the same, but include the use of negatives.