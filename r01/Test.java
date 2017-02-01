class Test {
	public static void main(String[] args){
		System.out.println("1. y = x - y");
		int x = 0;
		int y = 0;
		while ( x < 5 ) {
			y = x - y;
			
			System.out.println(x + "" + y + " ");
			x = x + 1;
		}
		System.out.println("2. y = x + y");
		int a = 0;
		int b = 0;
		while ( b < 5 ) {
			b = a + b;
			
			System.out.println(a + "" + b + " ");
			a = a + 1;
		}


		System.out.println("Koniec!");
	}
}