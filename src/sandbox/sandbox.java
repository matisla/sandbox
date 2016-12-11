package sandbox;

import view.MainFrame;

public class sandbox {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		MainFrame main = new MainFrame();
		main.setVisible(true);
	}
	
	public int addition(int a, int b){
		return a+b;
	}

}
