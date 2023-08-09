# NOTES for 8th August

* __Overloading__ is a concept where two or more functions share the same name but a different __prototype__.

* A function __signature__ consists of __name__ and __prototype__, both of which are mandatory to declare that function (function __body__ is not).

* When multiple _main_ functions are overloaded, the runtime environment only acknowedges the one which has the function signature as `public static void main (String[] args)`, and ignores the others.

* The other _main_ functions  can still be used by explicitly calling them from other methods as long as they are inside the same package, but only the aforementioned _main_ function is acknowleged by the runtime (aka from the command line).

* The name __args__ is not mandatory as long as it is of type `String[]`.

* Each of the primitive data types have their own __wrapper__ class, for example, the class _Integer_ wraps the _int_ type. So, to convert, say a String to an int, we use a wrapper class parsing function, like `Integer.parseInt(String s)`.