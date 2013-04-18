package gildedrose.goblin.strategy;

public class ConjuredItem extends UpdateStrategy{
	
	@Override
	public int determineNewQuality(int oldQuality, int sellIn) {
		if (oldQuality <= 0)
			return 0;
		if (sellIn >= 0)
			return oldQuality - 2;
		else
			return oldQuality - 4;
		}

}
