
package mixeddrinkiterator;

public class MixedDrinkItem {
    String name;
    String description;
    boolean alcoholic;
    double price;
    
    public MixedDrinkItem( String name, 
            String description,
            boolean alcoholic,
            double price){
        this.name = name;
        this.description = description;
        this.alcoholic = alcoholic;
        this.price = price;
    }
    public String getName(){
        return name;
        
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean isAlcoholic(){
        return alcoholic;
    }
    public String toString(){
        return (name + ", $" + price + "\n   " + description);
    }
}
