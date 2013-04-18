package gildedrose.goblinignored.completed;

public class BackstagePass extends Item {
	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		
		if (sellIn < 0)
			return 0;
		if (sellIn < 5)
			return oldQuality + 3;
		if (sellIn < 10)
			return oldQuality + 2;
		return oldQuality + 1;
	}
}
