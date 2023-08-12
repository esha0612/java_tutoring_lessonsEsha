# NOTES for 10th August

* The set of __Real__ numbers, _ℝ_, represents all tangible aka non-imaginary numbers on the spectrum, both rational and irrational.

* The set of __Rational__ numbers, _ℚ_, represents all real numbers on the spectrum with terminating __mantissa__ (fractional part).

* The set of __Irrational__ numbers, _P = R - Q_ represents all non-terminating decimal numbers (example, √2 or π).

* The set of __Integer__ numbers, _𝕀_ or _ℤ_ is the complete set of values obtained by putting digits together, both positive and negative, without a fractional part.

* The set of __Whole__ numbers, _ℕ∪{0}_ is a subset of the set of integers, which does not include negative values.

* The set of __Natural__ numbers, _ℕ_ is a subset of the set of whole numbers, without 0.

* __Shallow Copy__ means copying the value from one variable to another, where both maintain their own seperate records, and modification on one is independent of the other.

* __Deep Copy__, on the other hand, copies the reference to a memory location, which means that both variables are now pointers to the same location in memory, and changing the value of one will also overwrite the other.

* Java __does not__ support explicit pointers unlike C/C++, because JRE is very conscious of memory security, and direct emmory manipulation is usually not allowed (we can, however, manipulate some things using the _Reflection API_). Java does, however, use pointers (or more accurately, reference manipulation), internally.

* Java and Python use __call by assignment__, which is neither __call by value__ or __call by reference__. Instead, a __copy of the reference__ is provided to the parameter, which means modifying the parameter does modify the original variable, but any reassignment made to the parameter itself will not affect the original variable afterwards, since we are now pointing to different memory locations.