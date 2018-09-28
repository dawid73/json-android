package cloud.dawid.testrest;

public class Fruit {

    private String id;
    private String name;

    public Fruit(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
