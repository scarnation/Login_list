package com.e.log.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 18;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));

        }
        //took time to figure out this template thanks to mi knowledge from Gads2020
        DummyItem  go = new DummyItem("1","My","am");
        DummyItem  ga = new DummyItem("2","Name","a");
        DummyItem  ge = new DummyItem("3","is","developer");
        DummyItem  gu = new DummyItem("4","Oscar","engines");
        ITEMS.set(0,go);
        ITEMS.set(1,ga);
        ITEMS.set(2,ge);
        ITEMS.set(3,gu);
        DummyItem  gq = new DummyItem("5","Welcome","am");
        DummyItem  gw = new DummyItem("6","To","a");
        DummyItem  gr = new DummyItem("7","Zuri","developer");
        ITEMS.set(4,gq);
        ITEMS.set(5,gw);
        ITEMS.set(6,gr);
        DummyItem  gt = new DummyItem("8","This was hard","developer");
        ITEMS.set(7,gt);


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}