[&larr; Return](https://hanggrian.github.io/grind-hackerrank/)

# Between Two Sets<sup style="color: rgb(32, 215, 97);">Easy</sup>

> There will be two arrays of integers. Determine all integers that satisfy the
  following two conditions:
>
> 1.  The elements of the first array are all factors of the integer being
      considered.
> 1.  The integer being considered is a factor of all elements of the second
      array.
>
> These numbers are referred to as being between the two arrays. Determine how
  many such numbers exist.
>
> **Example**
>
> \\(a = [2, 6]\)
>
> \\(b = [24, 36]\\)
>
> There are two numbers between the arrays: \\(6\\) and \\(12\\).
>
> \\(6 % 2 = 0\\), \\(6 % 6 = 0\\), \\(24 % 6 = 0\\), and \\(36 % 6 = 0\\) for
  the first value.
>
> \\(12 % 2 = 0\\), \\(12 % 6 = 0\\), \\(24 % 12 = 0\\), and \\(36 % 12 = 0\\)
  for the second value. Return \\(2\\).

- [Problem](https://www.hackerrank.com/challenges/between-two-sets/)
- [Solution](https://github.com/hanggrian/grind-hackerrank/blob/main/algorithms/src/main/java/algo/BetweenTwoSets.java)
