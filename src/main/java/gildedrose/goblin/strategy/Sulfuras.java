package gildedrose.goblin.strategy;

public class Sulfuras extends UpdateStrategy {
	

	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		return oldQuality;
	}

	@Override
	public int determineNewSellIn(int oldSellIn) {
		return oldSellIn;
	}

}
