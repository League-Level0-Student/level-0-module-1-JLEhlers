package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
JOptionPane.showMessageDialog(null, "Answer my riddles.");
String question;
question=JOptionPane.showInputDialog("A box without hinges, key, or lid, yet golden treasure inside is hid.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (question.equals("egg")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong, the answer is egg");	
}
		// 6. Add some more riddles
String question2;
question2=JOptionPane.showInputDialog("Everbody has me, but nobody can lose me");
if(question2.equals("shadow")) {
JOptionPane.showMessageDialog(null, "Correct");	
score++;
}
else {
JOptionPane.showMessageDialog(null, "Wrong, the answer is shadow");	
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, score);
	}
}

