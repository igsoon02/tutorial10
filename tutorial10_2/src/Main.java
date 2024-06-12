import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();



        Item item1 = new Item("A1", "aa");
        Item item2 = new Item("B2", "bb");
        Item item3 = new Item("C3", "cc");
        Item item4 = new Item("D4", "dd");
        Item item5 = new Item("E5", "ee");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<String, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }
        for(Map.Entry<String, String> item: itemsMap.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue());
        }






    }
}