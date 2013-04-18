package gildedrose.goblin.strategy;

public class AgedBrie extends UpdateStrategy {
	
	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		if (sellIn >= 0)
			return oldQuality + 1;
		else
			return oldQuality + 2;
	}
}
