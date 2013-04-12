import java.util.ArrayList;
import java.util.List;


public class TestUtil {
	public static void setItemListTo(Item item) {
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		GildedRose.setItems(items);
	}
}
