# Shell script to compare the output of two programs

# Clear the screen
clear

# Check if the number of arguments is 1
if [ $# -ne 1 ]
then
    echo "Usage: $0 <program_code>"
    exit 1
fi

# Annotate program name based on the established convention
prog=CP$1.java
test=CP$1_test.java

# Check if the files exist
if [ ! -f $prog ]
then
    echo "Error: $prog does not exist"
    exit 1
fi

if [ ! -f $test ]
then
    echo "Error: $test does not exist"
    exit 1
fi

# Check if the files are executable
if [ ! -x $prog ]
then
    echo "Error: $prog is not an executable file"
    exit 2
fi

if [ ! -x $test ]
then
    echo "Error: $test is not an executable file"
    exit 3
fi

# Run the two java programs and compare their output
# Compiling the java programs
javac $prog
javac $test
# Running the java programs
java $prog > temp1
java $test > temp2

diff temp1 temp2 > /dev/null

# Check if the output of the two programs match
echo
if [ $? -eq 0 ]
then
    echo "Output of $test and $prog match"
else
    echo "Output of $test and $prog do not match"
fi
echo

# Print the output of the two programs
echo "Output of $test"
cat temp1
echo
echo "Output of $prog"
cat temp2

# Remove the temporary files
rm -f temp1 temp2

# Remove the class files
rm -f *.class

exit 0

# End of script