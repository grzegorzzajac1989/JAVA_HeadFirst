class DobryPiesek {
	private int wielkosc;

	public void setWielkosc(int w) {
		wielkosc = w;
	}

	public int getWielkosc() {
		return wielkosc;
	}

void szczekaj() {
	if (wielkosc > 24) {
		System.out.println("Hau, hau");
	} else if (wielkosc > 6) {
		System.out.println("Chau, chau");
	} else {
		System.out.println("woof, woof");
	}
}

}

class DobryPiesekTester {
	public static void main(String[] args){
		DobryPiesek pierwszy = new DobryPiesek();
		pierwszy.setWielkosc(70);
		DobryPiesek drugi = new DobryPiesek();
		drugi.setWielkosc(8);
		System.out.println("Pierwszy pies: " + pierwszy.getWielkosc());
		System.out.println("Drugi pies: " + drugi.getWielkosc());
		pierwszy.szczekaj();
		drugi.szczekaj();
	}
}