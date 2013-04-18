package gildedrose.goblin.strategy;

public class UpdateStrategy {
		

	/**
	 * This method should be overwritten by subclasses if they 
	 * have a special sellIn change policy.
	 * @param sellIn
	 * @return
	 */
	public int determineNewSellIn(int sellIn) {
		return sellIn - 1;
	}
    /**
     * This should be overwritten by subclasses if their Quality changes in special ways.
     * @param oldQuality
     * @param sellIn
     * @return
     */
	public int determineNewQuality(int oldQuality, int sellIn) {
		if (oldQuality <= 0)
			return 0;
		if (sellIn >= 0)
			return oldQuality - 1;
		else
			return oldQuality - 2;
		}

}
