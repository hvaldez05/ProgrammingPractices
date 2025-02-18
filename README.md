# Programing Practices - Monte Carlo PI Approximation

## Overview

This is a simple project where we try to estimate the value of PI using a method called Monte Carlo. The idea is to randomly place points inside a square and check how many fall inside a circle. The more points we use, the closer we get to PI.

## how to run 

### 1. compile and run manually 

 1. javac -d bin src/main/java/edu/ceu/programming/practices/Practice1.java src/main/java/edu/ceu/programming/Practice1Main.java
 2. java -cp bin edu.ceu.programming.Practice1Main 100000
  ```*replace 1000 with any number to aproximate different values``` 

### 2. Using Makefile (best option)
### Compile code 
make 
### Run With Custom Iterations
make run 10000
(You can replace 100000 with any number to test different approximations.)
 
 ## Project Structure
```
 ProgrammingPractices/
 ```
│── src/main/java/edu/ceu/programming/practices/Practice1.java

│── src/main/java/edu/ceu/programming/Practice1Main.java

│── Makefile

│── .gitignore

│── README.md

## Requirements

-  Java Development Kit (JDK)
-  make (for using the Makefile)
-  Git (for version control)

## Monte Carlo Method

Monte Carlo simulations use random sampling to estimate results. In this project, we randomly generate points inside a square and check how many fall within a circle to approximate PI.

## Author

```
Henry Valdez
Universidad CEU San Pablo
