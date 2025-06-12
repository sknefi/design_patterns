SRCDIR = src
OBJDIR = objs
MAIN_CLASS = Main

G = \033[1;32m
R = \033[0m

# Find all Java files
JAVA_FILES = $(shell find $(SRCDIR) -name "*.java")

.PHONY: all clean run

all: compile

compile:
	@mkdir -p $(OBJDIR)
	javac -cp $(SRCDIR) -d $(OBJDIR) $(JAVA_FILES)
	@echo "$(G)Compilation successful!$(R)"

run: compile
	java -cp $(OBJDIR) $(MAIN_CLASS)

clean:
	rm -rf $(OBJDIR)