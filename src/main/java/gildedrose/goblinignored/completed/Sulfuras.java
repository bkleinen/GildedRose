package gildedrose.goblinignored.completed;

public class Sulfuras extends Item {
	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		return oldQuality;
	}

	@Override
	public int determineNewSellIn(int oldSellIn) {
		return oldSellIn;
	}

}
