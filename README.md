# AP Computer Science A
## kick the apcs exam ass: study guide, resources, subset 2018

*(more: [AP Chemistry](https://docs.google.com/document/d/1CjDGQkkHumMvqRUKhrd7pnbHUftmZIhNTmaTb8BEZ6M/edit?usp=sharing); AP Lang and Comp; AP US History)*

### Resources
0. [Barron’s AP Computer Science A](http://www.mooreschools.com/cms/lib/OK01000367/Centricity/Domain/2162/Barrons%20AP%20Computer%20Science%20A%20%207th%20Edition.pdf) review book -- Harder than the AP test so read it and you’ll basically get a 5
0. All [AP CS practice exams](https://www.dropbox.com/sh/t3n5lrfdo0f7v00/AACjT7Zl-of2KcrnaQy94ZxYa)
0. Textbooks:
    * [Introduction to Programming Using Java](http://math.hws.edu/javanotes/) ([pdf](http://math.hws.edu/eck/cs124/downloads/javanotes7-linked.pdf)) (free online textbook by David J. Eck from the Hobart and William Smith Colleges

### AP Exam Info
+ Section I: 40 multiple choice in 1:30 (50%)
    + is2g they’re all gonna be really hard stack tracing questions or something
+ Section II: 4 free-response in 1:30 (50)
    + each question is worth 9 points with multiple sections
    
### Official Subset
**Bolded** text is in the subset
normal text isn’t but u should probably know it anyways

#### Commenting
/*
 * This is a multi-line comment. The extra asterisk isn’t
 * technically necessary. 
 */
// This is a single-line comment.
/**
 * This is Javadoc. Syntactically speaking, the single asterisk comment (/*) and the double Javadoc comment (/**) are interpreted the same way, but Java conventions that you should understand on the AP test use the Javadoc comment specifically to write a formal API for your method/class. Just understand the use cases 
*/
Common elements in Javadoc in the subset:
@param 
indicates the type and number of parameters 
@return	
what the method will spit out
Not in the subset, but maybe useful:
@throws
what does it return in case of an error?
@since
which version of Java it first became available
Primitive Types
int
8 bits gives you a maximum value of 255, while 32 bits gives you 2,147,483,647. Represents a flat number, negative or positive depending on whether the bits are signed, without any decimals.
Division by integers will truncate the decimal. 
double
However many bits are in an integer, a double will give you twice that. 
Understand how the computer puts the decimal where it does
boolean
2 values: true/false, off/on
char
one single character
byte
short
long
float
Operators
Arithmetic: +, -, *, /, %
Increment/Decrement: ++, —
Assignment: =, +=, -=, *=, /=, %=
Relational: ==, !=, <, <=, >, >=
Logical: !, &&, ||
Logical: &, |, ^
Numeric casts: (int), (double)
More casting: (char), (float)
String concatenation: +
StringBuilder
Shift: <<, >>, >>>
Bitwise: ~, &, |, ^
Conditional: ?:
Object Comparison
object identity (==, !=) vs object equality (equals)
implementation of equals
String compareTo
Comparable
Escape Sequences
\”, \\, \n inside strings
\’, \t, \unnnn
Input/Output
System.out.print
System.out.println
Scanner, System.in, System.out, System.err
Stream input/output, GUI input/output
Parsing input: 
Integer.parseInt, 
Double, 
parseDouble
Formatting output: 
System.out.printf
Exceptions
ArithmeticException
NullPointerException
IndexOutOfBoundsException
ArrayIndexOutOfBoundsException
IllegalArgumentException
try/catch/finally throw, throws assert
Arrays
1-dimensional arrays
new type[] { }
2-dimensional rectangular arrays
ragged arrays (non-rectangular)
arrays with 3 or more dimensions
initializer list: 
row-major order of 2-dimensional array elements
Control Statements
if
if/else
while
for
for-each
return
switch
break
continue
do-while
Variables
parameter variables
final parameter variables
local variables
final local variables
private instance variables
final instance variables
visibility (private)
static (class) variables
visibility (public, private)
final
Methods
visibility (public, private)
visibility (protected)
static, non-static
public static void main(String[] args)
method signatures
overloading
overriding
parameter passing
command line arguments
variable number of parameters
final
Constructors
super()
super(args)
default initialization of instance variables
initialization blocks
this(args)
Classes
new
final
visibility (public)
visibility (private, protected)
accessor methods
modifier (mutator) methods
nested classes
inner classes
Design/create/modify class.
enumerations
Create subclass of a superclass (abstract, non-abstract)
Create a class that implements an interface.
Interfaces
Design/create/modify an interface
Inheritance
Understand inheritance hierarchies
Design/create/modify subclasses
Design/create/modify classes that implement interfaces
Packages
import packageName.className


