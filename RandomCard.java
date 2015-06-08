//swing
import javax.swing.*;
//awt
import java.awt.*;
import java.awt.event.*;

public class RandomCard extends JFrame {
			
	public RandomCard(){
		final int[] deck = new int[54];//int array about deck
		
		//initialize the deck
		for (int i = 0; i < deck.length; i++){
			deck[i] = i+1;
		}
		//new 4 image icon
		ImageIcon card1 = new ImageIcon("card/"+deck[1]+".png");
		ImageIcon card2 = new ImageIcon("card/"+deck[2]+".png");
		ImageIcon card3 = new ImageIcon("card/"+deck[3]+".png");
		ImageIcon card4 = new ImageIcon("card/"+deck[4]+".png");
		
		//new 4 label
		final JLabel CardLabel1 = new JLabel();
		final JLabel CardLabel2 = new JLabel();
		final JLabel CardLabel3 = new JLabel();
		final JLabel CardLabel4 = new JLabel();
		
		//set the four label
		CardLabel1.setIcon(card1);
		CardLabel2.setIcon(card2);
		CardLabel3.setIcon(card3);
		CardLabel4.setIcon(card4);
		
		//new a button name Refresh		
		JButton Refresh = new JButton("Refresh");
		
		//set the layout
		setLayout( new FlowLayout(FlowLayout.LEFT));
		
		//add labels to frame
		add(CardLabel1);
		add(CardLabel2);
		add(CardLabel3);
		add(CardLabel4);
		
		//add button to frame
		add(Refresh);
		
		//ActionListener
		Refresh.addActionListener(new ActionListener(){
			//actionPerformed
			@Override
			public void actionPerformed(ActionEvent e){
				//shuffle the deck
				for (int i = 1; i < deck.length; i++) {
					int index = (int)(Math.random() * deck.length);
					int temp = deck[i];
					deck[i] = deck[index];
					deck[index] = temp;
				}
				//reset the labels
				CardLabel1.setIcon(new ImageIcon("card/"+deck[1]+".png"));
				CardLabel2.setIcon(new ImageIcon("card/"+deck[2]+".png"));
				CardLabel3.setIcon(new ImageIcon("card/"+deck[3]+".png"));
				CardLabel4.setIcon(new ImageIcon("card/"+deck[4]+".png"));
			}		
						
		});
				
	}
	
	
	public static void main(String[] args){
	
		RandomCard frame = new RandomCard();
		frame.setTitle("DisplayRandomCard");//title
		frame.setLocationRelativeTo(null);//display on the center of monitor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close
		frame.pack();//display in property place
		frame.setVisible(true);//can see
	

	}	
}
