[&larr; Return](https://hanggrian.github.io/grind-hackerrank/)

# Java Stdin and Stdout I<sup style="color: rgb(32, 215, 97);">Easy</sup>

> Most HackerRank challenges require you to read input from [stdin](https://en.wikipedia.org/wiki/Standard_streams#Standard_input_.28stdin.29)
  (standard input) and write output to [stdout](https://en.wikipedia.org/wiki/Standard_streams#Standard_output_.28stdout.29)
  (standard output).
>
> One popular way to read input from stdin is by using the [Scanner class](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
  and specifying the Input Stream as System.in. For example:
>
> ```java
> Scanner scanner = new Scanner(System.in);
> String myString = scanner.next();
> int myInt = scanner.nextInt();
> scanner.close();
>
> System.out.println("myString is: " + myString);
> System.out.println("myInt is: " + myInt);
> ```
>
> The code above creates a Scanner object named \\(scanner\\) and uses it to
  read a String and an int. It then closes the Scanner object because there is
  no more input to read, and prints to stdout using System.out.println(String).
  So, if our input is:
>
> ```
> Hi 5
> ```
>
> Our code will print:
>
> ```
> myString is: Hi
> myInt is: 5
> ```
>
> Alternatively, you can use the [BufferedReader class](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html).
>
> **Task**
>
> In this challenge, you must read **3** integers from stdin and then print them
  to stdout. Each integer must be printed on a new line. To make the problem a
  little easier, a portion of the code is provided for you in the editor below.

- [Problem](https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/)
- [Solution](https://github.com/hanggrian/grind-hackerrank/blob/main/java/src/main/java/JavaStdinStdout1.java)
