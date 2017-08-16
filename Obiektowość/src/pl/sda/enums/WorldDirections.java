package pl.sda.enums;

public enum WorldDirections {
	
	N("en:North; pl:Pó³noc"), S("en:South; pl:Po³udnie"), W("en:West;  pl:Zachód"), E("en:East;  pl:Wschód");
	
	private String desc;
	
	private WorldDirections(String desc) {
		
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	
	
}
