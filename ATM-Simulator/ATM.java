import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.*;

class Account{
    long accNo;
    String name;
    String accountType;
    double balance;
    String gender;
    int accPin;

    Account(String c[]){
        this.name=c[0];
        this.gender=c[1];
        this.accountType=c[2];
        this.accNo=Long.parseLong(c[3]);
        this.accPin=Integer.parseInt(c[4]);
        this.balance=Double.parseDouble(c[5]);
    }
}

class BalanceEnquiry extends JPanel{
    JLabel Username,UserAccNo,UserAccType,UserAccBal;
    JLabel heading;
    JButton back;
    BalanceEnquiry(){
        setLayout(null);
    setSize(900, 600);
    setBackground(Color.decode("#18c1ab"));

    back=new JButton("Back");
back.setBounds(140,80, 80, 25);
back.setBorderPainted(false);
back.setForeground(Color.white);
back.setBackground(Color.black);
back.setVisible(true);
add(back);

heading = new JLabel("ATM MACHINE");
heading.setBounds(350,70,400,50);
heading.setFont((new Font("Arial", Font.BOLD, 20)));
heading.setForeground(Color.black);
add(heading);

Username = new JLabel();
Username.setBounds(300,150,400,50);
Username.setFont((new Font("Arial", Font.BOLD, 16)));
Username.setForeground(Color.black);
Username.setVisible(false);
add(Username);

UserAccNo = new JLabel();
UserAccNo.setBounds(300,200,400,50);
UserAccNo.setFont((new Font("Arial", Font.BOLD, 16)));
UserAccNo.setForeground(Color.black);
UserAccNo.setVisible(false);
add(UserAccNo);

UserAccType = new JLabel();
UserAccType.setBounds(300,250,400,50);
UserAccType.setFont((new Font("Arial", Font.BOLD, 16)));
UserAccType.setForeground(Color.black);
UserAccType.setVisible(false);
add(UserAccType);

UserAccBal = new JLabel();
UserAccBal.setBounds(300,300,400,50);
UserAccBal.setFont((new Font("Arial", Font.BOLD, 16)));
UserAccBal.setForeground(Color.black);
UserAccBal.setVisible(false);
add(UserAccBal);

    }

    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(85, 50, 720, 5);
g.fillRect(85, 500, 720, 5);
g.fillRect(85, 50, 5, 450);
g.fillRect(800, 50, 5, 450);
 //   g.drawRoundRect(50,50,300,300,10,10);
   // g.drawRoundRect(110, 50, 720, 5);
    }
}

class DepositPanel extends JPanel{
    JLabel deposit,heading;
    JTextField getAmount;
    JButton back,depositButton;
    DepositPanel(){
        setLayout(null);
    setSize(900, 600);
    setBackground(Color.decode("#18c1ab"));

    back=new JButton("Back");
back.setBounds(140,80, 80, 25);
back.setBorderPainted(false);
back.setForeground(Color.white);
back.setBackground(Color.black);
back.setVisible(true);
add(back);

heading = new JLabel("ATM MACHINE");
heading.setBounds(350,70,400,50);
heading.setFont((new Font("Arial", Font.BOLD, 20)));
heading.setForeground(Color.black);
add(heading);

        deposit= new JLabel(" Enter Amount to Deposit");
        deposit.setFont((new Font("Sans-Serif", Font.BOLD, 16)));
        deposit.setBounds(330,150,300,50);
        deposit.setForeground(Color.black);
        add(deposit);

        getAmount = new JTextField();
        getAmount.setBackground(Color.white);
        getAmount.setBounds(330, 200, 200, 25);
        getAmount.setFont(new Font("Segoe UI",Font.BOLD,14));
        getAmount.setBorder(new LineBorder(new Color(0x0b5e57),2));
        add(getAmount);

        depositButton=new JButton("Deposit");
        depositButton.setBounds(380,250, 100, 25);
depositButton.setBorderPainted(false);
depositButton.setForeground(Color.white);
depositButton.setBackground(Color.black);
depositButton.setVisible(true);
add(depositButton);

    }

    
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(85, 50, 720, 5);
g.fillRect(85, 500, 720, 5);
g.fillRect(85, 50, 5, 450);
g.fillRect(800, 50, 5, 450);
 //   g.drawRoundRect(50,50,300,300,10,10);
   // g.drawRoundRect(110, 50, 720, 5);
    }
}

class Homepage extends JPanel{
    JLabel askAccNo,askAccPin;
    JTextField getAccNo,getAccPin;
    JLabel heading;
    Homepage(){
        setLayout(null);
    setSize(900, 600);
  //  setBackground(Color.decode("#e8f6f5"));
    setBackground(Color.decode("#18c1ab"));


heading = new JLabel("WELCOME TO ATM MACHINE");
heading.setBounds(290,100,400,50);
heading.setFont((new Font("Arial", Font.BOLD, 20)));
heading.setForeground(Color.black);
add(heading);

        askAccNo= new JLabel(" Enter Your Account Number :");
        askAccNo.setFont((new Font("Sans-Serif", Font.BOLD, 16)));
        askAccNo.setBounds(310,180,300,50);
        askAccNo.setForeground(Color.black);
        add(askAccNo);

getAccNo = new JTextField();
        getAccNo.setBackground(Color.white);
        getAccNo.setBounds(310, 230, 230, 25);
        getAccNo.setFont(new Font("Segoe UI",Font.BOLD,14));
        getAccNo.setBorder(new LineBorder(new Color(0x0b5e57),2));
        
        add(getAccNo);

        askAccPin= new JLabel("Enter Your Account 4 -Digit PIN :");
        askAccPin.setFont((new Font("Sans-Serif", Font.BOLD, 16)));
        askAccPin.setBounds(310,280,300,50);
        askAccPin.setForeground(Color.black);
        add(askAccPin);

        getAccPin = new JTextField();
        getAccPin.setBackground(Color.white);
        getAccPin.setBounds(310, 330, 230, 25);
        getAccPin.setFont(new Font("Segoe UI",Font.BOLD,14));
        getAccPin.setBorder(new LineBorder(new Color(0x0b5e57),2));
        getAccPin.setEditable(false);
        add(getAccPin);

       
    }

    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(85, 50, 720, 5);
g.fillRect(85, 500, 720, 5);
g.fillRect(85, 50, 5, 450);
g.fillRect(800, 50, 5, 450);
}
}

class WithdrawPanel extends JPanel{
    JLabel wdraw,heading;
    JTextField getAmount;
    JButton back,withdraw;
    WithdrawPanel(){
        setLayout(null);
    setSize(900, 600);
    setBackground(Color.decode("#18c1ab"));

    back=new JButton("Back");
back.setBounds(140,80, 80, 25);
back.setBorderPainted(false);
back.setForeground(Color.white);
back.setBackground(Color.black);
back.setVisible(true);
add(back);

heading = new JLabel("ATM MACHINE");
heading.setBounds(350,70,400,50);
heading.setFont((new Font("Arial", Font.BOLD, 20)));
heading.setForeground(Color.black);
add(heading);

        wdraw= new JLabel(" Enter Amount to Withdraw");
        wdraw.setFont((new Font("Sans-Serif", Font.BOLD, 16)));
        wdraw.setBounds(330,150,300,50);
        wdraw.setForeground(Color.black);
        add(wdraw);

        getAmount = new JTextField();
        getAmount.setBackground(Color.white);
        getAmount.setBounds(330, 200, 200, 25);
        getAmount.setFont(new Font("Segoe UI",Font.BOLD,14));
        getAmount.setBorder(new LineBorder(new Color(0x0b5e57),2));
        add(getAmount);

        withdraw=new JButton("Withdraw");
        withdraw.setBounds(380,250, 100, 25);
withdraw.setBorderPainted(false);
withdraw.setForeground(Color.white);
withdraw.setBackground(Color.black);
withdraw.setVisible(true);
add(withdraw);

    }

    
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(85, 50, 720, 5);
g.fillRect(85, 500, 720, 5);
g.fillRect(85, 50, 5, 450);
g.fillRect(800, 50, 5, 450);
 //   g.drawRoundRect(50,50,300,300,10,10);
   // g.drawRoundRect(110, 50, 720, 5);
    }
}

class Menupage extends JPanel{
JLabel user,heading;
JButton withdraw,deposit,checkBal;
JButton back;
Menupage(){
    setLayout(null);
    setSize(1000,600);
    setBackground(Color.decode("#18c1ab"));

    
    back=new JButton("Back");
back.setBounds(140,80, 80, 25);
back.setBorderPainted(false);
back.setForeground(Color.white);
back.setBackground(Color.BLACK);
add(back);

heading = new JLabel("ATM MACHINE");
heading.setBounds(350,70,400,50);
heading.setFont((new Font("Arial", Font.BOLD, 20)));
heading.setForeground(Color.black);
add(heading);

user = new JLabel("WELCOME ");
user.setBounds(200,130,400,50);
user.setFont((new Font("Sans-Serif", Font.BOLD, 20)));
user.setForeground(Color.black);
add(user);

deposit = new JButton("Deposit  Amount");
deposit.setFont((new Font("Sans-Srif", Font.BOLD, 14)));
deposit.setBounds(350, 200,160,30);
deposit.setContentAreaFilled(true);
deposit.setFocusPainted(false);
deposit.setOpaque(true);
deposit.setForeground(Color.white);
deposit.setBorderPainted(false);
deposit.setBackground(Color.black);
add(deposit);

withdraw = new JButton("Withdraw Amount");
withdraw.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
withdraw.setBounds(350, 260,160,30);
withdraw.setContentAreaFilled(true);
withdraw.setFocusPainted(false);
withdraw.setOpaque(true);
withdraw.setForeground(Color.white);
withdraw.setBorderPainted(false);
withdraw.setBackground(Color.black);
add(withdraw);

checkBal = new JButton("Check Balance");
checkBal.setFont((new Font("Sans-Serif", Font.BOLD, 14)));
checkBal.setBounds(350, 320,160,30);
checkBal.setContentAreaFilled(true);
checkBal.setFocusPainted(false);
checkBal.setOpaque(true);
checkBal.setForeground(Color.white);
checkBal.setBorderPainted(false);
checkBal.setBackground(Color.black);
add(checkBal);

}

protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(85, 50, 720, 5);
g.fillRect(85, 500, 720, 5);
g.fillRect(85, 50, 5, 450);
g.fillRect(800, 50, 5, 450);
}

    
}

class ATM extends JFrame implements ActionListener{
    CardLayout card;
    JPanel mainp;
HashMap<Long,Integer> customers;
HashMap<Integer, Account> accounts;
Homepage hpage;
Menupage mpage;
WithdrawPanel w;
DepositPanel dp;
BalanceEnquiry be;
Account curreAccount;
    ATM(){
   // setLayout(null);
    setSize(900, 600);
    getContentPane().setBackground(Color.decode("#18c1ab"));
   // getContentPane().setBackground(Color.decode("#36ff20"));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    card = new CardLayout();
    mainp = new JPanel(card);
    hpage= new Homepage();
    mainp.add(hpage, "HPANEL");
    mpage = new Menupage();
    mainp.add(mpage,"MPANEL");
w= new WithdrawPanel();
mainp.add(w,"WPANEL");
dp = new DepositPanel();
mainp.add(dp,"DPANEL");
be= new BalanceEnquiry();
mainp.add(be, "BEPANEL");
    
mpage.deposit.addActionListener(this);
mpage.withdraw.addActionListener(this);
mpage.back.addActionListener(this);
w.back.addActionListener(this);
dp.back.addActionListener(this);
be.back.addActionListener(this);
mpage.checkBal.addActionListener(e -> {
    card.show(mainp, "BEPANEL");
be.Username.setVisible(true);
be.Username.setText("Account Holder Name : "+ curreAccount.name);
be.UserAccNo.setVisible(true);
be.UserAccNo.setText("Account Number : "+curreAccount.accNo);
be.UserAccType.setVisible(true);
be.UserAccType.setText("Account Type : "+curreAccount.accountType);
be.UserAccBal.setVisible(true);
be.UserAccBal.setText("Current Balance : "+curreAccount.balance);

});
dp.depositButton.addActionListener(e -> {
    if(dp.getAmount.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please Enter Amount to Deposit");
                    dp.getAmount.setText("");
return;}
if(!dp.getAmount.getText().trim().matches("\\d+")){
        JOptionPane.showMessageDialog(null, "Please Enter valid Amount ");
                    dp.getAmount.setText("");
return;}
double Amount = Double.parseDouble(dp.getAmount.getText().trim());
if(Amount>0){
    curreAccount.balance+=Amount;
try{
    updateAccounts(); }
    catch(IOException ioe){

    }
    JOptionPane.showMessageDialog(null, "Transcation Successful");
                    dp.getAmount.setText("");
                    
return;
}

});


w.withdraw.addActionListener(e -> {
    if(w.getAmount.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please Enter Amount to Withdraw");
                    w.getAmount.setText("");
return;}

if(!w.getAmount.getText().trim().matches("\\d+")){
        JOptionPane.showMessageDialog(null, "Please Enter valid Amount ");
                    w.getAmount.setText("");
return;}
double Amount = Double.parseDouble(w.getAmount.getText().trim());
if((curreAccount.balance-Amount)<=0){
    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    w.getAmount.setText("");
return;
}
if((curreAccount.balance-Amount)>0){
    curreAccount.balance-=Amount;
    try{
    updateAccounts(); }
    catch(IOException ioe){

    }
    JOptionPane.showMessageDialog(null, "Transcation Successful");
                    w.getAmount.setText("");
                    System.out.println(curreAccount.balance+" "+curreAccount.name);
return;
}  

});

hpage.getAccNo.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke){
               if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                if(hpage.getAccNo.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter your Account Number");
                    hpage.getAccNo.setText("");
return;}
                if(!hpage.getAccNo.getText().trim().matches("^[1-9]\\d{9}$")){
                    JOptionPane.showMessageDialog(null, "Please Enter valid Account Number");
                    hpage.getAccNo.setText("");
return;
                }

                hpage.getAccPin.setEditable(true);
               } 
            }
        });

        hpage.getAccPin.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke){
               if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                if(hpage.getAccPin.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter your Account PINr");
                    hpage.getAccPin.setText("");
return;}
                if(!hpage.getAccPin.getText().trim().matches("^[1-9]\\d{3}$")){
                    JOptionPane.showMessageDialog(null, "Please Enter valid Account PIN");
                    hpage.getAccPin.setText("");
return;
                }
                
                    int pin = Integer.parseInt(hpage.getAccPin.getText().trim());
                    long accNum=Long.parseLong(hpage.getAccNo.getText().trim());

                if(!customers.containsKey(accNum)){
                    JOptionPane.showMessageDialog(null, "No match found..Try Again");
                    hpage.getAccNo.setText("");
                    hpage.getAccPin.setText("");
                    return;
                }
                if(customers.containsKey(accNum)){
                    if(customers.get(accNum)!=pin){
                    JOptionPane.showMessageDialog(null, "Incorrect PIN..Try Again");
                    hpage.getAccPin.setText("");
                    return;  }
                    if(customers.get(accNum)==pin){
                card.show(mainp, "MPANEL"); }
                Account a = accounts.get(pin);
                curreAccount = a;
                if(a.gender.equals("M")){
                    mpage.user.setText("Welcome Mr."+a.name);
                }
                else{
                    mpage.user.setText("Welcome Mrs."+a.name);
                }

                    
                }
    }//keycode if
            }//keyeve
        
        
        });//keyadp

customers = new HashMap<>();
accounts= new HashMap<>();

add(mainp);

try {
    loadAccounts();
}
catch(IOException ioe){}
//card.show(mainp,"HPANEL");
    setVisible(true);
    }

    public void loadAccounts() throws IOException {
BufferedReader br = new BufferedReader(new FileReader("bankAccounts.txt"));
String str;
while((str=br.readLine() )!= null){
String c[] = str.trim().split("[|][|]");
Account a = new Account(c);
customers.put(a.accNo, a.accPin);
accounts.put(Integer.parseInt(c[4]), a);
System.out.println(a.name);
}
    }

    public void updateAccounts() throws IOException{
        new PrintWriter("bankAccounts.txt").close();
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bankAccounts.txt")));
        
        accounts.forEach((key, value)-> {
            pw.println(value.name+"||"+value.gender+"||"+value.accountType+"||"+value.accNo+"||"+value.accPin+"||"+value.balance); 
        });
    pw.close();

}

    
protected void paintComponent(Graphics g) {
paintComponent(g);
 g.setColor(Color.BLACK);
g.fillRect(110, 50, 720, 5);
g.fillRect(110, 500, 720, 5);
g.fillRect(110, 50, 5, 450);
g.fillRect(825, 50, 5, 450);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(mpage.withdraw)){
            card.show(mainp,"WPANEL");
        }
        if(e.getSource().equals(mpage.deposit)){
            card.show(mainp,"DPANEL");
        }
        if(e.getSource().equals(mpage.back)){
            card.show(mainp,"HPANEL");
            hpage.getAccNo.setText("");
            hpage.getAccPin.setText("");
        }
        if(e.getSource().equals(w.back) || e.getSource().equals(dp.back) || e.getSource().equals(be.back)){
            card.show(mainp,"MPANEL");
        }
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(ATM::new);
    }

}
