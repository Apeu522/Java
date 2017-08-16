package pl.sda.enums;

public enum WorldDirections {
	
	N("en:North; pl:P�noc"), S("en:South; pl:Po�udnie"), W("en:West;  pl:Zach�d"), E("en:East;  pl:Wsch�d");
	
	private String desc;
	
	private WorldDirections(String desc) {
		
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	
	
}
