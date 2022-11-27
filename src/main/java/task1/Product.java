package task1;

public class Product {
    private int id;
    protected String name;
    protected String group;
    protected String subgroup;
    private float price;
    public Product(int id, String name, String group, String subgroup, float price) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.subgroup = subgroup;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
