import java.util.HashMap;

public class GildedRoseWithTestAccessor extends GildedRose {
	public static void main(String[] a) {
		String s = "asdf" + "" + "" + "" + "" + "" + "" + "";
		HashMap<String, String> m = new HashMap<>();
		m.put("a", "b");
		m.put("a", m.get("b")+ "a" +
				"" +
				"" +
				"" +
				"" +
				"");
		
	}

}
