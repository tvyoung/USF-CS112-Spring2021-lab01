// Vicki Young
// CS 112-01
// 2021.02.14

//worked with partner: Isaiah Palacios

//----------------------------
// Hello.java
// Print a Hello World message
//----------------------------
public class Hello
{
   //--------------------------------
   //main method: prints the greeting
   //--------------------------------
   public static void main(String[] args)
   {
      System.out.println("Hello World!")
   }
}

 /*
2. Class name different from file name. Delete one l (el) from the name of the class (so the first non-comment line is: "public class Helo"), save the program, and recompile it. What was the error message? Place your answer as a comment at the bottom of the program.

   Attempting to recompile the program results in the following error message:
   Hello.java:7: error: class Helo is public, should be declared in a file named Helo.java

3. Misspelling inside string. Correct the mistake above, then delete one l from the Hello in the message to be printed (inside the quotation marks). Save the program and recompile it. There is no error message—why not? Now run the program. What has changed? Add your answers to the bottom of the file using comments as well.

   There is no error message because there is nothing wrong with the program, such as a syntax error like in the previous problem. "Hello" is spelled incorrectly here, but it is part of the string literal, which does not affect the program's ability to run.  

   What has changed in the end is the message printed after the program is run. Instead of "Hello World!" the message now says "Helo World!"

4. No ending quotation mark in a string literal. Correct the spelling in the string, then delete the ending quotation mark enclosing the string: Hello World!. Save the program and recompile it. What error message(s) do you get this time?

   Attmpting to recompile the program results in the following error message:
   Hello.java:14: error: unclosed string literal

5. No beginning quotation mark in a string literal. Put the ending quotation mark back, then take out the beginning one. Save and recompile. How many errors this time? Lots, even though there is really only one error. When you get lots of errors always concentrate on finding the first one listed!! Often fixing that one will fix the rest. After we study variables the error messages that came up this time will make more sense.

   4 errors are given:
   Hello.java:14: error: ')' expected
      System.out.println(Hello World!");
                                 ^
   Hello.java:14: error: not a statement
      System.out.println(Hello World!");
                                  ^
   Hello.java:14: error: ';' expected
      System.out.println(Hello World!");
                                       ^
   Hello.java:14: error: unclosed string literal
      System.out.println(Hello World!");

6. No semicolon after a statement. Fix the last error (put the quotation mark back). Now remove the semicolon at the end of the line that prints the message. Save the program and recompile it. What error message(s) do you get?

   Attempting to recompile the program results in the following error message: 
   Hello.java:14: error: ';' expected

*/