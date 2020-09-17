package ua.lviv.lgs;

import java.util.ArrayList;

public class Magazines {

	private static ArrayList<Magazine> magazines = null;
	private static Magazines thisMagazines = null;
	
	private Magazines() {
		magazines = new ArrayList<>();
		
		magazines.add(new Magazine("magazine1","content1", 120));
		magazines.add(new Magazine("magazine2","content2", 240));
		magazines.add(new Magazine("magazine3","content3", 60));
	}
	
	public static Magazines getMagazines() {
		if(thisMagazines == null) {
			thisMagazines = new Magazines();
		}
		return thisMagazines;
	}
	
	public void addMagazine(Magazine magazine) {
		if(!magazines.contains(magazine))
			magazines.add(magazine);
	}

	public Magazine getMagazineByName(String name) {	
		return magazines.stream().filter(magazine -> magazine.getName().equals(name)).findAny().get();
	}
	
	public ArrayList<Magazine> getAllMagazines() {
		return magazines;
	}
	
}