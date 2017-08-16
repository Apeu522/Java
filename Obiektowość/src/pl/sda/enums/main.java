package pl.sda.enums;

public class main {

	public static void main(String[] args) {
		WorldDirections wd = WorldDirections.S;
		wd.values();
		
		wd = WorldDirections.valueOf("N");
		
		System.out.println(wd);
		
		for (WorldDirections w : WorldDirections.values()) {
			
			System.out.println(w.name() + " (" + w.getDesc() + ")");
		}
		
		

	}

}
