# Inductive types


## Natural Numbers
```adga
data Nat : Set where
  zero : Nat
  suc  : Nat -> Nat
```

## Lists
```adga
data List (A : Set) : Set where
  nil : List A
  cons : A -> List A -> List A 
```