
Goal: Build an application that performs simple word analysis on a user supplied text input
Evaluation: You do not need to complete the exercise. Spend enough time on the exercise to be
able to speak through your solution and enough code to demonstrate that your solution would
function. We will evaluate your solution for how it addresses the problem and how well you can
describe your approach. You will be provided a monitor to display your code and a whiteboard
to walk through your solution. Be prepared to answer questions to expand on your solution.


● For this exercise we created a document with the basic grammatical rules of a made up
  language - it isn’t necessary to understand the complexities of the grammar in order to
  complete this exercise, only to extract the rules surrounding word roots and suffixes.
  
● The application should accept text input from a user (a list of sample words have been
  attached), and to determine the possible stem words that may form the root of the user’s
  input.
  
● If a user enters more than one word, each word (separated by a space) should be
  analyzed and the possible roots for each user entered word should be displayed. Any
  non alphabetic characters can be ignored.
  
● The app should keep track of stem-words that have been previously matched, and how
  many times each stem has been presented as a possible root to a user input word.
  
● There should be a way of seeing all calculated stem-words, and the number of times that
  each has been calculated as the root of user-input
  
● There should be an ability to clear the counts of stem words on user action.
  Please write the stemming algorithm yourself, instead of using an existing code library.
  Please create a mobile application to accept user input and display results. When
  you're satisfied with your solution, please submit:
  
● The code (Github repo is acceptable)

● README that gives an overview of your solution and libraries/frameworks you used

● README should also include instructions on how to setup and execute the application.

● Bonus: Submit as a zipped git repo, so we can see your commit history.

● The hours spent on the exercise

Grammar Rules

● The following are common suffixes in the language, remove the suffix to find the root
  word -
○ “L”
○ “LZ”
○ “EVM”
○ “ZQ”

● These suffixes require adding back letters to determine the root word -
○ remove “PZL” add “A”
○ remove “PZL” add “AZ”
○ remove “EZL” add “R”

● Example Words:
○ MZV
○ EV
○ KMZ
○ IHFULZ
○ HA
○ DUNEZL
○ MFNDV
○ ZPZVKL
○ EK
○ XZIHNZL
○ VZIZLLDUR
○ UZCUZLZVKDKEPZL
○ AHU
○ HVZ
○ CZHCSZ
○ QELLHSPZ
○ KMZ
○ CHSEKEIDS
○ XDVQL
○ JMEIM
○ KMZNLZSPZL

PLEASE CLICK ON THE IMAGE TO SEE THE ESPRESSO TEST ON YOUTUBE. THANKS. 

[![Watch the video](https://i.imgur.com/47yi76l.png)](https://youtu.be/PvyLNFlFN_4)
