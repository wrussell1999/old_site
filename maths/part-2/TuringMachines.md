# Turing Machines

## Definition

A turing machine consists of the following data:
- A finite set X of states
- An initial state _p_ ∈ X.
- A transition function 𝛿 from X to:
  - X^T (Read instructions)
  - T * X^+ (Write instructions)
  - X^+ (Right)
  - X^+ (Left)
  - X^+ (No-op)
  - V^+ (Return)
  
  
  Think of the transition function 𝛿 as a reference to the action taking place.
