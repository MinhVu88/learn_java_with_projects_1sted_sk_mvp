// Figure 5.19      
package ch5.samples;

public class Iteration13 {
	public static void main(String[] args) {
		System.out.println("i | j");

		for(int i = 1; i <= 3; i++) {			
			for(int j = 1; j <= 5; j++) {
				if(j == 3) {
					continue;
				}

				System.out.println(i + " | " + j);
			}
		}
	}
}
