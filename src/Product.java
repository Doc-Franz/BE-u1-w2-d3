import java.util.ArrayList;
import java.util.List;

public class Product {
    Long id;
    String name;
    String category;
    Double price;

    public Product(Long id, String name, String category, Double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    };

    @Override
    public String toString(){
        return "La categoria è " + category + ", il nome è " + name + ", il prezzo è " + price + "€";
    }
}
