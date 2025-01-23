# Differences between Arrays and ArrayLists in Java

## Array Functionality
Arrays can be used to contain multiple values of a primitive type, such as int, double, boolean, char, etc. this
functionality is useful, but it has some serious limitations.

First, an array is limited in its size. It is created with a set size which limits the number of elements that may be
contained by an array. In order to store additional values, the array must be recreated with a larger array and be
reinitialized with the original elements.

Second, when elements are "removed" from the middle of an array, the remaining contents are unaffected. If the ordering
of the elements are important, then the programmer is responsible for shifting the contents to ensure that the structure
is consistent to expectations. Additionally, the value "removed" doesn't really get removed, the programmer must set the
to a Null or placeholder value to indicate value is not present (such as 0 for integers).

Third, the array has some built-in functions: 
 - sort - Sort the elements contained in the array so that they are arranged in ascending order
 - binarySearch - Search the array for specified object, integer, char, double, etc and return the index of the value or -1 if not found
 - copyOf - Create a copy of the array with the same elements contained. This also allows to truncate (shorten, losing elements past the index) or expand (lengthen, adding padding such as 0, null, etc.)
 - equals - Compare array to another array and return true if the other array is equal to this array.
 - fill - Fills the entire or a part of an array with the given value, useful for some pre-initialization such as setting a boolean[] to all true or false 
 - toString - Creates a String representation of the array, which can be useful for things such as logging.
 - length - Returns the number of elements that may be contained by the array.

Some benefits of arrays is that they are compute and memory efficient as it has well-defined limitations that cannot be
exceeded, memory is pre-allocated for the exact array.

## ArrayList Functionality
ArrayLists have some similarities to Arrays, in that it may contain multiple values, but has Array's greated limitation
removed.

First, ArrayLists do not have a set size limit like arrays. When ArrayLists are initalized, the size does not need to be
specified. 

Second, accessing and manipulating elements do not use the index the same as an Array (array[0]). Instead,
to add an element use the .add method passing the element to add, to retrieve an element use the .get method passing
the index, to remove an element use the .remove method. To modify the value of an element, use the .set method with the 
index of the element to replace and the new value.

When an element is added, by default it will be appended to the end of the list. When an element is removed, all elements
will be shifted to replace the position of the removed element. Additionally, the size of the ArrayList will be adjusted.
To insert an element into a location, use the add method passing the index to insert at and the element to add.

Third, ArrayLists have some convenience functions missing by Arrays; such as clear, contains, isEmpty, and indexOf.

The ArrayList does have some drawbacks, first the ArrayList cannot natively manage primitives. To work around this, use
the "container" object for each primitive (Integer for int, etc.). Also, due to its dynamic nature, ArrayLists are more
computationally and memory intensive due to constant resizing whenever elements are added or removed.

However, ArrayLists are generally easier to use due to the lack of limitations.

The built-in functionality of ArrayLists are:
 - add - Add an element, or add an element at specified position
 - clear - Remove all elements in the list
 - contains - Returns true if the ArrayList has the given element
 - get - Returns the element at given index
 - indexOf - Returns the first index that contains the given element
 - isEmpty - Returns true if the ArrayList contains no elements
 - remove - Removes the first occurance of the specified element, or the specified element is int was passed.
 - set - Replace the element at specified index with the given element
 - size - Returns the number of elements contained in the list
 - sort - Sorts the list
