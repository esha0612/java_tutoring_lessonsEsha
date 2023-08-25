# NOTES for 24th August

* The `super()` keyword is used to call the parent class' constructor. If we want to call a parameterized constructor, we need to pass the parameters into `super()`.

* Typecasting child class object to parent class is __allowed__, both _implicitly_ and _explicitly_.

* Typecasting parent class object to child class is __not allowed implicitly__ by the compiler (aka _compile time error_). It may be __allowed explicitly__ by the compiler, but will end up with a _runtime error_.

* A __static__ member is shared across objects, which means there is only __one copy__ of that member in memory, and any modifications to such a member is reflected everywhere (aka across all objects).

* __Static__ members can be called directly (aka without using objects) unless they are private by using the format `className.static_variable` or `className.static_method()`.

* _Static methods_ can __only access__ _static variables_.

* _Non-static methods_ can __access both__ _static and non-static variables_.

* __Constructors__ cannot be `static`, `final` or `abstract` in Java.

* TODO: _abstract_ classes, interfaces.