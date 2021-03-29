# Access Modifiers in Java
The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

### Types of Access Modifier
There are four access modifiers keywords in Java and they are:
```
Modifier	    Description
Private	        Declarations are visible within the class only
Default      	Declarations are visible only within the package (package private)
Protected	Declarations are visible within the package or all subclasses
Public	        Declarations are visible everywhere
```
 ```
Access Modifier	    within class   within package   outside-package-by-subclass-only   outside package
Private	                  Y	            N	                    N                          N
Default	                  Y	            Y	                    N	                       N
Protected	          Y	            Y	                    Y	                       N
Public                    Y	            Y	                    Y	                       Y
```
