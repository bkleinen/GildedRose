package gildedrose.goblinignored.completed;

public class ItemFactory {
	/*
	 * all Item subclasses need to be known of here.
	 * this is not nice, but not easy to do in java
	 * http://stackoverflow.com/questions/2582891/get-static-initialization-block-to-run-in-a-java-without-loading-the-class
	 */
	public static Item createItem(String name, int sellIn, int quality) {

		if (name.contains("Aged Brie"))
			return new AgedBrie(name, sellIn, quality);
        if (name.contains("Sulfuras"))
        	return new Sulfuras(name, sellIn, quality);
        if (name.contains("Backstage pass"))
        	return new BackstagePass(name, sellIn, quality);
        if (name.contains("Conjured"))
        	return new ConjuredItem(name, sellIn, quality);
      
    	return new Item(name, sellIn, quality);
	}

}
