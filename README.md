# programing Practices - Monte Carlo PI Approximation

## Overview
This project is to implement the Monte Carlo method to approximate the value of PI by randomly choosing points

## how to run 
compile and run manually 
javac -d bin src/main/java/edu/ceu/programming/practices/Practice1.java src/main/java/edu/ceu/programming/Practice1Main.java
 java -cp bin edu.ceu.programming.Practice1Main 100000
  *replace 1000 with any number to aproximate different values 

2. Using Makefile (best option)
COMPILE THE CODE 
make 
RUN WITH CUSTOM ITERATIONS
make run 10000
(You can replace 100000 with any number to test different approximations.)
 
 Project Structure
 ProgrammingPractices/
│── src/main/java/edu/ceu/programming/practices/Practice1.java
│── src/main/java/edu/ceu/programming/Practice1Main.java
│── Makefile
│── .gitignore
│── README.md

Requirements
Java Development Kit (JDK)
make (for using the Makefile)
Git (for version control)

Monte Carlo Method
Monte Carlo simulations use random sampling to estimate results. In this project, we randomly generate points inside a square and check how many fall within a circle to approximate PI.

Author
Henry Valdez
Universidad CEU San Pablo
