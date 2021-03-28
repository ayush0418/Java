# Java Exceptions 
An exception is an unexpected event that occurs during program execution. 
It affects the flow of the program instructions which can cause the program to terminate abnormally.

## Hierarchy of Java Exception classes
The java.lang.Throwable class is the root class of Java Exception hierarchy which is inherited by two subclasses: Exception and Error. 
A hierarchy of Java Exception classes are given below:
<p  align="center"><img src="https://cdn.programiz.com/sites/tutorial2program/files/ExceptionHierarchy.png" alt="Coder GIF" width="600" height="350">

## Errors
Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, 
library incompatibility, infinite recursion, etc.

Errors are usually beyond the control of the programmer and we should not try to handle errors

<h3>Java Exception Types</h3>
<ol type="1">
      <li><b>Runtime Exception</b>
  </li>
  A runtime exception happens due to a programming error. They are also known as unchecked exceptions.
  
  These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are:
  
<ul type="Square">
            <li><b>Arithmetic Exception: </b>
             If we divide any number by zero, there occurs an ArithmeticException.
      </li>
            <li><b>Null Pointer Exception: </b>
            If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
      </li>
            <li><b>Number Format Exception: </b>
              The wrong formatting of any value may occur NumberFormatException. Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.
      </li>
            <li><b>Index out of bounds Exception: </b>
              If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException or StringIndexOutOfBoundsException
  </li>
</ul>
      <li><b>IO Exception</b>
</li>
An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.

Some of the examples of checked exceptions are:
<ul type="Square">
  
  <li>Trying to open a file that doesn’t exist results in FileNotFoundException</li>
  <li>Trying to read past the end of a file.</li>
  </ul>

</ol>
