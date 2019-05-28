# Inductive types


## Natural Numbers
```adga
data Nat : Set where
  zero : Nat
  suc  : Nat -> Nat
```

## Lists
```agda
data List (A : Set) : Set where
  nil : List A
  cons : A -> List A -> List A 
```

### Empty-check
```agda
empty : {A : Set} -> List A -> Boolean
empty nil = true
empty (cons x xs) = false

or
empty : {A : Set} -> List A -> Boolean
empty nil = true
empty _ = false
```

### Length of a list
```agda
len : {A : Set} -> List A -> Nat
len nil         = zero
len (cons _ xs) = suc (len xs)
```

### Appending two lists
```agda 
append : {A : Set} -> List A -> List A -> List A
append nil         ys = ys
append (cons x xs) ys = cons x zs where
  zs = append xs ys
```

### Reversing a list
```
rev : {A : Set} -> List A -> List A 
rev nil = nil
rev (cons x xs) = append (rev xs) (cons x nil)
```

### Filtering a list
```agda
filter-zeros : List Nat -> List Nat
filter-zeros nil = nil
filter-zeros (cons x xs) = if (is-zero x) xs' (cons x xs') where
  xs' = filter-zeros xs

filter-evens : List Nat -> List Nat
filter-evens nil = nil
filter-evens (cons x xs) = if (is-even x) xs' (cons x xs') where
  xs' = filter-evens xs

filter-primes : List Nat -> List Nat
filter-primes nil = nil
filter-primes (cons x xs) = if (is-prime x) xs' (cons x xs') where
  xs' = filter-primes xs


{- using -} 
if : {A : Set} -> Boolean -> A -> A -> A
if true  x  _ = x
if false _ y = y

```

### Split
```agda
split : {A : Set} -> (A -> Bool) -> List A -> Prod (List A) (List A)
split p nil = pair nil nil 
split p (cons x xs) = if (p x) (pair (cons x ys) zs) 
                               (pair ys (cons x zs)) where
   xs' = split p xs
   ys  = proj1 xs'
   zs  = proj2 xs'
```

### Interleaving
```agda
intlv : {A : Set} -> List A -> List A -> List A
intlv nil ys = ys
intlv xs nil = xs
intlv (cons x xs) (cons y ys) = cons x (cons y (intlv xs ys))
```

### Rotate
```
rotate : {A : Set} -> List A -> Nat -> List A
rotate nil _ = nil
rotate xs zero = xs
rotate (cons x xs) (suc n) = rotate (append xs (cons x nil)) n
```