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
	if not exist $(BIN) mkdir $(BIN)
	$(JAVAC) -d $(BIN) $(SRC)/$(PACKAGE)/practices/Practice1.java $(SRC)/$(PACKAGE)/Practice1Main.java

# Run the program
run:
	$(JAVA) -cp $(BIN) edu.ceu.programming.Practice1Main $(filter-out $@,$(MAKECMDGOALS))

%:
	@: