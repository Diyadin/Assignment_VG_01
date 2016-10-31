package otherClasses;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;

import interfaces.PlayerInterface;
import jaco.mp3.player.MP3Player;
/**
 * 
 * @author Diyadin
 * @Version 1.0
 */

// Implementing interface and all the methods in it.
public class PlayerMethods implements PlayerInterface {

	// calling and giving methods and objects new variable names,
	MP3Player  player = new MP3Player();
	JLabel lblNewLabel = new JLabel("New label");
	
	
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	@Override
	public void Open() {
		player.stop();
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(null);
		File selectedFile = fileChooser.getSelectedFile();
		player.addToPlayList(selectedFile);
		player.play();
		lblNewLabel.setText("Track: "+selectedFile.getName());
			
	}

	@Override
	public void play() {
		player.play();
	}

	@Override
	public void stop() {
	player.stop();	
	}

	@Override
	public void paus() {
		player.pause();
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		
	}

	
	

}
