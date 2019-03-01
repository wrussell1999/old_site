# Automata

Used to solve matching problems with regular expressions.

## Definition

### Deterministic finite automaton

Initial state and the result of each transition are specified.

A deterministic finite automaton (DFA) consists of:

- A finite set $$X$$ of states.
- An initial state $$p \in X$$.
- A transition function $$\delta: X \times \Sigma \longrightarrow X$$.
- A set of acceptiong states Acc $$\subseteq X$$

## Nondeterministic Automata (NDFA)

- Can have several initial states
- From a given state, an input can have several possible next states


$$\delta$$ is a relation but not a function.



## $$\varepsilon$$ transition

$$\varepsilon$$ is just thinking time during a transition. 

## Minimising an automaton

{% include lib/mathjax.html %}