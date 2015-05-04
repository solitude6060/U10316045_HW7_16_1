import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomCard extends JFrame {
	
	
		
	public RandomCard(){
		int[] deck = new int[54];
		
		for (int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
		
		ImageIcon card1 = new ImageIcon("card/"+deck[1]+".png");
		ImageIcon card2 = new ImageIcon("card/"+deck[2]+".png");
		ImageIcon card3 = new ImageIcon("card/"+deck[3]+".png");
		ImageIcon card4 = new ImageIcon("card/"+deck[4]+".png");
		
		JLabel CardLabel1 = new JLabel();
		JLabel CardLabel2 = new JLabel();
		JLabel CardLabel3 = new JLabel();
		JLabel CardLabel4 = new JLabel();
		
		CardLabel1.setIcon(card1);
		CardLabel2.setIcon(card2);
		CardLabel3.setIcon(card3);
		CardLabel4.setIcon(card4);
		
		
		
		JButton Refresh = new JButton("Refresh");
		
		setLayout( new FlowLayout(FlowLayout.LEFT));
		add(CardLabel1);
		add(CardLabel2);
		add(CardLabel3);
		add(CardLabel4);
		add(Refresh);
		
		Refresh.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				for (int i = 0; i < deck.length; i++) {
					int index = (int)(Math.random() * deck.length);
					int temp = deck[i];
					deck[i] = deck[index];
					deck[index] = temp;
				}
				
				CardLabel1.setIcon(new ImageIcon("card/"+deck[1]+".png"));
				CardLabel2.setIcon(new ImageIcon("card/"+deck[2]+".png"));
				CardLabel3.setIcon(new ImageIcon("card/"+deck[3]+".png"));
				CardLabel4.setIcon(new ImageIcon("card/"+deck[4]+".png"));
			}
			
						
		});
		
		
	}
	
	
	public static void main(String[] args){
		RandomCard frame = new RandomCard();
		frame.setTitle("DisplayRandomCard");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	

	}	
}
