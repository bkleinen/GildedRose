package gildedrose.goblinignored.completed;

public class AgedBrie extends Item {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		if (sellIn >= 0)
			return oldQuality + 1;
		else
			return oldQuality + 2;
	}
}
