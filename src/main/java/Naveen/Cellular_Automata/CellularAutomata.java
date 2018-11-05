package Naveen.Cellular_Automata;

import javax.swing.*;
/**
 * Hello world!
 *
 */
public class CellularAutomata extends JFrame
{
	int NumberOfLines=1;
	Grid grid = new Grid();
	GridCanvas myCanvas = new GridCanvas();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CellularAutomata() {
		setVisible(true);
//		setResizable(false);
		setSize(1654,1000);
		add(myCanvas);
		grid.GenerateGridForRule();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		validate();
	
	}
    
	public static void main( String[] args )
    {
        new CellularAutomata();
    }
    

}
