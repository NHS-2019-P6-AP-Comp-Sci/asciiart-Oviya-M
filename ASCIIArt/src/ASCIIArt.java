
public class ASCIIArt {
	
	public static void drawTriangle() {
		System.out.print("/\\/\\/\\");
		
		
	}
	
	public static void oneRow() {
		System.out.println("-----------------------------------------");
		System.out.println("|   [ ]\t   [ ]\t [ ]\t[ ]\t[ ]\t|");
		System.out.println("|   [ ]\t   [ ]\t [ ]\t[ ]\t[ ]\t|");
		System.out.println("-----------------------------------------");
		
	}
	
	public static void row_Building() {
		System.out.println("-----------------------------------------             |````````````|");
		System.out.println("|   [ ]\t   [ ]\t [ ]\t[ ]\t[ ]\t|             |            |");
		System.out.println("|   [ ]\t   [ ]\t [ ]\t[ ]\t[ ]\t|             |            |");
		System.out.println("-----------------------------------------             |            |");
	}
	
	public static void drawGrass() {
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
		drawTriangle();
	}
	
	public static void drawRect() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void drawRoad() {
		drawRect();
		System.out.println("This is a pic of 2 buildings, with grass and a road");
		drawRect();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oneRow();
		oneRow();
		oneRow();
		oneRow();
		oneRow();
		row_Building();
		row_Building();
		row_Building();
		drawGrass(); 	
		drawGrass();
		drawRoad();
		
	}
	
	

}
