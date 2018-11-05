package Naveen.Cellular_Automata;

import java.awt.*;
import javax.swing.*;
import Naveen.Cellular_Automata.*;
/**
 * Hello world!
 *
 */
public class CellularAutomata extends JFrame
{
	
	Grid grid = new Grid();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CellularAutomata() {
		setVisible(true);
		setResizable(false);
		setSize(1500,900);
		grid.GenerateGridForRule();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		validate();
	
	}
    
	public static void main( String[] args )
    {
        new CellularAutomata();
    }
    
    public void paint(Graphics g)
    {	g.setColor(Color.YELLOW);
    	g.fillRect(0, 0, WIDTH, HEIGHT);
    	g.setColor(Color.GRAY);
    	g.fillRect(100, 200, 1214, 602);
    	g.setColor(Color.WHITE);
    	grid.drawGrid(g);
    }
}
