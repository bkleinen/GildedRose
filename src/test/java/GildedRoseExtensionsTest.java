import static org.junit.Assert.*;
import gildedrose.original.GildedRose;
import gildedrose.original.Item;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GildedRoseExtensionsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConjured() {
		Item item = new Item("Conjured", 8, 4);
		updateQuality(item);
		
		GildedRose.updateQuality();
		assertEquals(2, item.getQuality());
	}

}
