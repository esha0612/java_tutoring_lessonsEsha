# NOTES for 26th December

* Wrapper classes "wrap" around an existing datatype and add additional functionality. For example, `StringBuffer` wraps around `String` and provides `reverse()`, `Integer` wraps around `int` (a primitive datatype) and provides `parseInt()`.

* `ArrayList` is one such wrapper class that wraps around `Array`, and provides additional functionality. It should be noted that `Array` and `Arrays` (from `java.util`) are different classes. The former is a user defined datatype typically identified by the symbols `[]` that follow a `Collection` object of this type, while the latter is a utility class.

* In addition to being a __wrapper class__, `ArrayList` is also a __template class__ or a __generic class__, aka the datatype (be it primitive or user defined) of the type of `Array` it wraps around must be provided to it, and `ArrayList` will call the correct overloaded function to manage that type of `Array`.