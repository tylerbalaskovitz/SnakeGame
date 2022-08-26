import javax.swing.JFrame;

public class GameFrame extends JFrame{

	//constructor
	GameFrame(){
		
		
		this.add(new GamePanel());
		this.setTitle("Snake Muncher");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//this fits the compononets that are put around the JFrame
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
}
