# NOTES for 24th February

* Inheritance is the concept of extending a class/interface to add new features. This is called __specialization__. The opposite, __generalization__, is also a concept frequently discussed during UML planning, especially in database theory.

* In inheritance, we generally have a more generalized base class (such as person), with branching, specialized subclasses (such as Student, Faculty) which allow for further customization and addition to the base class features.

* Methods may be overloaded as per usual inside each class, be it a base or sub class. However, inheritance introduces the additional concept of method overriding, which is similar to overloading but instead of two methods in the same class, a method in a sub class overrides one with the same name in its parent. This is different from _implementing_ a virtual method, as they are two real methods and can be called via their respective class instances. These two, overloading and overriding, aid in polymorphism.

* __this__ keyword refers to the current context, so the way you track it is always using the callling method/instance. Whichever instance calls the method/block inside which you see the `this` keyword, that instance is what it is tracking. __super__ refers to the parent class to the current context, __if it exists__, so super is the parent class of the current instance. If there is a default constructor in the base class, __super__ need not be called explicitly.

* The tricky part in inheritance is instance typecasting. One needs to know which form of an overridden function is called when the pointer is of a certain type. Java allows base class pointers to subclass instances (note, Java is memory safe and does not allow pointers as in C/C++, so what I mean here is instance variables).

* Each object maintains its own copies of class variables, unless they are either _static_. A shared variable, also called an _instance_ variable, is typically prefixed with an underscore as the first letter in the variable name. This is, however, a depreciated naming convention for class variables.

* Static class variables are shared across base and subclass objects. No matter the instance, if it gets modified by any object of any type, that value is reflected in every otehr object that shares access to that static variable.

* Access modifiers (_private_, _protected_, _public_, _default_) control what is inherited. They can apply to any members, both methods and variables.

* When a base class pointer refers to a subclass object, as a thumb rule, only base class member variables and methods can be called/accessed. However, the subclass overrides for them will always be called, as a thumb rule (since the object is of subclass type). One can typecast it back to subclass to access all members.