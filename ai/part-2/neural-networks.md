# Neural Networks

## Backpropagation
Backpropagation and Gradient Descent **are not** the same thing.

**Backpropagation** is used to calculate the gradient. This is used by **Gradient Descent** to update the weights of all the Logics/Nodes/Neurons.

The process of progressively going _backwards_, updating the weights until we reach the input data.

## Regularisation

### 1. Including Regularisation for each logistic unit



### 2. Dropout

Process of _leaving out_ certain number of nodes when training the model.

Stops the model learning **too well**.

### 3. Reduce Network Depth

## Hyperparameter Tuning

The process of picking the correct combination of hyperparameters:
- Can be critical to the success of a project 
- Extremely expensive (time and computational resources)

_Every time you select new hyperparameters, you have to train them again._

### Grid Search
- Process of systematically going through all possible combinations of the hyperparameters to find the best one.

### Overfit _(sort of)_

To get around this problem we usually split the data into 3 parts:

1. Training set
2. Development set
3. Test set

