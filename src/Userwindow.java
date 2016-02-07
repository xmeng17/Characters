import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.commons.lang3.StringEscapeUtils;

public class Userwindow {


	public static void main(String[] args) {

		
	JPanel inputlabel = new JPanel();
	inputlabel.setLayout(new FlowLayout());
	JLabel inputlabel1 = new JLabel("Paste your character here:"); //Instructions for input box
	inputlabel.add(inputlabel1);
	
	
	
	
	JPanel inputpanel = new JPanel();
	inputpanel.setLayout(new FlowLayout());
	
	final JTextField inputbox = new JTextField(5); //Input box for user
	inputpanel.add(inputbox);
	inputbox.setText("0");

	
	
	

	JPanel biglabel = new JPanel();
	biglabel.setLayout(new FlowLayout());
	JLabel biglabel1 = new JLabel("Big display:"); //Label for big display box
	biglabel.add(biglabel1);
	
	JPanel bigdisplay = new JPanel();
	final JTextArea bigcharacter = new JTextArea(2,2);
	bigcharacter.setEditable(false);

	Font font = new Font(inputbox.getName(), Font.PLAIN, 100); //Displays user's character in same font but larger size
	bigcharacter.setFont(font);
	bigdisplay.add(new JScrollPane(bigcharacter));

	
	
	
	
	
	
	JPanel infopanel = new JPanel();
	infopanel.setLayout(new FlowLayout());
	
	JPanel Alpha = new JPanel();
	Alpha.setLayout(new BoxLayout(Alpha, BoxLayout.PAGE_AXIS));
	JLabel alphalabel = new JLabel("Alpha entity:");
	final JTextArea alpha = new JTextArea(5,15);
	alpha.setEditable(false);
	alpha.setText("absjbksj");
	Alpha.add(alphalabel);
	Alpha.add(alpha);
	infopanel.add(new JScrollPane(Alpha));
	
	
	
	JPanel Decimal = new JPanel();
	Decimal.setLayout(new BoxLayout(Decimal, BoxLayout.PAGE_AXIS));
	JLabel declabel = new JLabel("Decimal entity:");
	final JTextArea htmlnumber = new JTextArea(5,15);
	htmlnumber.setEditable(false);
	htmlnumber.setText("&#48");
	Decimal.add(declabel);
	Decimal.add(htmlnumber);
	infopanel.add(new JScrollPane(Decimal));
	
	
	
	JPanel Unicode = new JPanel();
	Unicode.setLayout(new BoxLayout(Unicode, BoxLayout.PAGE_AXIS));
	JLabel unilabel = new JLabel("Unicode decimal:");
	final JTextArea unicode = new JTextArea(5,15);
	unicode.setEditable(false);
	unicode.setText("48");
	Unicode.add(unilabel);
	Unicode.add(unicode);
	infopanel.add(new JScrollPane(Unicode));
	
	
	
	JPanel Javacode = new JPanel();
	Javacode.setLayout(new BoxLayout(Javacode, BoxLayout.PAGE_AXIS));
	JLabel javalabel = new JLabel("Java character code:");
	final JTextArea javacode = new JTextArea(5,15);				//Text boxes for required information
	javacode.setEditable(false);
	javacode.setText("0");
	Javacode.add(javalabel);
	Javacode.add(javacode);
	infopanel.add(new JScrollPane(Javacode));
	
	
	
	JPanel Hexpanel = new JPanel();
	Hexpanel.setLayout(new BoxLayout(Hexpanel, BoxLayout.PAGE_AXIS));
	JLabel hexlabel = new JLabel("Hex decimal:");
	final JTextArea Hexnum = new JTextArea(5,15);
	Hexnum.setEditable(false);
	Hexnum.setText("30");
	Hexpanel.add(hexlabel);
	Hexpanel.add(Hexnum);
	infopanel.add(new JScrollPane(Hexpanel));
	
	
	
	JPanel chardespanel = new JPanel();
	chardespanel.setLayout(new BoxLayout(chardespanel, BoxLayout.PAGE_AXIS));
	JLabel charlabel = new JLabel("Character description:");
	JTextArea characterdescription = new JTextArea(5,15);
	characterdescription.setEditable(false);
	characterdescription.setText("absjbksj");
	chardespanel.add(charlabel);
	chardespanel.add(characterdescription);
	infopanel.add(new JScrollPane(chardespanel));
	
	
	
	JPanel seebutton = new JPanel();
	seebutton.setLayout(new FlowLayout());

	
	
	JButton seeresult = new JButton("See information");
	
	seeresult.addActionListener(new ActionListener() {		//Button to display information
	    	 
		public void actionPerformed(ActionEvent e){
			
			String show = inputbox.getText();				//For big character display
			bigcharacter.setText(show); 

			

			String input = inputbox.getText();						

			char inputchar = input.charAt(0);				//Finds and prints html entity number
			int inputnum = inputchar;
			String inputnum1 = Integer.toString(inputnum);	//Link to check: https://mothereff.in/html-entities
			String inputentnum = "&#";
			inputentnum = inputentnum.concat(inputnum1);
			
			htmlnumber.setText(inputentnum);
			
			String Javacode = StringEscapeUtils.escapeJava(input); //Finds and prints Java character code
			javacode.setText(Javacode); 	//Link to check: http://itpro.cz/juniconv/
			
			
			unicode.setText(inputnum1);		//check using https://www.branah.com/unicode-converter
		
			
			
			String hex = Integer.toHexString(inputnum);
			
			Hexnum.setText(hex);		//check at http://www.rapidtables.com/convert/number/hex-to-ascii.htm
		
		}
	});

    seebutton.add(seeresult);

	
	
    

    inputbox.addActionListener(new ActionListener() {
   	 
		public void actionPerformed(ActionEvent e){
			
			String show = inputbox.getText();
			bigcharacter.setText(show); 

			

			String input = inputbox.getText();						

			char inputchar = input.charAt(0);
			int inputnum = inputchar;
			String inputnum1 = Integer.toString(inputnum);
			String inputentnum = "&#";
			inputentnum = inputentnum.concat(inputnum1);
			
			htmlnumber.setText(inputentnum);
			
			String Javacode = StringEscapeUtils.escapeJava(input);
			javacode.setText(Javacode);
			
			
			unicode.setText(inputnum1);
						
			String hex = Integer.toHexString(inputnum);
			
			Hexnum.setText(hex);
		}
	});
    
    
    
    
	JPanel mainframe = new JPanel();
	mainframe.setLayout(new BoxLayout(mainframe, BoxLayout.Y_AXIS));
	
	JFrame mainmainframe = new JFrame();
	
	
	mainframe.add(inputlabel);
	mainframe.add(inputpanel);
	mainframe.add(seebutton);					//Displays app window
	mainframe.add(biglabel);
	mainframe.add(bigdisplay);
	mainframe.add(infopanel);
	
	mainmainframe.add(mainframe);
	mainmainframe.pack();
    mainmainframe.setVisible(true);
	
}
}