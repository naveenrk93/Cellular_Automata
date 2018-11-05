package Naveen.Cellular_Automata;
import Naveen.Cellular_Automata.Row;
import java.awt.*;

public class Grid {
	//Private Variables
	private Row[] rows= new Row[50];
	private int NumberOfRows = 1;
	private int Rule = 255;
	
	public Grid() {
		for(int i=0;i<50;i++)
		{
			rows[i] = new Row();
		}
		
		rows[0].getRow()[51].color=Color.BLACK;
		}
	
	//Getters and Setters
	public int getNumberOfRows() {
		return NumberOfRows;
	}
	
	public void setNumberOfRows(int numberOfRows) {
		NumberOfRows = numberOfRows;
	}
	
	public Row[] getRows() {
		return rows;
	}
	
	public void setRows(Row rows[]) {
		this.rows = rows;
	}
	
	public void drawGrid(Graphics g)
	{
		for(int i=0; i<50; i++)
		{
			for(int j=0; j<101; j++)
			{
				g.setColor(rows[i].getRow()[j].color);
				g.fillRect(102+j*12, 202+i*12, 10, 10);
				
			}
		}
	}
	
	public void GenerateGridForRule() {
		for(int i=1; i<50; i++)
		{
			rows[i] = Row.generateRow(rows[i-1], Rule);
		}
		
	}
	
}

