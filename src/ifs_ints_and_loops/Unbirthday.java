package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String birthday;
birthday=JOptionPane.showInputDialog("What is your birthday?");
if(birthday.equals("11/25")) {
JOptionPane.showMessageDialog(null, "Happy Birthday.");	
}
else {
JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday.");	
}
}
}