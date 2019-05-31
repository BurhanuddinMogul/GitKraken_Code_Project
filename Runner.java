public class Runner{
	public static void main(String[]args){

		Perfect_Square pS = (int x)-> {
			double root = Math.sqrt(x);
			return (root - Math.floor(root) == 0);
		};

		System.out.printf("%s", ""+pS.isPerfectSquare(3));

	}
}