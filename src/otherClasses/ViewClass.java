package otherClasses;


import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import jaco.mp3.player.MP3Player;
/**
 * 
 * @author Diyadin
 * @Version 1.0
 *
 */
public class ViewClass extends javax.swing.JFrame implements ActionListener {

	private JFrame frame;
	MP3Player player = new MP3Player();
// Variables declared on global level
	JButton btnStop = new JButton("");
	JButton btnOpen = new JButton("");
	JButton btnPlay = new JButton("");
	JButton btnPaus = new JButton("");
	PlayerMethods methods = new PlayerMethods();
	JLabel lblNewLabel = new JLabel("New label");
	/**
	 *
	 *TYPING SOMETHING 1!!!"#!"#!"#
	 *
	 *
	 */
	
		final JFileChooser fileChooser = new JFileChooser();
		

	public ViewClass() {
		initialize();
		addActionListener();
	
	}

	

	private void initialize() {
	// Creating the frame with its design, size and the action to exit when closed
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		//Design for the button "Open"
		
		Image iconForOpen = new ImageIcon(this.getClass().getResource("/choose.png")).getImage();
		btnOpen.setIcon(new ImageIcon(iconForOpen));
		btnOpen.setBounds(37, 84, 32, 29);
		
		frame.getContentPane().add(btnOpen);
		
		//Design for the button "Play"
		
		btnPlay.setBackground(Color.WHITE);
		Image iconForPlay = new ImageIcon(this.getClass().getResource("/play.png")).getImage();
		btnPlay.setIcon(new ImageIcon(iconForPlay));
		
		btnPlay.setBounds(104, 84, 32, 29);
		frame.getContentPane().add(btnPlay);

		//Design for the button "pause"
		Image iconForPaus = new ImageIcon(this.getClass().getResource("/paus.png")).getImage();
		btnPaus.setIcon(new ImageIcon(iconForPaus));
		
		btnPaus.setBounds(148, 84, 32, 29);
		frame.getContentPane().add(btnPaus);
				
			
			

		// Giving button "stop" an icon
		Image iconForStop = new ImageIcon(this.getClass().getResource("/stop.png")).getImage();
		btnStop.setIcon(new ImageIcon(iconForStop));
			
		// giving it start up coordinates and size
		btnStop.setBounds(192, 84, 32, 29);
		frame.getContentPane().add(btnStop);

		lblNewLabel.setBounds(52, 31, 196, 16);
		frame.getContentPane().add(lblNewLabel);

		frame.setVisible(true);

	}
	// Activating the ability to perform action for the buttons
	public void addActionListener(){
		btnStop.addActionListener(this);
		btnPlay.addActionListener(this);
		btnOpen.addActionListener(this);
		btnPaus.addActionListener(this);
			
	}
// Instructions for the buttons
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnStop){
		methods.stop();
	}
	if (e.getSource()==btnPaus){
		methods.paus();
	}
	if (e.getSource()==btnOpen){
		methods.Open();
		lblNewLabel.setText(methods.lblNewLabel.getText());
		
		
	}
	if(e.getSource()==btnPlay){
		methods.play();
		
	}
	
		
		
		
	}
}
