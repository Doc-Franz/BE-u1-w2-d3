public class Customer {
    Long id;
    String name;
    Integer tier;

    public Customer(Long id, String name, Integer tier){
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    @Override
    public String toString(){
        return name + " di livello" + tier;
    }
}
