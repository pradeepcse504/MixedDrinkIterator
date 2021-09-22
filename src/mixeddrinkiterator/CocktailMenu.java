
package mixeddrinkiterator;

public class CocktailMenu implements Cocktail {
    static final int MAX_DRINKS = 10;
    int totalDrinks = 0;
    MixedDrinkItem[] drinks;
    
    public CocktailMenu(){
        drinks = new MixedDrinkItem[ MAX_DRINKS ];
        
        addDrink("French 75", "French 75 is a cocktail made from gin, champagne, lemon juice, and sugar. ", true, 4.5);
        addDrink("Moscow Mule", "A Moscow mule is a cocktail made with vodka, spicy ginger beer, and lime juice, garnished with a slice or wedge of lime.", true, 4.5);
        
        addDrink("Chocolate Martini", "made with chocolate liqueur, crème de cacao, half and half, and vodka. It is every chocolate lover's dream!", true, 4.5);
        addDrink("Margarita", "A margarita is a cocktail consisting of tequila, orange liqueur, and lime juice often served with salt on the rim of the glass.", true, 4.5);
        
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
