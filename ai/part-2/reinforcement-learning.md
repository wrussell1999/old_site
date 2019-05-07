# Reinforcement Learning

Elements required for learning:
- Hypothesis Function
- Some Cost associated with each prediction
    - Can be used for Gradient Descent


## Agent
An **agent** is required to reach an end state in an environment.

Example:
Think of it as the car for self driving cars.

## Reward

Reward is positive when the agent does something leading towards the outcome.

Rewards is negative when the agent does something we know leads towards a bad outcome.


## Things to know

Deaks with agents that are provided with positive or negative rewards, based on how they act in an environment.

The agent's aim is to maximise the positive reward.

Agents use this to train a model, such as a Neural Network.

## Environment

The environment can be fully observable -> agent knows its environment

**OR**

The environemtncan be partially obserable -> combination of fully and partially observed state of the environment.

## Real world example
**Credit Card Fraud**

Date we need:
- What is not fraud
- Where the money went
- Amount spent
- Time spent
- What currency is it bought as

**Process of creating a model**
- Split the data into dataset
- Train it on the training set
- Test it on the test set

**NOTE**: The training set and test set can't be the same.