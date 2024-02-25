import java.awt.*;
import java.util.*;

public class RowdyHacksFinal {
 public static Scanner scnr = new Scanner(System.in);
  
    public static void main(String[] args) {
  
      DrawingPanel panel = new DrawingPanel(400, 500); 
 Graphics g = panel.getGraphics( );
 
 
 //set background
    Color pink = new Color (255, 188, 217);
    panel.setBackground(pink);
    
    //left 
     //visual bar at the top 
 g.setColor(Color.WHITE);
 
 
 g.fillRect(40, 40, 300, 65); 
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 40, 300, 65);
 
//first column
//lower buttons - 75 difference on y
  g.setColor(Color.WHITE);
 g.fillRect(40, 430, 50, 50);
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 430, 50, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
 g.setColor(Color.GRAY);
 g.drawString("+/-", 53, 463); //+-
 
  g.setColor(Color.WHITE);
 g.fillRect(40, 355, 50, 50); 
  g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 355, 50, 50);
  g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
  g.drawString("1", 60, 388); //1
 
  g.setColor(Color.WHITE);
 g.fillRect(40, 280, 50, 50);
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 280, 50, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
  g.drawString("4", 60, 313); //4

  g.setColor(Color.WHITE);
 g.fillRect(40, 205, 50, 50);  
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 205, 50, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
  g.drawString("7", 60, 238); //7
   
  g.setColor(Color.WHITE);
 g.fillRect(40, 130, 65, 50);
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(40, 130, 65, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
  g.drawString("CE", 60, 163);  //CE(clear)
//upper buttons
  // second column
 //down - 75 difference on y
  g.setColor(Color.WHITE);
 g.fillRect(120, 430, 50, 50);
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(120, 430, 50, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
  g.drawString("0", 140, 463); //0 
  
  g.setColor(Color.WHITE);
 g.fillRect(120, 355, 50, 50); 
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(120, 355, 50, 50);
g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
g.drawString("2", 140, 388);//2

  g.setColor(Color.WHITE);
 g.fillRect(120, 280, 50, 50);  
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(120, 280, 50, 50);
g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
g.drawString("5", 140, 313); //5

  g.setColor(Color.WHITE);
 g.fillRect(120, 205, 50, 50);
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(120, 205, 50, 50);
 g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
   g.setColor(Color.GRAY);
g.drawString("8", 140, 238);//8
   
  g.setColor(Color.WHITE);
 g.fillRect(120, 130, 50, 50);  
 g.setColor(Color.LIGHT_GRAY);
 g.drawRect(120, 130, 50, 50);
g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 17));
   g.setColor(Color.GRAY);
   g.drawString("back", 127, 163); //back
//up
   
    //last column  
    calculator(g, '/', 310, 160);
    calculator(g, '*', 310, 238);
    calculator(g, '-', 310, 313);
    calculator(g, '+', 310, 388);
    calculator(g, '=', 310, 463);       
    
    //third column
    calculator(g, '%', 225, 160); 
    calculator(g, '9', 225, 238); 
    calculator(g, '6', 225, 313); 
    calculator(g, '3', 225, 388); 
    calculator(g, '.', 225, 463); 
    
       int input1 = scnr.nextInt();  
    String operations = scnr.next();  
    String String1 = String.valueOf(input1); 
     
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    g.drawString(String1, 80, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    g.drawString(operations, 100, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
     
    // Addition 
    if (operations.equals("+")){ 
      int input2 = scnr.nextInt(); 
      System.out.println("= " + (input1 + input2)); 
          String String2 = String.valueOf(input2); 
      g.drawString(String2, 120, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    g.drawString("=", 160, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    String result = String.valueOf(input1 + input2); 
    g.drawString(result, 200, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    } 
    // Subtraction 
    else if (operations.equals("-")){ 
      int input2 = scnr.nextInt(); 
      System.out.println("= " + (input1 - input2)); 
          String String2 = String.valueOf(input2); 
      g.drawString(String2, 120, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
        g.drawString("=", 160, 80); 
            g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
        String result = String.valueOf(input1 - input2); 
        g.drawString(result, 200, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    } 
    // Multiplication 
    else if (operations.equals("*")){ 
      int input2 = scnr.nextInt(); 
      System.out.println("= " + (input1 * input2)); 
          String String2 = String.valueOf(input2); 
      g.drawString(String2, 120, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    g.drawString("=", 160, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
        String result = String.valueOf(input1 * input2); 
        g.drawString(result, 200, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    } 
    // Division 
    else if (operations.equals("/")){ 
      int input2 = scnr.nextInt(); 
      System.out.println("= " + (input1 / input2)); 
          String String2 = String.valueOf(input2); 
      g.drawString(String2, 120, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    g.drawString("=", 160, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
        String result = String.valueOf(input1 / input2); 
        g.drawString(result, 200, 80); 
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20)); 
    } 
     
     
  }
  
  public static void calculator(Graphics g, char operators, int x, int y) {
    int newx = x-20;
    int newy = y-30;
    
    g.setColor(Color.WHITE);
    g.fillRect(newx, newy , 50, 50);
    g.setColor(Color.LIGHT_GRAY);
    g.drawRect(newx, newy, 50, 50);
    g.setFont(new Font("COPPERPLATE GOTHIC", Font.BOLD, 20));
    g.setColor(Color.GRAY);
    g.drawString(String.valueOf(operators), x+1, y+3);
  }
}
 
