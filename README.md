
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
<li>If the input has a special case or letter, then it will be removed.</li>
<li>Search the whole input using RegEx.</li>
<li>Input can't be less than 0 digit and more than 4 digits.</li>
<li>The phone dial-pad doesn't have a character on the 1 button, so the app will remove (or replace with nothing 😉) it from the input.</li>
<li>In case input has only 1('s) then it will throw a custom made exception `outOfScope()`. </li>
</ul>

3. Calls the function `DFS()` that will do the tree operation of having every character make a different concatenation with the others (in case of multi digits entered as input).

There are **16 unit tests** made to make sure it covers as many possibilities for input (including exceptions).

<img style="border-radius:10px;" align="right" src="https://github.com/Ahelsamahy/letter-combination-in-analog-phone/blob/main/usedMaterial/unitTest.jpg?raw=true" title="successful test cases" >


<div style="width:fit-content;">

<table>
<thead>
	<tr>
		<th>Input test</th>
		<th>Trigger exception</th>
	</tr>
</thead>
<tbody>
	<tr>
		<td>input1Number()</td>
		<td>containsSpecialCaseOnly()</td>
	</tr>
	<tr>
		<td>input2Numbers()</td>
		<td>containsAlphabetOnly()</td>
	</tr>
	<tr>
		<td>input3Numbers()</td>
		<td>longInput()</td>
	</tr>
	<tr>
		<td>input4Numbers()</td>
		<td>nullInput()</td>
	</tr>
	<tr>
		<td>removeThe1s()</td>
		<td></td>
	</tr>
	<tr>
		<td>containsAlphabet()</td>
		<td></td>
	</tr>
	<tr>
		<td>containsAlphabets()</td>
		<td></td>
	</tr>
	<tr>
		<td>containsSpecialCase()</td>
		<td></td>
	</tr>
	<tr>
		<td>containsSpecialCases()</td>
		<td></td>
	</tr>
	<tr>
		<td>startsWithSpecialCase()</td>
		<td></td>
	</tr>
	<tr>
		<td>startsWithCapitalAlphabet()</td>
		<td></td>
	</tr>
	<tr>
		<td>containsAlphabetWithSpecialCase()</td>
		<td></td>
	</tr>
</tbody>
</table>



</div>


> ⚠️ If somehow you can't add the library for test cases (like me) then follow [this][1] guide to add it manually.

[1]: https://www.jetbrains.com/help/idea/testing.html#ij-add-library "here comes the help"


# Emailware
this project is an [emailware](https://en.wiktionary.org/wiki/emailware). Meaning, if you liked using this app or it has helped you in any way, I'd like you to send me an email at <ahmelsamahy@gmail.com> about anything you'd want to say about this software. I'd really appreciate it!

# License
If you have a project similar to this which you will use this instead in it or you may use this project, don't forget to mention me or send me an email about it.