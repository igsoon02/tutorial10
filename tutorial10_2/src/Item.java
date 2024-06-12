public class Item {

    String id;
    String name;

    public Item(String ID, String name){

        this.id = id;
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public void show() {
        System.out.println(this.name);
    }
}
