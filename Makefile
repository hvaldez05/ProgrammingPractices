# Variables
JAVAC = javac
JAVA = java
SRC = src/main/java
BIN = bin
PACKAGE = edu/ceu/programming

# Default target
all: compile

# Compile all Java files
compile:
	
	javac -d bin -sourcepath src/main/java src/main/java/edu/ceu/programming/Practice1Main.java src/main/java/edu/ceu/programming/Practice2Main.java src/main/java/edu/ceu/programming/Practice3Main.java
# Run the program
# Run Iterative
run-iterative:
	java -cp bin edu.ceu.programming.Practice1Main $(steps)

# Run Recursive
run-recursive:
	java -cp bin edu.ceu.programming.Practice2Main $(steps)

# Run Stream
run-stream:
	java -cp bin edu.ceu.programming.Practice3Main $(steps)
%:
	@: