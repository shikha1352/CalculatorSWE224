package CalculatorApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorApplication implements ActionListener{

    double num1=0,num2=0,result=0;
    int calculation;
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onRadioButton=new JRadioButton("on")  ;
    JRadioButton ofRadioButton=new JRadioButton("of");

    JButton buttonZero=new JButton("0");
    JButton buttonOne=new JButton("1");
    JButton buttonTwo=new JButton("2");
    JButton buttonThree=new JButton("3");
    JButton buttonFour=new JButton("4");
    JButton buttonFive=new JButton("5");
    JButton buttonSix=new JButton("6");
    JButton buttonSeven=new JButton("7");
    JButton buttonEight=new JButton("8");
    JButton buttonNine=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttonClear=new JButton("AC");
    JButton buttonDelete=new JButton("DEL");
    JButton buttonEqual=new JButton("=");
    JButton buttonMul=new JButton("X");
    JButton buttonDiv=new JButton("/");
    JButton buttonPlus=new JButton("+");
    JButton buttonMinus=new JButton("-");
    JButton buttonSquare=new JButton("x²");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("√");

    CalculatorApplication(){
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui(){
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        ofRadioButton.setBounds(10,120,60,40);
        ofRadioButton.setSelected(true);
        ofRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        ofRadioButton.setBackground(Color.black);
        ofRadioButton.setForeground(Color.white);
        ofRadioButton.setFocusable(false);
        frame.add(ofRadioButton);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(ofRadioButton);

        buttonSeven.setBounds(10,230,60,40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80,230,60,40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150,230,60,40);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(10,290,60,40);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(80,290,60,40);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150,290,60,40);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(10,350,60,40);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80,350,60,40);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150,350,60,40);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10,410,130,40);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(150,188,250));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220,110,60,40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setBackground(new Color(150,188,250));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10,170,60,40);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220,230,60,40);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(150,188,250));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonMinus.setBounds(220,170,60,40);
        buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
        buttonMinus.setBackground(new Color(150,188,250));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);

        buttonPlus.setBounds(220,290,60,40);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
        buttonPlus.setBackground(new Color(150,188,250));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);

        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150,110,60,40);
        buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial",Font.BOLD,12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);


    }
    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        ofRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonZero.addActionListener(this);
    }

    public static void main(String[] args) {
        CalculatorApplication calculator=new CalculatorApplication();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();


        if(source==onRadioButton){
            enable();
        }
        else if(source==ofRadioButton){
            disable();
        }
        else if(source==buttonClear){
            label.setText("");
            textField.setText("");
        }
        else if(source==buttonDelete){
            int length=textField.getText().length();
            int number=length-1;
            if(length>0){
                StringBuilder back=new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if(textField.getText().endsWith(""));
            label.setText("");
        }
        else if(source==buttonZero){
            if(textField.getText().equals("0")){
                return;
            }
            else{
                textField.setText(textField.getText()+"0");
            }
        }
        else if(source==buttonOne){
            textField.setText(textField.getText()+"1");
        }
        else if(source==buttonTwo){
            textField.setText(textField.getText()+"2");
        }
        else if(source==buttonThree){
            textField.setText(textField.getText()+"3");
        }
        else if(source==buttonFour){
            textField.setText(textField.getText()+"4");
        }
        else if(source==buttonFive){
            textField.setText(textField.getText()+"5");
        }
        else if(source==buttonSix){
            textField.setText(textField.getText()+"6");
        }
        else if(source==buttonSeven){
            textField.setText(textField.getText()+"7");
        }
        else if(source==buttonEight){
            textField.setText(textField.getText()+"8");
        }
        else if(source==buttonNine){
            textField.setText(textField.getText()+"9");
        }
        else if(source==buttonDot){
            if(textField.getText().contains(".")){
                return;
            }
            else{
                textField.setText(textField.getText()+".");
            }
        }
        else if(source==buttonPlus){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
            label.setText(str +"+");
        }
        else if(source==buttonMinus){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=2;
            textField.setText("");
            label.setText(str +"-");
        }
        else if(source==buttonMul){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=3;
            textField.setText("");
            label.setText(str +"x");
        }
        else if(source==buttonDiv){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=4;
            textField.setText("");
            label.setText(str +"/");
        }
        else if(source==buttonSquare){
            num1=Double.parseDouble((textField.getText()));
            double square=Math.pow(num1,2);
            String str=Double.toString(square);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }
            else{
                textField.setText((str));
            }
        }
        else if(source==buttonSqrt){
            num1=Double.parseDouble(textField.getText());
            double sqrt=Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }
        else if(source==buttonReciprocal){
            num1=Double.parseDouble((textField.getText()));
            double reciprocal=1/num1;
            String string=Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }
            else{
                textField.setText(string);
            }
        }
        else if(source==buttonEqual){
            num2=Double.parseDouble(textField.getText());
            switch (calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
            }
            if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }
    }
    void disable(){
        onRadioButton.setEnabled(true);
        ofRadioButton.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonReciprocal.setEnabled(false);;
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonZero.setEnabled(false);
    }
    void enable() {
        onRadioButton.setEnabled(false);
        ofRadioButton.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonZero.setEnabled(true);
    }
}
