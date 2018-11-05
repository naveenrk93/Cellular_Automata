package Naveen.Cellular_Automata;

import java.awt.*;

public class GridCanvas extends BufferedCanvas{

	int NumberOfLines=1;
	Grid grid = new Grid();
	
    public void paint(Graphics g)
    {	g.setColor(Color.YELLOW);
    	grid.GenerateGridForRule();
    	g.fillRect(0, 0, WIDTH, HEIGHT);
    	g.setColor(Color.GRAY);
    	g.fillRect(100, 200, 1416, 716);
    	g.setColor(Color.WHITE);
    	grid.drawGrid(g, NumberOfLines);
    	NumberOfLines++;
    	try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(NumberOfLines<=51)
    	{
    		repaint();
    	}
    		
    	
    }

	@Override
	public void render(Graphics g) {
		g.setColor(Color.YELLOW);
    	grid.GenerateGridForRule();
    	g.fillRect(0, 0, WIDTH, HEIGHT);
    	g.setColor(Color.GRAY);
    	g.fillRect(100, 200, 1416, 716);
    	g.setColor(Color.WHITE);
    	grid.drawGrid(g, NumberOfLines);
    	NumberOfLines++;
    	try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(NumberOfLines<=51)
    	{
    		repaint();
    	}
		
	}
	
}
