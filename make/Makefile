# .PHONY targets and helper variables
.PHONY: dirs run clean
OBJS=obj/stack.o obj/main.o
FLAGS=-g -Wall -std=c11
DIRS=obj/ bin/

# Compile executable binary
bin/stack-demo: ${OBJS} | dirs
	gcc $(FLAGS) -o $@ ${OBJS}

# Make directories for object files and executable binary
dirs:
	make ${DIRS}

%/:
	mkdir -p $@

# Compile .o object files from .c source code files
obj/%.o: src/%.c | dirs
	gcc $(FLAGS) -c -o $@ $<

# Run the compiled program
run: | bin/stack-demo
	./bin/stack-demo

# Clean compiled artifacts by removing them
clean:
	rm -rf ${DIRS}

