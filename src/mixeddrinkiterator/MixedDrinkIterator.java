package mixeddrinkiterator;

public class MixedDrinkIterator {

    public static void main(String args[]) {
        Cocktail dessertMenu = new CocktailMenu();
        Cocktail noonMenu = new NoonMenu();
        
        Waitress waitress = new Waitress(noonMenu, dessertMenu);
        
        waitress.printCocktail();
        
        
        
    }
}