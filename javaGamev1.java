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
*/

import javax.swing.JOptionPane;

public class teamprojectv1 {

	public static void main(String[] args) {
		//Declare
		String userName;
	
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
		JOptionPane.showOptionDialog(null, ("Hi, " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responses,0); 
		
		//Regardless of user input: 
		//Display the rules for the game in a message box.
		JOptionPane.showMessageDialog(null, "RULES");
		JOptionPane.showMessageDialog(null, "Answer each question correctly to earn points");
		 
		//Display the 3 sets of questions and answers. These questions
		//should come from the topics in Chapters 1 – 2. 
		
		//Question 1
		String[] answers1 = {"/", "^", "*"};
		JOptionPane.showOptionDialog(null, ("What is the multiply symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
		
		//Question 2 (Don't need string[] because the answers are the same)
		JOptionPane.showOptionDialog(null, ("What is the division symbol in java?"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers1,0);
		
		//Question 2
		String[] answers2 = {"int", "double", "char"};
		JOptionPane.showOptionDialog(null, ("Which variable is used for whole numbers in java"), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, answers2,0);
		
		//Prompt the user for each menu choice. 
		String[] responsesEnd = {"See Rules", "Play Again", "Exit"};
		JOptionPane.showOptionDialog(null, ("Thank you for playing " + userName), "JAVA QUIZ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, responsesEnd,0); 
	}

}
