import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import jaco.mp3.player.MP3Player;
import javax.swing.JTextField;
/**
 * 
 * @author Diyadin
 * @Version 1.0
 *
 */
public class Mp3Player extends javax.swing.JFrame implements ActionListener {

	private JFrame frame;
	MP3Player player = new MP3Player();

	JButton btnStop = new JButton("");
	JButton btnOpen = new JButton("");
	JButton btnPlay = new JButton("");
	JButton btnPaus = new JButton("");
	Methods methods = new Methods();
	JLabel lblNewLabel = new JLabel("New label");
	/**
	 *
	 *TYPING SOMETHING 1!!!"#!"#!"#
	 *
	 *
	 */
	
		final JFileChooser fileChooser = new JFileChooser();
		

	public Mp3Player() {
		initialize();
		addActionListener();
	
	}

	

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 102));
		frame.setBounds(100, 100, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		// Button Eject
		Image iconForOpen = new ImageIcon(this.getClass().getResource("/choose.png")).getImage();
		btnOpen.setIcon(new ImageIcon(iconForOpen));
		btnOpen.setBounds(37, 84, 32, 29);
		
		
			
		
		frame.getContentPane().add(btnOpen);
		
		
		// Button Play
		btnPlay.setBackground(Color.WHITE);
		Image iconForPlay = new ImageIcon(this.getClass().getResource("/play.png")).getImage();
		btnPlay.setIcon(new ImageIcon(iconForPlay));
		
		btnPlay.setBounds(104, 84, 32, 29);
		frame.getContentPane().add(btnPlay);

		//Button Pause
		Image iconForPaus = new ImageIcon(this.getClass().getResource("/paus.png")).getImage();
		btnPaus.setIcon(new ImageIcon(iconForPaus));
		
		btnPaus.setBounds(148, 84, 32, 29);
		frame.getContentPane().add(btnPaus);
				
			
			

		// Button Stop
		Image iconForStop = new ImageIcon(this.getClass().getResource("/stop.png")).getImage();
		btnStop.setIcon(new ImageIcon(iconForStop));
			
		
		btnStop.setBounds(192, 84, 32, 29);
		frame.getContentPane().add(btnStop);

		lblNewLabel.setBounds(52, 31, 196, 16);
		frame.getContentPane().add(lblNewLabel);

		frame.setVisible(true);

	}
	public void addActionListener(){
		btnStop.addActionListener(this);
		btnPlay.addActionListener(this);
		btnOpen.addActionListener(this);
		btnPaus.addActionListener(this);
			
	}

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
