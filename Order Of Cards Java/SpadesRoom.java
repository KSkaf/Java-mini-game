import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.*;
import java.text.ParseException;
import java.util.Scanner;
public class SpadesRoom extends JFrame implements ActionListener 
{
	 JPanel layerOne;
	 JPanel layerTwo;
	 JPanel layerThree;
	 JPanel layerFour;
	 JPanel layerFive;
	JButton b1 =new JButton ("Ace");
	JButton b2 =new JButton ("Two");
	JButton b3 =new JButton ("Three");
	JButton b4 =new JButton ("Four");
	JButton b5 =new JButton ("Five");
	JButton b6 =new JButton ("Six");
	JButton b7 =new JButton ("Seven");
	JButton b8 =new JButton ("Eight");
	JButton b9 =new JButton ("Nine");
	JButton b10 =new JButton ("Ten");
	JButton b11 =new JButton ("Jack");
	JButton b12 =new JButton ("Queen");
	JButton b13 =new JButton ("King");
    JButton b14 =new JButton ("Joker");
	JTextField tf =new JTextField ();
	
	public SpadesRoom() throws ParseException
	{
		super("Spades Room");
		setSize(1900,800);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        layerOne = new JPanel();
        layerTwo = new JPanel();
        layerThree = new JPanel();
        layerFour = new JPanel();
        layerFive = new JPanel();
        
        // Add layer one
        tf = new JFormattedTextField(new MaskFormatter("*************************************************************************************************"));
        tf.setEditable(false);
        tf.setColumns(50);
        layerOne.add(tf);
        // Add layer two
        b1 = new JButton(String.valueOf("Ace"));
        b2 = new JButton(String.valueOf("Two"));
        b3 = new JButton(String.valueOf("Three"));
        b4 = new JButton(String.valueOf("Four"));
        layerTwo.add(b1);
        layerTwo.add(b2);
        layerTwo.add(b3);
        layerTwo.add(b4);
        

        // Add layer three
        b5 = new JButton(String.valueOf("Five"));
        b6 = new JButton(String.valueOf("Six"));
        b7 = new JButton(String.valueOf("Seven"));
        b8 = new JButton(String.valueOf("Eight"));
        layerThree.add(b5);
        layerThree.add(b6);
        layerThree.add(b7);
        layerThree.add(b8);

        // Add layer four
        b9 = new JButton(String.valueOf("Nine"));
        b10 = new JButton(String.valueOf("Ten"));
        b11 = new JButton(String.valueOf("Jack"));
        b12 = new JButton(String.valueOf("Queen"));
        layerFour.add(b9);
        layerFour.add(b10);
        layerFour.add(b11);
        layerFour.add(b12);

        // Add layer five
        b13 = new JButton(String.valueOf("King"));
        b14 = new JButton(String.valueOf("Joker"));
        layerFive.add(b13);
        layerFive.add(b14);

       
        
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		
	}
	
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()== b1) tf.setText("Yesterday I saw the Jack run out of the kitchen, he was in shock. I think he might did it...");
			if (e.getSource()== b2) tf.setText("After we find out about Queen Ace was the only one with straight face. I think he might did it...");
			if (e.getSource()== b3) tf.setText("Our Queen had a private meeting with Heart's Queen yesterday .I think she might did it...");
			if (e.getSource()== b4) tf.setText("The Joker came out of a kitchen before Jack and he was in hurry.I think he might did it...");
			if (e.getSource()== b5) tf.setText("I saw Two with a knife heading out of the kitchen to the garden.I think he might did it...");
			if (e.getSource()== b6) tf.setText("Eight was the cook yesterday he could easily use poison.I think he might did it...");
			if (e.getSource()== b7) tf.setText("Ten was the driver of Heart's.I think he might did it...");
			if (e.getSource()== b8) tf.setText("Seven was the one who served the dinner.I think he might did it...");
			if (e.getSource()== b9) tf.setText("Six brought the drinks.I think he might did it...");
			if (e.getSource()== b10) tf.setText("Three took her for a tour of the garden,since he is the gardener.I think he might did it... ");
			if (e.getSource()== b11) tf.setText("Four accompanied them to the dining table.I think he might did it...");
			if (e.getSource()== b12) tf.setText("Our loyal card Nine took her for a tour in our castle.I think he might did it... ");
			if (e.getSource()== b13) tf.setText("I saw Five exited the restroom about the same time as Heart's.I think he might did it...");
			if (e.getSource()== b14) tf.setText("Our King had a secret relationship with Heart's.I think he might did it...");
			
	   }
		static final SpadesRoom newInstance() throws ParseException{
	        final SpadesRoom sr = new SpadesRoom();
	        sr.b1.addActionListener(sr);
	        sr.b2.addActionListener(sr);
	        sr.b3.addActionListener(sr);
	        sr.b4.addActionListener(sr);
	        sr.b5.addActionListener(sr);
	        sr.b6.addActionListener(sr);
	        sr.b7.addActionListener(sr);
	        sr.b8.addActionListener(sr);
	        sr.b9.addActionListener(sr);
	        sr.b10.addActionListener(sr);
	        sr.b11.addActionListener(sr);
	        sr.b12.addActionListener(sr);
	        sr.b13.addActionListener(sr);
	        sr.b14.addActionListener(sr);
	     
	       
	        sr.add(sr.layerOne);
	        sr.add(sr.layerTwo);
	        sr.add(sr.layerThree);
	        sr.add(sr.layerFour);
	        sr.add(sr.layerFive);
	        sr.setSize(1200, 700);
	        sr.setLocationRelativeTo(null);
	        return sr;
	    }
		public static void main(String args[])
		{
			System.out.println("In this game you have to find the killer out of 14 people");
			System.out.println("Someone had killed Queen of Hearts in the kitchen");
			System.out.println("Each one of them will tell you his story...");
			System.out.println("This game requires your deduction");
			SwingUtilities.invokeLater(new Runnable(){
	            @Override
	            public void run() 
	            {
	                try 
	                {
	                    SpadesRoom.newInstance().setVisible(true);
	                } catch (ParseException e)
	                {
	                    e.printStackTrace();
	                }
	            }
	        });
			
			Scanner spadez = new Scanner(System.in);
			System.out.println("Who is the killer???(First letter caps) ");
			String choice = spadez.next();
	        if(choice.equals("Jack"))
	        {
	        	System.out.println("Correct Jack is the killer...he left the kitchen in shock in order to look less suspicious");
	        }
	        else
	        {
	        	System.out.println("You lose...Jack was the killer.He left the kitchen in shock in order to look less suspicious");
	        	System.out.println("Joker left in hurry in order to call the police to arrest Jack");
	        	System.out.println("Two head out to cut a rose to offer to the Queen");
	        	return;
	        }
		}
	
}
