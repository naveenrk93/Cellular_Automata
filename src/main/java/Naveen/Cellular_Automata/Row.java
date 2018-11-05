package Naveen.Cellular_Automata;
import java.awt.Color;

import Naveen.Cellular_Automata.Cell;;

public class Row {
		private Cell[] cells = new Cell[101];
		
		public Row() {
			for(int i=0; i<101; i++) {
				cells[i] = new Cell();
			}
		}
		
		public Cell[] getRow() {
			
			return cells;
		}
		
		public static Row generateRow(Row previousRow, int Rule)
		{
			String BinaryRule = Integer.toBinaryString(Rule);
			if(BinaryRule.length() != 8)
			{
				while(BinaryRule.length()<8) {
					BinaryRule="0"+BinaryRule;
				}
			}
			
//			System.out.print(BinaryRule.charAt(0));
//			System.out.print(BinaryRule.charAt(1));
//			System.out.print(BinaryRule.charAt(2));
//			System.out.print(BinaryRule.charAt(3));
//			System.out.print(BinaryRule.charAt(4));
//			System.out.print(BinaryRule.charAt(5));
//			System.out.print(BinaryRule.charAt(6));
//			System.out.print(BinaryRule.charAt(7)+"\n\n");
			
			Row GeneratedRow = new Row();
			
			Cell BlackCell = new Cell();
			BlackCell.color=Color.BLACK;
			Cell WhiteCell = new Cell();
			WhiteCell.color=Color.WHITE;
			
			Cell RightPreviousCell,LeftPreviousCell,TopPreviousCell;
			
			for(int i=0;  i<GeneratedRow.cells.length;  i++)
			{
				TopPreviousCell = previousRow.cells[i];
				
				if(i==0) LeftPreviousCell=TopPreviousCell;
				else LeftPreviousCell=previousRow.cells[i-1];
				
				if(i==previousRow.cells.length-1)	RightPreviousCell = TopPreviousCell;
				else RightPreviousCell = previousRow.cells[i+1];
				
					if(		LeftPreviousCell.color == Color.BLACK &&
							TopPreviousCell.color   == Color.BLACK &&
							RightPreviousCell.color  == Color.BLACK)
						{
								if(BinaryRule.charAt(0)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						
						}
				
				else if(	LeftPreviousCell.color == Color.BLACK &&
				     	  	TopPreviousCell.color   == Color.BLACK &&
				     	  	RightPreviousCell.color  == Color.WHITE)
						{
								if(BinaryRule.charAt(1)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
					
						}
					
				else if(	LeftPreviousCell.color == Color.BLACK &&
						   	TopPreviousCell.color   == Color.WHITE &&
						   	RightPreviousCell.color  == Color.BLACK)
						{
								if(BinaryRule.charAt(2)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
					
				else if(	LeftPreviousCell.color == Color.BLACK &&
						   	TopPreviousCell.color   == Color.WHITE &&
						   	RightPreviousCell.color  == Color.WHITE)
						{
								if(BinaryRule.charAt(3)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
					
				else if(	LeftPreviousCell.color == Color.WHITE &&
						   	TopPreviousCell.color   == Color.BLACK &&
						   	RightPreviousCell.color  == Color.BLACK)
						{
								if(BinaryRule.charAt(4)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
					
				else if(	LeftPreviousCell.color == Color.WHITE &&
						   	TopPreviousCell.color   == Color.BLACK &&
						   	RightPreviousCell.color  == Color.WHITE)
						{
								if(BinaryRule.charAt(5)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
					
				else if(	LeftPreviousCell.color == Color.WHITE &&
						   	TopPreviousCell.color   == Color.WHITE &&
						   	RightPreviousCell.color  == Color.BLACK)
						{
								if(BinaryRule.charAt(6)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
				else if(	LeftPreviousCell.color == Color.WHITE &&
						   	TopPreviousCell.color   == Color.WHITE &&
						   	RightPreviousCell.color  == Color.WHITE)
						{
								if(BinaryRule.charAt(7)=='0')GeneratedRow.cells[i].color=Color.WHITE;
								else GeneratedRow.cells[i].color=Color.BLACK;
						}
					
			}
			
			
			return GeneratedRow;
		}
}

