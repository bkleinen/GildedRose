import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
	//private GildedRose gildedRose;

	@Before
	public void initItems() {
		//gildedRose = new GildedRose();
		GildedRose.initItemList();
	}

	final static int N = 20;



	protected void setItemListTo(Item item) {
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		GildedRose.setItems(items);
	}

	@Test
	public void ripeCheese() {
		Item item = new Item("Aged Brie", 1, 49);
		setItemListTo(item);
		GildedRose.updateQuality();
		assertEquals(50, item.getQuality());
		GildedRose.updateQuality();
		assertEquals(50, item.getQuality());
	}

//	- All items have a Quality value which denotes how valuable the item is
//	- At the end of each day our system lowers both values for every item
//
//Pretty simple, right? Well this is where it gets interesting:
//
//	- Once the sell by date has passed, Quality degrades twice as fast
//	- The Quality of an item is never negative
//	- "Aged Brie" actually increases in Quality the older it gets
//	- The Quality of an item is never more than 50
//	- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
//	- "Backstage passes", like aged brie, increases in Quality as it's SellIn value 
	

}
