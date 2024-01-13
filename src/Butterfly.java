
public class Butterfly {
	static void getButterfly(int n){
//		Upward Pattern
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");				
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
//		Downward Pattern
		for(int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");				
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		getButterfly(5);
	}

}
