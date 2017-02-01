public class Zwierzaku {
	public static void main(String[] args) {
		String[] zwierzaki = {"KiV", "Lavim", "ZuluNation"};

		int x = zwierzaki.length;
		int y = (int) (Math.random() * x);

		String z = zwierzaki[y] + " wbije A- w lutym";
		System.out.println(z);
	}
}