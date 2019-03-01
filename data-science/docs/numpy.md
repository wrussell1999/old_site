# Numpy

[Return](../data-science-home.md)

## Arrays:

```python
my_array = np.array([10,20,30])
```

Indexing:

```python
my_array[0]
```

`'10'`

This is the index for a 2D array:
```python
my_2d_array[0][1]
```

## Randomly generated array:


1 dimensional:
```python
randoms = np.random.uniform(size=x)
```

2 dimensional:

```python
randoms_2d = np.random.uniform(size=(x,y))
```

3 dimensional: 

```python
random_3d = np.random.uniform(size=(x,y,z))
```

## boolean array

For each value in the original array returns true or false to the boolean statement. This value is then put into a new array in the same index.

```python
boolean_array = randoms < 0.5
```

We can get just the items which return true in the boolean_array if we use it as the index:

```python
randoms[boolean_array]
```

## count_nonzero

Counts the number of true elements in the array

```python
np.count_nonzero(boolean_array)
```

For multiple dimensions:

```python
np.count_nonzero(boolean_array, axis=x)
```

## Append

```python
pooled = np.append(data)
```

## Mix data

```python
shuffled_data = np.array('array1', 'array2')
```


## Shuffle

```python
np.random.shuffle('array1')
```

## Arange

```python
np.arange(start, end, step)
```

Examples:

```python
np.arange(5)
```
`[0, 1, 2, 3, 4]`


```python
np.arange(3,9)
```
`[3, 4, 5, 6, 7, 8]`

```python
np.arange(3, 30, 5)
```
`[3, 8, 13, 18, 23, 28]`


## Lists (Python built in)


```python
array = np.array([10, 20, 30])

list(array)
```
`[10, 20, 30]`

### Difference to np array

- Lists can store multiple data types
- List is 1-dimensional
- Lists can contain lists