package gildedrose.goblinignored.completed;

public class ConjuredItem extends Item{
	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
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
