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
The Second version of this project displays input and output for a game, where dialog boxes are used and questions about programming
re the challenge of this game

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

*/

import javax.swing.JOptionPane;

public class javaGamev2 {

	public static void main(String[] args) {
		//Declare
		String userName;
        int userAnswer = 0;
        int totalPoints = 0;
	
		//Display an Introduction to the Game.
		JOptionPane.showMessageDialog(null,"JAVA QUIZ!!");
		
		//Prompt the user for his/her name. 
		userName = JOptionPane.showInputDialog(null, "What is your name?", "Your Name");
		
		/*Display the following main menu: 
		1) See Rules 
		2) Play Game 
		3) Exit
		Prompt the user for the main menu choice. 
		*/
		String[] responses = {"See Rules", "Play Game", "Exit"};
		int menuChoice = JOptionPane.showOptionDialog(null, ("Hi, " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses,0);
		
		//Regardless of user input: 
		//Display the rules for the game in a message box.
        //UPDATES: decision structure for menu decision, if user selects RULES, the rule panel appears.
        //Could use a while loop to return to main menu
        if (menuChoice <= 0){
		    JOptionPane.showMessageDialog(null, "RULES");
		    JOptionPane.showMessageDialog(null, "Answer each question correctly to earn points"); 
        }
        //Decision structure if the user chooses "Play Game" in Main Menu
        else if (menuChoice <= 1) {
        
            //Display the 3 sets of questions and answers. These questions
		    //should come from the topics in Chapters 1 – 2. 
            
            //Question 1
		    String[] answers1 = {"/", "^", "*"};
		    userAnswer = JOptionPane.showOptionDialog(null, ("What is the multiply symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
            
            // Decision Structure to decide whether the answer was correct or not for Question 1
            if (userAnswer == 2) {
                totalPoints = totalPoints + 10;
                JOptionPane.showMessageDialog(null, "CORRECT! " + totalPoints + " Points");
            }
            else {
                totalPoints = totalPoints + 0;
                JOptionPane.showMessageDialog(null, "INCORRECT! " + totalPoints + " Points");
            }
		    
            //Question 2 (Don't need string[] because the answers are the same)
		    userAnswer = JOptionPane.showOptionDialog(null, ("What is the division symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
            
            // Decision Structure to decide whether the answer was correct or not for Question 2
            if (userAnswer == 0) {
                totalPoints = totalPoints + 10;
                JOptionPane.showMessageDialog(null, "CORRECT! " + totalPoints + " Points");
            }
            else {
                totalPoints = totalPoints + 0;
                JOptionPane.showMessageDialog(null, "INCORRECT! " + totalPoints + " Points");
            }
		
		    //Question 3
		    String[] answers2 = {"int", "double", "char"};
		    userAnswer = JOptionPane.showOptionDialog(null, ("Which variable is used for whole numbers in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers2,0);
            
            // Decision Structure to decide whether the answer was correct or not for Question 3
            if (userAnswer == 0) {
                totalPoints = totalPoints + 10;
                JOptionPane.showMessageDialog(null, "CORRECT! " + totalPoints + " Points");
            }
            else {
                totalPoints = totalPoints + 0;
                JOptionPane.showMessageDialog(null, "INCORRECT! " + totalPoints + " Points");
            }

            //Question 4
            //UPDATE: Added Question 4 to the Game
		    String[] answers3 = {"If", "Switch", "Array"};
		    userAnswer = JOptionPane.showOptionDialog(null, ("Which of these are not part of decision structure?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers3,0);
            
            // Decision Structure to decide whether the answer was correct or not for Question 4
            if (userAnswer == 2) {
                totalPoints = totalPoints + 10;
                JOptionPane.showMessageDialog(null, "CORRECT! " + totalPoints + " Points");
            }
            else {
                totalPoints = totalPoints + 0;
                JOptionPane.showMessageDialog(null, "INCORRECT! " + totalPoints + " Points");
            }

            //Question 5
            //UPDATE: Added Question 5 to the Game
		    String[] answers4 = {"If/If Else", "If/Else", "Break"};
		    userAnswer = JOptionPane.showOptionDialog(null, ("Which of these should be used in a Two-Way if statement?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers4,0);
            
            // Decision Structure to decide whether the answer was correct or not for Question 5
            if (userAnswer == 1) {
                totalPoints = totalPoints + 10;
                JOptionPane.showMessageDialog(null, "CORRECT! " + totalPoints + " Points");
            }
            else {
                totalPoints = totalPoints + 0;
                JOptionPane.showMessageDialog(null, "INCORRECT! " + totalPoints + " Points");
            }
            
            //Display how many points the user earned
            JOptionPane.showMessageDialog(null, "You have earned: " + totalPoints + " Points");

            //Prompt the user for each menu choice. 
		    String[] responsesEnd = {"See Rules", "Play Again", "Exit"};
		    JOptionPane.showOptionDialog(null, ("Thank you for playing " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responsesEnd,0);


        }
        //Decision structure if the user chooses "Exit" in Main Menu
        else if (menuChoice <= 2) {
            System.exit(0);
        }

        
	}

}
