/*teamprojectv1.java
*Gabriel Camarozano
*10/3/22
* The First version of this project displays input and output for a game, where dialog boxes are used and questions about programming
* are the challenge of this game
* String = userName

Display an Introduction to the Game.
JOptionPane.showMessageDialog(null,"JAVA QUIZ!!");
Prompt the user for his/her name. 
userName = JOptionPane.showInputDialog(null, "What is your name?", "JAVA QUIZ");
Display the following main menu: 
1) See Rules 
2) Play Game 
3) Exit
*
JOptionPane.showOptionDialog
Prompt the user for the main menu choice. 
Regardless of user input: 
JOptionPane.showMessageDialog
Display the rules for the game in a message box.
JOptionPane.showMessageDialog
 
Display the 3 sets of questions and answers. These questions 
should come from the topics in Chapters 1 – 2. 
String[] responses = 
JOptionPane.showOptionDialog
Prompt the user for each menu choice. 
JOptionPane.showOptionDialog

javaGamev2.java
Gabriel Camarozano
10/13/22
The Second version of this project displays input and output for a game, where dialog boxes are used and questions about programming are the challenge of this game

Pseudocodev2:
• (3) Create an algorithm.
• (3) Add 2 more sets of questions and answers. These questions
should come from the topics in Chapter 3.

JOptionPane.showOptionDialog

Question 4: Which of these are not part of decision structure?
Answers question 4: If, Switch, Array

Question 5: Which of these should be used in a Two-Way if statement?
Answers question 5: If/If Else, If/Else, Break

• (6) Use a decision structure to determine the path of the game
based on the user’s main menu choice. Include input validation.

if (menuChoice <= 0){
}

else if (menuChoice <= 1) {
}

else if (menuChoice <= 2) {
}

• (6) Use a decision structure to indicate to the user whether each
answer is correct or incorrect. Include input validation.


if (userAnswer == 1) {
JOptionPane.showMessageDialog
} 

else {
JOptionPane.showMessageDialog
}


• (5) Add a point value to each question and include an accumulator
to add to the total points when the user answers.

Correct Answer:
totalPoints = totalPoints + 10

Wrong Answer:
totalPoints = totalPoints + 0

• (2) Include documentation in your code to explain the updates
that were made to this version.

UPDATES 10/13/2022:
Added Decision Structure for Menu decisions, where the user can choose to see the rules, play the game, or exit the application
Added Decision Structure for Questions to recognize correct and wrong answers
Added Points to earn if the questions are answered correctly
Added a JOptionPane after the questions to display how many points were earned
Added Question 4 and Question 5 to the game

ERRORS:
If user selects "RULES" in the main menu, the game quits after showing the rules and the user has to run the game again, 
can be fixed with a loop to return to main menu
If user selects "PLAY AGAIN" or "SEE RULES" after the questions the game quits and user has to run the game again,
also can be fixed with a loop to re-play the game

javaGamev3.java
Gabriel Camarozano
11/3/22
The Third version of this project displays input and output for a game, where dialog boxes are used and questions about programming are the challenge of this game

Pseudocodev3:

(3) Create an algorithm.

(4) Add 2 more sets of questions and answers. These questions
should come from the topics in Chapter 4.

String[] answers = {};
JOptionPane.showOptionDialog ("Which of these can be considered a pre-test loop?");
JOptionPane.showOptionDialog ("Which of these can be considered a post-fix?");

(6) Use a do…while loop to validate the main menu choice and to
allow the user to play as many times as he/she wishes.

do {
	menu
	game
	post-game menu

} while (menuChoice != 2);

(8) Use a do…while loop to validate the choices for each
question.

do {
	Question Structure

} while (userAnswer != {correct answer});

(2) Display the user’s total points after each question is
answered.

JOptionPane.showMessageDialog ("Correct!" (or "Incorrect") + "You have " + totalPoints + " Points!");


(2) Include documentation in your code to explain the updates
that were made to this version

UPDATES 11/3/2022:
Fixed errors from last version where the game would exit after certain choices with the lack of loops.
Added loop structures in order to play the game as many times as desired.
Added loop structures to validade menu choices, where the user can see the rules as many times as desired.
Added loop structures to validate each question, where the next question appears after the right answer is chosen.
Added Question 6-7 from Chapter 4
*/

import javax.swing.JOptionPane;

public class javaGamev3 {

