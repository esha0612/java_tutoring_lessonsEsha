## NOTES for 25th Octoer

* The short way to finding if a string is present in another string without using `contains()` is to check with `indexOf() != -1`.

* The way to determine the number of occurrences of `String x` in parent `String s` is to run a __for loop__ from `i : i - x.length()` and check if `s.substring(i, i + x.length()).equals(x)`.

* Remember that Strings in Java are immutable, so processing on a String object will yield a new one anyway. It is thus mostly safe to store it in the variable itself, there is no need to assign the result to a new one (check accompanying code for examples).