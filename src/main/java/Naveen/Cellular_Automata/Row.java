package Naveen.Cellular_Automata;
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
			
			System.out.print(BinaryRule.charAt(0));
			System.out.print(BinaryRule.charAt(1));
			System.out.print(BinaryRule.charAt(2));
			System.out.print(BinaryRule.charAt(3));
			System.out.print(BinaryRule.charAt(4));
			System.out.print(BinaryRule.charAt(5));
			System.out.print(BinaryRule.charAt(6));
			System.out.print(BinaryRule.charAt(7)+"\n\n");
			
			return previousRow;
		}
}

