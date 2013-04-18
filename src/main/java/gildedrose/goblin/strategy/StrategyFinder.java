package gildedrose.goblin.strategy;

public class StrategyFinder {
	/*
	 * all Item subclasses need to be known of here.
	 * this is not nice, but not easy to do in java
	 * http://stackoverflow.com/questions/2582891/get-static-initialization-block-to-run-in-a-java-without-loading-the-class
	 */
	public static UpdateStrategy getUpdateStrategyForItem(String name) {
		/*
		 * this is a bit inefficient as strategies are created every time this method is called.
		 */
		if (name.contains("Aged Brie"))
			return new AgedBrie();
        if (name.contains("Sulfuras"))
        	return new Sulfuras();
        if (name.contains("Backstage pass"))
        	return new BackstagePass();
        if (name.contains("Conjured"))
        	return new ConjuredItem();
      
    	return new UpdateStrategy();
	}

}
