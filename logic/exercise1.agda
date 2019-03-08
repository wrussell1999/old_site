data Unit : Set where
  empty : Unit
  
data Void : Set where

data Boolean : Set where
  true false : Boolean

data Prod (A B : Set) : Set where
  pair : A -> B -> Prod A B

data Sum (A B : Set) : Set where
  left  : A -> Sum A B
  right : B -> Sum A B


Prop = Set 

data Truth : Prop where

data Falsity : Prop where

data _and_ (A B : Prop) : Prop where

infixl 6 _and_

data _or_ (A B : Prop) : Prop where

infixl 5 _or_

not : Prop -> Prop 
not A = A -> Falsity

{-- Rules of Logic --}

postulate
  andEl  : {P Q : Prop}   -> P and Q -> P
  andEr  : {P Q : Prop}   -> P and Q -> Q
  andI   : {P Q : Prop}   -> P -> Q -> P and Q
  orE    : {P Q R : Prop} -> P or Q -> (P -> R) -> (Q -> R) -> R
  orIl   : {P Q : Prop}   -> P -> P or Q
  orIr   : {P Q : Prop}   -> Q -> P or Q
  EFQ    : {P : Prop}     -> Falsity -> P
  DNE    : {P : Prop}     -> (not (not P)) -> P
  f      : {A1 A2 : Set}  -> A1 -> A2
  f'     : {A2 A1 : Set}  -> A2 -> A1
  g      : {B1 B2 : Set}  -> B1 -> B2
  g'     : {B1 B2 : Set}  -> B2 -> B1


data week-days : Set where
  monday tuesday wednesday thursday friday : week-days

data triples (A B C : Set) : Set where
  triple1 : A -> B -> C -> triples A B C

data Sums (A B C : Set) : Set where
  first : A -> Sums A B C
  second : B -> Sums A B C
  third : C -> Sums A B C