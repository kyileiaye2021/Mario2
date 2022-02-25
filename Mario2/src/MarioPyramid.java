import java.util.Scanner;
public class MarioPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height;
		
		//getting height input from user
		do {
			System.out.print("Height: ");
			height = input.nextInt();
		}while(height < 1 || height > 8);
		
		String space = " ";
		String hash = "#";
		
		for(int i = 0; i < height; i++) {
			for(int j = i; j < height-1; j++) {
				System.out.print(space);
			}
			
			for(int k = 0; k < i+1; k++) {
				System.out.print(hash);				
			}
			
			System.out.print("  ");
			
			for(int l = 0; l < i+1; l++) {
				System.out.print(hash);				
			}
	
			System.out.println();
		    
			
		}

	}

}
