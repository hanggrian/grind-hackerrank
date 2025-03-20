[&larr; Return](https://hanggrian.github.io/grind-hackerrank/)

# 2D Array - DS<sup style="color: rgb(32, 215, 97);">Easy</sup>

> Given a \\\(6 \\times 6\\) 2D Array, \\(arr\\), an hourglass is a subset of
  values with indices failing in the following pattern:
>
> ```
> a b c
>   d
> e f g
> ```
> There are \\(16\\) hourglasses in a \\(6 \\times 6\\) array. The \\(hourglass
  sum\\) is the sum of the values in an hourglass. Calculate the hourglass
  sum for every hourglass in \\(arr\\), then print the \\(maximum\\) hourglass
  sum.
>
> **Example**
>
> \\(arr =\\)
>
> ```
> -9 -9 -9  1 1 1
>  0 -9  0  4 3 2
> -9 -9 -9  1 2 3
>  0  0  8  6 6 0
>  0  0  0 -2 0 0
>  0  0  1  2 4 0
> ```
>
> The \\(16\\) hourglass sums are:
>
> ```
> -63, -34, -9, 12,
> -10,   0, 28, 23,
> -27, -11, -2, 10,
>   9,  17, 25, 18
> ```
>
> The highest hourglass sum is \\(28\\) from the hourglass beginning at row
  \\(1\\), column \\(2\\):
>
> ```
> 0 4 3
>   1
> 8 6 6
> ```
>
> **Note:** If you have already solved the Java domain's Java 2D Array
  challenge, you may wish to skip this challenge.

- [Problem](https://www.hackerrank.com/challenges/2d-array/)
- [Solution](https://github.com/hanggrian/grind-hackerrank/blob/main/algorithms/src/main/java/ds/TwoDArrayDs.java)
