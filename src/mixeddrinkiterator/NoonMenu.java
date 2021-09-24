
package mixeddrinkiterator;
import java.util.*;
public class NoonMenu implements Cocktail {

    int totalDrinks = 0;
    List<MixedDrinkItem> drinks;
    
    public NoonMenu(){
        drinks = new ArrayList<MixedDrinkItem>();
        
        addDrink("Mimosas", "light and fruity, with equal amounts orange juice and sparkling wine.", true, 2.3);
        addDrink("Bloody Mary", "A complex drink with tomata slices and garnish", true, 1.5);
        addDrink("Roy Rogers","Made with cola and grenadine syrup garnished with maraschino cherry", false, 3.3);
        addDrink("Shirley Temple", "Made with ginger ale and splash of grenadine garnished with maraschino cherry", false, 2.0);

        
    }
    public void addDrink(String name, String description,
        boolean alcoholic, double price    ){
        MixedDrinkItem drinkItem = new MixedDrinkItem(name, description, alcoholic, price);
        drinks.add(drinkItem);
    }
    public List<MixedDrinkItem> getDrinks(){
        return drinks;
    }
    public Iterator createIterator(){
        return new NoonIterator(drinks);
    }
    public String toString() {
    	return "Drinks best taken before noon" ;
    }
}