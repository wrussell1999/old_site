# pandas

[Return](/data-science-home.md)

Works with CSV files:
```python
data = pd.read_csv('csv_file.csv')
```

Works with TAB files
```python
data = pd.read_table('tab_file.tab')
```

## Shape

This gets the dimensions of the data frame.

```python
data.shape
```

## Columns

This gives us all the column names.

```python
data.columns
```

## Series

Gets the data from one column. This is a Series: 

```python
slice = data['column_name']
```

## Boolean Series

We can get a Series of boolean values by comparing each value in a Series against a value:

```python
boolean_series = column_name > value
```

## Unique 

 Displays the different types of data in the dataset (doesn't show repeats):

```python
slice.unique()
```

## Loc

We can use a boolean series to select rows from the main data frame.

```python
boolean_data = data.loc[boolean_series]
```

## Describe

This will show numerical data for the boolean_data

```python    
boolean_data.describe()

```
## Length/Count

This gives you the number of rows:

```python
len(column_name)
```

This gives us all the rows that have values (not NaN):

```python
column_name.count()
```

## Median

This will return the median value for a row, if there are no invalid characters:

```
np.median(column_name)
```

## Plotting

This uses matplotlib but is a nicer way of expressing it:

```python
column_name.hist()
```

Normally it looks like this:

```python
plt.hist(column_name)
```

## Bins

This is a parameter for

```python
plt.hist(column_name, bins=[0, 10, 20, 30, 40, 50, 100])
```

## Scatter

This will plot a scatter graph from the columns passed as a parameter:

```python
plt.scatter(column_name1, column_name2)
```

It can be written much easier:

```python
data.plot.scatter('column_name1', 'column_name2')
```

### Parameters
Colour scale:

```python
c='column_name'
```

Size of points plotted:

```python
s='data["column_name"]**4'
```

## Scatter Matrix

```python
pd.plotting.scatter_matrix(data, figsize[10,10]);
```

## Head

Head displays the first 5 rows by default:

```python
data.head()
```

You can specify how many rows you want by passing the value as a parameter:

*This will show 10 rows*

```python
data.head(10)
```

## Desired Columns

```python
desired_columns = ['column_name1', 'column_name2'] # As many or little columns as you want 
separate_table = data[desired_columns]
```