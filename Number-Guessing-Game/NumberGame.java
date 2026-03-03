import java.util.Random;
import java.io.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class NumberGame extends JFrame{
JTextField getInput;
JLabel input,verdict;
JLabel heading,note;
JLabel choiceLeft,choiceCompleted,Rounds;
JButton start,exit,newGame,check;
Random rand;
int num,i=0,won=0,rounds=1; 
boolean Won = false;
int guessed;

NumberGame(){
setLayout(null);
setSize(600, 750);
getContentPane().setBackground(Color.decode("#1e1e2f"));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

rand = new Random();
num = rand.nextInt(1,100);
System.out.println(num);


start = new JButton("START GAME");
start.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
start.setBounds(215, 150,140,30);
start.setContentAreaFilled(true);
start.setFocusPainted(false);
start.setOpaque(true);
start.setForeground(Color.black);
start.setBorderPainted(false);
//start.setBackground(new Color(13,165,116));
start.setBackground(Color.decode("#f39c12"));
start.addActionListener(e -> {
input.setVisible(true);
verdict.setVisible(true);
choiceCompleted.setVisible(true);
choiceLeft.setVisible(true);
getInput.setVisible(true);
check.setVisible(true);
note.setVisible(true);
Rounds.setVisible(true);
});
add(start);

note = new JLabel("(Enter a number between 1 and 100)");
note.setBounds(170,200,300,30);
note.setFont((new Font("Sans-Serif", Font.ITALIC, 16)));
note.setForeground(Color.white);
note.setVisible(false);
add(note);

choiceLeft = new JLabel("Choices Left : "+(i+3));
//choiceLeft.setBounds(130,250,300,50);
choiceLeft.setBounds(80,250,250,50);
choiceLeft.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
choiceLeft.setVisible(false);
choiceLeft.setForeground(Color.white);
add(choiceLeft);

choiceCompleted= new JLabel("Choices Completed : "+i);
//choiceCompleted.setBounds(300,250,300,50);
choiceCompleted.setBounds(220,250,250,50);
choiceCompleted.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
choiceCompleted.setVisible(false);
choiceCompleted.setForeground(Color.white);
add(choiceCompleted);

Rounds =new JLabel("Round(s) : "+rounds);
Rounds.setBounds(400,250,100,50);
Rounds.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
Rounds.setVisible(false);
Rounds.setForeground(Color.white);
add(Rounds);

input = new JLabel("Your Guess : ");
input.setBounds(130,300,150,50);
input.setFont((new Font("Sans-Serif", Font.BOLD, 16)));
input.setVisible(false);
input.setForeground(Color.white);
add(input);

getInput = new JTextField();
getInput.setBounds(250,315,175,25);
getInput.setVisible(false);
getInput.setFont(new Font("Arial",Font.BOLD,12));

add(getInput);

verdict = new JLabel("");
verdict.setBounds(225, 420, 100,30);
verdict.setFont((new Font("Arial", Font.BOLD, 16)));
verdict.setVisible(false);
verdict.setForeground(Color.white);
add(verdict);




check = new JButton("CHECK");
verdict.setVisible(true);
check.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
check.setBounds(225, 360,100,30);
check.setContentAreaFilled(true);
check.setFocusPainted(false);
check.setOpaque(true);
check.setForeground(Color.black);
check.setBorderPainted(false);
check.setBackground(Color.decode("#f39c12"));
check.setVisible(false);
check.addActionListener(e -> { 
    if((i+1)==4 || (3-i)==0){
        JOptionPane.showMessageDialog(this, "No Choices Left");
       // return; 
       // check.setEnabled(false);
        askForNewGame();
    return; }
    //verdict.setVisible(true);

    if(getInput.getText().isEmpty() ){
        
        if(i!=0 ){
        JOptionPane.showMessageDialog(this, "Please Enter a Number");
        return; }
        if((i==0) && (rounds>=1)){
            //JOptionPane.showMessageDialog(this, "Please Enter a Number");
        return;
        }
    }

    
//getInput.getText().matches("^[0-9]\\d{1}$") ||

    if( getInput.getText().trim().matches("\\d+") || getInput.getText().trim().matches("-\\d+")){
         guessed = Integer.parseInt(getInput.getText().trim());
        if(guessed==0 || guessed>100 || guessed<0){
            getInput.setText("");
            JOptionPane.showMessageDialog(this, "Enter Number between 1 and 100");
        return; }
        if(num==guessed){
            verdict.setText("\"You WON!\"");
            JOptionPane.showMessageDialog(this, "       Congratulations🎉...\n       You WON!","",JOptionPane.PLAIN_MESSAGE);
         
            
            won++;
            Won = true;
            askForNewGame();
            return;
        }
        

        else{
            
            if(Math.abs(num-guessed)<=5)
                verdict.setText("\"Too Near\"");
            else if(Math.abs(num-guessed)<=10 && Math.abs(num-guessed)>5)
                verdict.setText("  \"Near\"");
            else if(Math.abs(num-guessed)<=20 && Math.abs(num-guessed)>10)
                verdict.setText("  \"Far\"");
            else if(Math.abs(num-guessed)>20)
                verdict.setText("\"Too Far\"");
            
        }

        getInput.setText("");
        i++;
        if(i<=3)
        changeChoice(i);
       
    }

    else{
        
        JOptionPane.showMessageDialog(this, "Enter only Number");
        getInput.setText("");
       // i++;
        if(i<=3)
        changeChoice(i);
return; }
    
    
});
add(check);

//verdict.setVisible(false);

heading = new JLabel("Number Guessing Game");
heading.setBounds(180,50,300,50);
heading.setFont((new Font("Sans-Serif", Font.BOLD, 18)));
heading.setForeground(Color.white);
add(heading);




setVisible(true);
}



public void changeChoice(int m){
    choiceLeft.setText("Choices Left : "+ Math.abs(3-m));
    choiceCompleted.setText("Choices Completed : "+(m));
}

public void askForNewGame(){
    
   // JOptionPane.showMessageDialog(this,"Your Score : "+won); 
   if(Won==false)
   JOptionPane.showMessageDialog(this,"The Number was : "+ num);
   
int choice = JOptionPane.showConfirmDialog(this, "Game Completed... \n Your Total Score : "+ won +"\n Want to play Again ?","", JOptionPane.YES_NO_OPTION);
           // JOptionPane.showMessageDialog(this, "Game completed"); 
           if(choice==JOptionPane.YES_OPTION)
            resetGame();
        else{ 
            dispose(); }
          //  return;
        }


public void resetGame(){
    Won = false;
    rounds++;
    Rounds.setText("Round(s) : "+rounds);
    i=0;
changeChoice(i);
check.setEnabled(true);
getInput.setText("");
verdict.setText("");
num = rand.nextInt(1,100);
System.out.println(num);

}
public static void main(String args[]){
SwingUtilities.invokeLater(NumberGame::new);
}
}