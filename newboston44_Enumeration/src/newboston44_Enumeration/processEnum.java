package newboston44_Enumeration;

public enum processEnum {
	sumu("Psychopath", "20"),
	farzana("First bestfriend", "10"),
	asiya("Second bestfriend", "14"),
	mahiya("Childhood Friend", "4"),
	dishaApu("Big sister", "7"),
	biba("Selfish liar", "16"),
	maliha("Shophisticated", "17");
	
	private final String desc;
	private final String year;
	
	processEnum(String description, String theYear){
		desc = description;
		year = theYear;
	}
	public String getDesc() {
		return desc;
	}
	public String getYear() {
		return year;
	}
	
}
