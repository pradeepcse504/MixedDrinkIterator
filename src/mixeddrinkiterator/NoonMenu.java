
package mixeddrinkiterator;

public class NoonMenu implements Cocktail {
    static final int MAX_DRINKS = 10;
    int totalDrinks = 0;
    MixedDrinkItem[] drinks;
    
    public NoonMenu(){
        drinks = new MixedDrinkItem[ MAX_DRINKS ];
        
        addDrink("Mimosas", "light and fruity, with equal amounts orange juice and sparkling wine.", true, 2.3);
        addDrink("Bloody Mary", "A complex drink with tomata slices and garnish", true, 1.5);
        addDrink("Roy Rogers","Made with cola and grenadine syrup garnished with maraschino cherry", false, 3.3);
        addDrink("Shirley Temple", "Made with ginger ale and splash of grenadine garnished with maraschino cherry", false, 2.0);

        
    }
    public void addDrink(String name, String description,
        boolean alcoholic, double price    ){
        MixedDrinkItem drinkItem = new MixedDrinkItem(name, description, alcoholic, price);
        if(totalDrinks >= MAX_DRINKS){
            System.out.println("Collection full Cannot add drink");
        }
        else{
            drinks[totalDrinks] = drinkItem;
            totalDrinks = totalDrinks + 1;
        }
    }
    public MixedDrinkItem[] getDrinks(){
        return drinks;
    }
    public Iterator createIterator(){
        return new CocktailIterator(drinks);
    }
}