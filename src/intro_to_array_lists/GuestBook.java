package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Spliterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class GuestBook implements ActionListener{
	 // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
    ArrayList<String> names = new ArrayList<String>();

    int num = 5;
	public static void main(String[] args) {
		new GuestBook();
	}
	public GuestBook() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		String listOfName = "Guest #1: Bob Banders \n" + 
				"Guest #2: Sandy Summers \n" + 
				"Guest #3: Greg Ganders \n" + 
				"Guest #4: Donny Doners";
		String SplitListOfNames[] = listOfName.split("\n");
		for (int i = 0; i < SplitListOfNames.length; i++) {
			names.add(SplitListOfNames[i]);
			
		}
		

	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			names.add("Guest #"+num+": Bill Doners");
			num++;
		}else {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i));
			}
		}
	}
}
