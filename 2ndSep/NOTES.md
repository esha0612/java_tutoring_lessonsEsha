# NOTES for 2nd September

* __Static__ methods may only access static variables, while non static methods may work with both.

* __Abstract__ classes may contain both abstract and non abstract methods, but abstract methods have no body and must be overridden in the child class.

* __Abstract__, when added to a class, makes that class non-instantiable, as in we cannot declare objects of that class. Abstract methods, on the other hand, do not have definitions in the parent class, they are only declared. All methods inside interfaces are abstract by default, interfaces do not allow non-abstract methods.

* The only way to avoid providing a definition for an abstract method in a child class is to make the child class abstract as well.

* __Static__ methods __cannot be overridden__.

* _Abstract_ methods cannot be _static_, because static methods cannot be overridden.

* _Abstract_ methods cannot be _synchronized_, but methods which override abstract methods may.

* A _local inner class_ inside a non-abstract class may also be abstract. A local inner class inside an abstract class is usually abstract by design, because we cannot instantiate the container class.

* An interface can _extend_ another interface.

* TBD: Continue with abstract classes and interfaces.