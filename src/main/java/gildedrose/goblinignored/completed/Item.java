package gildedrose.goblinignored.completed;

public class Item {
    public String name;
	private int sellIn; 
	private int quality; 
    
    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}
    
	/* Generated getter and setter code */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public void oneDayPassed(){
		sellIn--;
		int newQuality =  determineQuality(quality,sellIn);
		if ((newQuality <= 50) || (newQuality < quality))
			quality = newQuality;
		}

	protected int determineQuality(int oldQuality,int sellIn) {
		if (oldQuality <= 0) return 0;
		if (sellIn >= 0)
			return oldQuality -1;
		else 
			return oldQuality - 2;	
	}
	
}
