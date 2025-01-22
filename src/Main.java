import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void intialization()
    {
        // Initialize an Array of 5 elements
        int[] arr1 = {1, 2, 3, 4, 5}; // One-liner prefilled version
        int[] arr2 = new int[5]; // Empty array; Array is not technically empty, just Zero Filled.
        System.out.println("Intitialized Array 1: " + Arrays.toString(arr1));
        System.out.println("Intitialized Array 2: " + Arrays.toString(arr2));

        //initialize an ArrayList and have it contain 5 elements
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // One-liner prefilled version
        ArrayList<Integer> list2 = new ArrayList<>(); // Initialization is an empty array
        for (int i = 0; i < 5; i++) { list2.add(0);} // Fill list with 0 to be size 5
        System.out.println("Intitialized ArrayList 1: " + list1);
        System.out.println("Intitialized ArrayList 2: " + list2);

        // Check that they are all size/length 5
        // To check the number of elements, in an array use arr.length
        System.out.println("Intitialized Array 1 Length: " + arr1.length);
        System.out.println("Intitialized Array 2 Length: " + arr2.length);
        // To check the number of elements, in an ArrayList use list.size()
        System.out.println("Intitialized ArrayList 1 Length: " + list1.size());
        System.out.println("Intitialized ArrayList 2 Length: " + list2.size());
    }

    public static void setting_values()
    {
        // Here we have an Array and an ArrayList.
        int[] array = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();

        // To set the initial values of an empty array, we must access the index of the array to set.
        // This can be done in a loop.
        for (int i = 0; i < array.length; i++) { array[i] = i + 1; }
        System.out.println("First Values in Array: " + Arrays.toString(array));
        // This remains true to change the value at the index
        array[0] = 10;
        System.out.println("Changed Array: " + Arrays.toString(array));

        // In an ArrayList, you add values to the array list
        for (int i = 0; i < 5; i++) { arrayList.add(i + 1); }
        System.out.println("First Values ArrayList: " + arrayList);
        // To change values in an array list you must use the appropriate function
        arrayList.set(0, 10);
        System.out.println("Changed ArrayList: " + arrayList);
    }

    public static void size_differences()
    {
        // Arrays have a pre-set size
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) { array[i] = i + 1; }
        System.out.println("Array Size: " + array.length + " Elements: " + Arrays.toString(array));

        // If we try to get, set, or change a value at an index equal to or greater than it's length, an Exception is thrown.
        System.out.println("Attempting to set value at index 5");
        try
        {
            array[5] = 10;
            System.out.println("Successfully changed value at index 5");
        } catch (IndexOutOfBoundsException e) { System.out.println("Failed to change value at index 5"); }

        // ArrayLists are not restricted to a specific size
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) { arrayList.add(i + 1); }
        System.out.println("ArrayList Size: " + arrayList.size() + " Elements: " + arrayList);
        System.out.println("Attempting to add another value");
        try
        {
            arrayList.add(6);
            System.out.println("Successfully Added another value, now at index 5.");
            System.out.println("ArrayList Size: " + arrayList.size() + " Elements: " + arrayList);
        } catch (IndexOutOfBoundsException e) { System.out.println("Failed to change value at index 5"); }

        // This makes ArrayLists great for when the number of elements are unknown
        arrayList.clear(); // Removing all elements
        // Add 1000 elements to Array List
        for (int i = 0; i < 1000; i++) { arrayList.add(i + 1); }
        System.out.println("ArrayList Size: " + arrayList.size() + " Elements: " + arrayList);
    }

    public static void arraylist_features()
    {
        // ArrayLists have features not available to an array

        // Appending to a list, another element. The ArrayList is resized to handle.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println("List: " + list);
        list.add(2);
        list.add(3);
        System.out.println("List w/ Added Elements: " + list);

        // Removing from the list. The ArrayList automatically handles losing the value.
        list.remove(1);
        System.out.println("List w/ index 2 removed: " + list);

        // The ArrayList can tell you if it contains any elements
        System.out.println("List is Empty: " + list.isEmpty());

        // The ArrayList can empty of its entire contents with a single line
        list.clear();
        System.out.println("List cleared: " + list);

        // The ArrayList can tell you if it contains any elements
        System.out.println("List is Empty: " + list.isEmpty());

        // Add 1000 elements for next demonstration
        for (int i = 0; i < 1000; i++) { list.add(i + 1); }
        System.out.println("List w/ 1000 elements: " + list);

        // an ArrayList can also tell you if it has a value
        System.out.println("List contains 385: " + list.contains(385));
        System.out.println("List contains 1001: " + list.contains(1001));
        // And where that value is located, or -1 if not present at all.
        System.out.println("Index of 385: " + list.indexOf(385));
        System.out.println("Index of 1001: " + list.indexOf(1001));

        /**
         * But Array lists have some drawbacks, such as being more processing and memory intensive compared to arrays.
         * They cannot contain primitives and must use a "container" of the same type (int -> Integer)
         * but the benefit is the additional flexibility and features that make them easier to work with.
         *
         * ArrayLists should be used whenever there is a scenario where flexibility is needed,
         * such as adding/removing specific objects, or when the number of elements change frequently or upper limit
         * cannot be reasoned.
         */
        // ArrayList<int> list2 = new ArrayList<>(); <- Will fail to compile

        /**
         * Arrays are more efficient in memory and processing and can work with primitives.
         *
         * Array should always be preferred when performance is critical to the program.
         * Arrays should be also preferred when a well-defined length can be reasoned, such as a buffer with a limit.
         */
    }

    public static void converting()
    {
        // To change an array to a list, use a simple loop
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j : array) { arrayList.add(j); }
        System.out.println("ArrayList from Array: " + arrayList);

        // to convert an ArrayList to an array, another loop may be used
        int[] array2 = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) { array2[i] = arrayList.get(i); }
        System.out.println("Array from ArrayList: " + Arrays.toString(array2));
    }


    public static void main(String[] args) {
        intialization();
        setting_values();
        size_differences();
        arraylist_features();
        converting();
    }
}