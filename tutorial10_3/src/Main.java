import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();



        Item item1 = new Item("A1", "aa");
        Item item2 = new Item("B2", "bb");
        Item item3 = new Item("C3", "cc");
        Item item4 = new Item("D4", "dd");
        Item item5 = new Item("A5", "ee");
        Item item6 = new Item("B4", "ee5");
        Item item7 = new Item("C3", "ee4");
        Item item8 = new Item("D2", "ee3");
        Item item9 = new Item("E1", "ee2");
        Item item10 = new Item("F0", "ee1");



        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);

        HashSet<Item> lessItemsList = new HashSet<>(items.subList(0, 5));

        for(Item item : lessItemsList) {
            System.out.println(item.getID());
        }







    }
}