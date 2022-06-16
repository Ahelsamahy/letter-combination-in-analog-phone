
<p align="center">
<img style="border-radius:10px;" src="https://github.com/Ahelsamahy/letter-combination-in-analog-phone/blob/main/usedMaterial/Intro.png?raw=true" title="Visually Go, Go" >
</p>

<p align="center">
  <a href="#Introduction">Introduction</a> •
  <a href="#How-it-works">How it Works</a> •
  <a href="#emailware">Emailware</a> •
  <a href="#license">License</a>
</p>


# Introduction
As one of the first projects to do in java, this one is different because it is linked to old times, I remember sending messages to my friends through Bluetooth but the one who can click the button faster is the one who speaks a lot 😂. Project got more evolved and got into an array of possibilities that can be done from a combination of digits (more than 0 digits and less than 5).

Also it was a good practice to make test cases in new a language as Java (despite that there wasn't that much of a difference between them)

# How-it-works
1. The base function that does most of the functionality `letterCombinations()` has a dictionary of the digits as the key and their equivalent of character are the value.
2. Constraints on the input digits :

<ul style="margin-top:-1rem; margin-left:1rem;">
<li>Input can't be less than 1 digit and more than 4 digits
<li>The phone dial-pad doesn't have a character on the 1 button, so the app will remove (or replace with nothing 😉) it from the input.
<li>In case input has only 1('s) then it will throw a custom made exception `outOfScope()`. 
</ul>

3. Calls the function `helper()` that will do the tree operation of having every character make a different concatenation with the others (in case of multi digits entered as input).

There are **5 unit tests** made to make sure it covers as many possibilities for input (including exceptions).

removeThe1s(): get rid of the 1('s).

longInput(): throw of exception in the case of more than 4 digits as input.

<img style="border-radius:10px;" align="right" src="https://github.com/Ahelsamahy/letter-combination-in-analog-phone/blob/main/usedMaterial/unitTest.jpg?raw=true" title="successful test cases" >

test1Number(): just the normal output when 1 digit is entered.

nullInput(): throw exception when there is no input.

test2Numbers(): more output to be tested in case of entering  2 digits.



> ⚠️ If somehow you can't add the library for test cases (like me) then follow [this][1] guide to add it manually.

[1]: https://www.jetbrains.com/help/idea/testing.html#ij-add-library "here comes the help"


# Emailware
this project is an [emailware](https://en.wiktionary.org/wiki/emailware). Meaning, if you liked using this app or it has helped you in any way, I'd like you to send me an email at <ahmelsamahy@gmail.com> about anything you'd want to say about this software. I'd really appreciate it!

# License
If you have a project similar to this which you will use this instead in it or you may use this project, don't forget to mention me or send me an email about it.