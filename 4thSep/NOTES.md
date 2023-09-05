# NOTES for 4th September

* The __initializer block__ is used to declare/initialize the common part of various constructors of a class.

* It is called during _object creation_ and is executed __before__ the body of the constructor. It's usual task is to assign values, same as constructor, but it is called during any kind of constructor invocation.

* Whenever we use a static keyword and associate it to a block then that block is referred to as a __static block__. The code inside the static block is executed only __once__: the first time the class is loaded into memory.

* Static block can only reference (aka initialize) static variables and only invoke static methods.

* Interfaces allow _static_ methods to have bodies because such methods (usually) cannot be overridden. If we try to (implicitly) override them, the program will still compile but the subclass method will be hidden by the base class method. This is called __method hiding__. In certain cases, however, even static methods can be overridden explicitly using the `@Override` compiler flag.