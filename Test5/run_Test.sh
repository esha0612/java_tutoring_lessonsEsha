clear
prog=""
if [ $1 -eq 1 ]
then
    prog="FreeCode$2"
else
    prog="MCQ$2"
fi
echo "Currently processing $prog"
echo
echo "------------------------------------"
echo
echo "Source Code:"
cat $prog.java
echo
echo "------------------------------------"
echo
echo "Compiling $prog.java"
javac $prog.java
echo "Compiled $prog.java"
echo
echo "------------------------------------"
echo
echo "Running $prog.java"
echo
echo "------------------------------------"
echo
echo "Output:"
java $prog
echo
echo "------------------------------------"
echo
echo "Done"