	public static void main(String[] args) {
		//Declare
		String userName;
        int userAnswer = 0;
        int totalPoints = 0;
        int menuChoice = 0;
        int userAnswerEnd = 0;
	
		//Display an Introduction to the Game.
		JOptionPane.showMessageDialog(null,"JAVA QUIZ!!");
		
		//Prompt the user for his/her name. 
		userName = JOptionPane.showInputDialog(null, "What is your name?", "Your Name");

        //Loop structre so the user can play the game multiple times
        //UPDATEv3: ADDED LOOP STRUCTURE
        do {
		
		/*Display the following main menu: 
		1) See Rules 
		2) Play Game 
		3) Exit
		Prompt the user for the main menu choice. 
		*/
		
        //Loop Structure if RULES are selected during the initial menu
        //UPDATEv3: ADDED LOOP STRUCTURE
        while (menuChoice == 0)
        {
        String[] responses = {"See Rules", "Play Game", "Exit"};
		menuChoice = JOptionPane.showOptionDialog(null, ("Hi, " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses,0);
		
            //Regardless of user input: 
            //Display the rules for the game in a message box.
            //UPDATES: decision structure for menu decision, if user selects RULES, the rule panel appears.
            //Could use a while loop to return to main menu
            if (menuChoice <= 0){
                JOptionPane.showMessageDialog(null, "RULES");
                JOptionPane.showMessageDialog(null, "Answer each question correctly to earn points"); 
            }
        } 
        //Decision structure if the user chooses "Play Game" in Main Menu
        if (menuChoice <= 1) {
        
            //Display the 3 sets of questions and answers. These questions
		    //should come from the topics in Chapters 1 – 2. 
            
            //Validate Question 1
            do {
            
                //Question 1
                String[] answers1 = {"/", "^", "*"};
                userAnswer = JOptionPane.showOptionDialog(null, ("What is the multiply symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 1
                if (userAnswer == 2) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 2);
		    
            //Validate Question 2
            do {
            
                //Question 2
                String[] answers1 = {"/", "^", "*"};
                userAnswer = JOptionPane.showOptionDialog(null, ("What is the division symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 2
                if (userAnswer == 0) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 0);
		
		    //Validate Question 3
            do {
            
                //Question 3
                String[] answers2 = {"int", "double", "char"};
                userAnswer = JOptionPane.showOptionDialog(null, ("Which variable is used for whole numbers in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers2,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 3
                if (userAnswer == 0) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 0);

            //Validate Question 4
            do {
            
                //Question 4
                //UPDATEv2: Added Question 4 to the Game
                String[] answers3 = {"If", "Switch", "Array"};
                userAnswer = JOptionPane.showOptionDialog(null, ("Which of these are not part of decision structure?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers3,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 4
                if (userAnswer == 2) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 2);

            //Validate Question 5
            do {
            
                //Question 5
                //UPDATEv2: Added Question 5 to the Game
                String[] answers4 = {"If/If Else", "If/Else", "Break"};
                userAnswer = JOptionPane.showOptionDialog(null, ("Which of these should be used in a Two-Way if statement?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers4,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 5
                if (userAnswer == 1) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 1);

            //Validate Question 6
            do {
            
                //Question 6
                //UPDATEv3: Added Question 6 to the Game
                String[] answers6 = {"For", "While", "Do/While"};
                userAnswer = JOptionPane.showOptionDialog(null, ("Which of these can be considered a pre-test loop?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers6,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 5
                if (userAnswer == 0) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 0);

            //Validate Question 7
            do {
            
                //Question 7
                //UPDATEv3: Added Question 7 to the Game
                String[] answers7 = {"++14", "int 14", "14++"};
                userAnswer = JOptionPane.showOptionDialog(null, ("Which of these can be considered a post-fix?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers7,0);
                
                // Decision Structure to decide whether the answer was correct or not for Question 5
                if (userAnswer == 2) {
                    totalPoints = totalPoints + 10;
                    JOptionPane.showMessageDialog(null, "CORRECT! " + " You Have " + totalPoints + " Points");
                }
                else {
                    totalPoints = totalPoints + 0;
                    JOptionPane.showMessageDialog(null, "INCORRECT! " + " You Have " + totalPoints + " Points");
                }
            } while (userAnswer != 2);
            
            //Display how many points the user earned
            JOptionPane.showMessageDialog(null, "You have earned: " + totalPoints + " Points");
            
            //Reset points after the game is played
            //UPDATEv3: ADDED RESET POINTS
            totalPoints = 0;
            
            //Prompt the user for each menu choice. 
		    String[] responsesEnd = {"See Rules", "Play Again", "Exit"};
		    userAnswerEnd = JOptionPane.showOptionDialog(null, ("Thank you for playing " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responsesEnd,0);
            
            //Loop structre if RULES are selectes after the game is played
            //UPDATEv3: ADDED LOOP STRUCTURE
            while (userAnswerEnd == 0) {
                    JOptionPane.showMessageDialog(null, "RULES");
                    JOptionPane.showMessageDialog(null, "Answer each question correctly to earn points");
		            userAnswerEnd = JOptionPane.showOptionDialog(null, ("Thank you for playing " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responsesEnd,0); 
            }

        }
        //Decision structure if the user chooses "Exit" in Main Menu
        else if (menuChoice <= 2) {
            System.exit(0);
        }
    } while (userAnswerEnd == 1);

        
	}

}
