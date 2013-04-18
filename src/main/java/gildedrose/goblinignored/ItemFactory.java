package gildedrose.goblinignored;

import gildedrose.goblinignored.completed.AgedBrie;

public class ItemFactory {
	public static Item createItem(String name, int sellIn, int quality){
		return new Item(name,sellIn,quality);
	}

}
