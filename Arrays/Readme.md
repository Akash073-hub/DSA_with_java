***📌 What is an Array? ***


An array is a container that stores multiple values of the same type in a single variable.

Instead of creating many variables like:

int a = 10;
int b = 20;
int c = 30;


We can store them in one array:

int[] arr = {10, 20, 30};



The points to remember about arrays are:

👉 All values are stored together

👉 All values must be the same data type

👉 Each value has a position (index)


👉 Index always starts from 0

📌 Example of Array
```java
public class Example {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15};

        System.out.println(numbers[0]); // 5
        System.out.println(numbers[1]); // 10

    }
}
```


Here:

numbers[0] → first element

numbers[1] → second element

📌 1️⃣ 1D Array (One Dimensional Array)

A 1D array is like a single line of boxes.

Think of it like this:

Index:   0   1   2   3
Value:  10  20  30  40

Example:
```java
int[] arr = {10, 20, 30, 40};
```

🔹 Used to store a list of numbers
🔹 Easy to access using arr[index]
🔹 Stored in a single row

📌 2️⃣ 2D Array (Two Dimensional Array)

A 2D array is like a table (rows and columns).

Think of it like a matrix:
```java
     Column
       0   1
Row 0  1   2

Row 1  3   4
```

Example:
```java 
int[][] matrix = {

{1, 2},

{3, 4}
};


To access elements:

matrix[0][0] // 1

matrix[1][1] // 4
```

🔹 Used for matrices

🔹 Used in games (chess board, tic tac toe)

🔹 Has rows and columns


📌 ArrayList (Dynamic Array)

An ArrayList is like an array, but it can grow and shrink automatically.

🔹 Normal array → size is fixed

🔹 ArrayList → size can change

Example:
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1)); // 20
```

Why use ArrayList?

✔ No need to decide size at start

✔ Can add/remove elements easily

✔ More flexible than array


📌 Difference Between Array and ArrayList

Array	ArrayList

Fixed size	Dynamic size

Faster	Slightly slower

Can store primitives directly	Stores objects (Integer, not int)
