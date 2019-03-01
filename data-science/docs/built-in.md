# Built In to Python

## Indentation

Blocks in Python are defined by indents (a tab, or 4 spaces).

Blocks are used for functions and loops. The indent starts when the line before ends with a `:`

```python
for i in np.arrange(3):
    print(i)
```

```python
def do_stuff():
    print("hello")
```

## Lists

```python
my_list = [1, 2, 3]
```

```python
empty_list = []
```
### Indexes

```python
my_list[2]
```
`[3]`


### Append

```python
my_list.append(4)
```
`[1, 2, 3, 4]`



## For Loop

```python
for i in np.arrange(3):
    print(i)
```

`0` `1` `2`

```python
for (index_name) in (data_structure):
    # DO STUFF
    # data_structure[index_name]
```