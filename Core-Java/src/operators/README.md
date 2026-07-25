# Operators in Java

## Overview

Operators are special symbols in Java that perform operations on one or more operands (variables or values).

Example:

```java
int a = 10;
int b = 20;

int sum = a + b;
```

Here,

- `a` and `b` are operands.
- `+` is an operator.

The operator tells Java what action to perform.

---

# Types of Operators Covered

## 1️.Arithmetic Operators

Used to perform mathematical operations.

Operators:

- `+` Addition
- `-` Subtraction
- `*` Multiplication
- `/` Division
- `%` Modulus (Remainder)

Program:

- ArithmeticOperators.java

Example:

```java
int a = 20;
int b = 10;

System.out.println(a + b);
```

---

## 2️.Assignment Operators

Used to assign values to variables.

Operators:

- =
- +=
- -=
- *=
- /=
- %=

Program:

- AssignmentOperator.java

Example:

```java
int marks = 50;

marks += 10;
```

Equivalent to

```java
marks = marks + 10;
```

---

## 3️.Relational Operators

Used to compare two values.

Operators:

- >
- <
- >=
- <=
- ==
- !=

Program:

- RelationalOperators.java

Example:

```java
System.out.println(10 > 5);
```

Output

```
true
```

---

## 4️.Logical Operators

Used to combine multiple conditions.

Operators:

- &&
- ||
- !

Program:

- LogicalOperators.java

Example:

```java
(age >= 18 && hasLicense)
```

---

## 5️.Unary Operators

Unary operators work on only one operand.

Operators:

- +
- -
- ++
- --

Program:

- UnaryOperator.java

Example:

```java
int a = 10;

a++;
```

---

## 6️.Ternary Operator

A shorter way of writing an if-else statement.

Syntax

```java
condition ? expression1 : expression2;
```

Program:

- TernaryOperator.java

Example

```java
String result = (age >= 18)
        ? "Eligible"
        : "Not Eligible";
```

---



# Concepts Learned

- Arithmetic calculations
- Assigning values
- Comparing values
- Combining conditions
- Unary operations
- Decision making using the ternary operator


