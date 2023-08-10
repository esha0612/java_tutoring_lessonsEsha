# NOTES for 9th August

* __public__, __private__, __protected__ and __default__ are called access modifier.

* __static__ is called a specifier.

* The relative order of specifiers and modifiers does not affect the compilation in any way, so `static public` is functionally equivalent to `public static`.

* Explicitly type casting to an inferior format (example, _double_ to _int_) __does not__ round off the non-precise digits. So, both 3.1 and 3.9 will get converted to 3, for example

* Like Python, __String__ objects are also _immutable_ in Java. This means that once created (declared), they cannot be modified any further, and any changes made to them are ignored if not returned (as a new string).