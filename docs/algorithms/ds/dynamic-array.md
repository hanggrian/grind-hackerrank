[&larr; Return](https://hanggrian.github.io/grind-hackerrank/)

# Dynamic Array<sup style="color: rgb(32, 215, 97);">Easy</sup>

> - Declare a 2-dimensional array, \\(arr\\), with \\(n\\) empty arrays, all
  zero-indexed.
> - Declare an integer, \\(lastAnswer\\), and initialize it to \\(0\\).
>
> You need to process two types of queries:
>
> 1.  Query: \\(1 x y\\)
>     - Compute \\(idx = (x \oplus lastAnswer)\\).
>     - Append the integer \\(y\\) to \\(arr[idx]\\).
> 1.  Query: \\(2 x y\\)
>     - Compute \\(idx = (x \oplus lastAnswer)\\).
>     - Set \\(lastAnswer = arr[idx]|y % size(arr[idx])\\)
>     - Store the new value of \\(lastAnswer\\) in an answers array.
>
> **Notes:**
>
> - \\(\oplus\\) is the bitwise XOR operation, which corresponds to the ^
    operator in most languages. Learn more about it on Wikipedia.
> - \\(%\\) is the modulo operator.
> - Finally, \\(size(arr[idx])\\) is the number of elements in \\(arr[idx]\\).

- [Problem](https://www.hackerrank.com/challenges/dynamic-array/)
- [Solution](https://github.com/hanggrian/grind-hackerrank/blob/main/algorithms/src/main/java/ds/DynamicArray.java)
