package array;

public class MainClass {

	public static void main(String[] args) {
		confirmMain("We are in main()");
		
		matrix my2D = new matrix();
		my2D.gameBoard();
	}
	
	private static void confirmMain(String string) {
		System.out.println(string);
	}

}
