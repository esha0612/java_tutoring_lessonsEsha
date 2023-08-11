// A brief introduction to pointers

#include <iostream>
using namespace std;

// example of call by value
void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

// example of call by reference
void swap2(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int x = 5;
    int *ptr = &x;

    cout << "The value of x is: " << x << endl;
    cout << "The address of x is: " << &x << endl;
    cout << "The value of ptr is: " << ptr << endl;
    cout << "The value of *ptr is: " << *ptr << endl;
    cout << "The address of ptr is: " << &ptr << endl;

    // we can change the value of x by changing the value of *ptr
    *ptr = 10;
    cout << "The value of x is: " << x << endl;

    // denote the difference between call by value and call by reference using the funcations above
    int a = 5;
    int b = 10;
    cout << "The value of a is: " << a << endl;
    cout << "The value of b is: " << b << endl;
    swap(a, b);
    cout << "The value of a is: " << a << endl;
    cout << "The value of b is: " << b << endl;
    swap2(a, b);
    cout << "The value of a is: " << a << endl;
    cout << "The value of b is: " << b << endl;

    return 0;
}