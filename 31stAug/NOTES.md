# NOTES for 31st August

* A __template__ class is a special type of _generic_ class which can work with multiple datatypes without loss of generality. We specify the (primitive/user-defined) types using the format `Classname<Datatype1, Datatype2, ...>` during instantiation. `ArrayList` and `Consumer` are examples of such template classes.

* The features which make a programming language __object oriented__ are _classes and objects_, _abstraction_, _polymorphism_, _encapsulation_ and _inheritance_.

* __Abstraction__ or _data hiding_ is the concept of hiding unnecessary or sensitive data from end (public) users. Thus, end users should only be able to interact with the programme using object endpoints provided, and not be able to modify class variables/code directly. To this end, we have the _public_, _private_, _protected_ and _default_ access modifier, and the _static_, _final_ and _abstract_ specifiers.

* __Polymorphism__ (roughly translates to "one name, many forms") is the act of providing multiple definitions of the same function to deal with different call scenarios, using different function signatures. In code, this is usually done using _overloading_ and _overriding_.

* __Encapsulation__ is the process of wrapping data and related functions into a single unit, aka the concept of classes and interfaces having member variables and methods wrapped together.

* __Inheritance__ is the ability to create a new class from an existing one which retains allowed members from the base class, but is also allowed to add its own members to it.

* Interfaces are _abstract_ by default, and therefore cannot be instantiated.

* Interface attributes are by default _public_, _static_ and _final_.

* Interface methods are by default _public_ and _abstract_.

* Abstract classes, like interfaces, may not be instantiated (i.e., objects for these classes may not be created).

* An abstract class may have abstract or non-abstract methods.

* Abstract methods do not have bodies (definitions). They are provided by the subclass which extend the abstract base class.

* __TBD__: Procedural Abstraction (and specific call cases for static and non-static methods from class and package context).

* __TBD__:  Abstract classes, abstract methods, multiple inheritance using interfaces.