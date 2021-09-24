
package mixeddrinkiterator;

public class Waitress {
    Cocktail    dessertCocktail;
    Cocktail    noonCocktail;
    
    public Waitress(Cocktail dessertCocktail, Cocktail morningCocktail){
        this.dessertCocktail = dessertCocktail;
        this.noonCocktail = morningCocktail;
    
    }
    public void printCocktail(){
        Iterator desertIterator = dessertCocktail.createIterator();
        Iterator noonIterator = noonCocktail.createIterator();
        System.out.println("\nCocktails----Morning----\n");
        printCocktail(desertIterator);
        System.out.println("\nCocktails----Desert\n");
        printCocktail(noonIterator);
        
    }
    private void printCocktail(Iterator iterator){
        while(iterator.hasNext()){
            MixedDrinkItem mixedDrinkItem = iterator.next();
            System.out.print( mixedDrinkItem.getName() + ", ");
            System.out.print(mixedDrinkItem.getPrice() + " ---- ");
            System.out.println(mixedDrinkItem.getDescription());
        }
    }
    public void printAlcoholicCocktail(){
        printAlcoholicCocktail(dessertCocktail.createIterator());
        printAlcoholicCocktail(noonCocktail.createIterator());
    }
    public void printAlcoholicCocktail( Iterator iterator ){
        while(iterator.hasNext()){
            MixedDrinkItem mixedDrinkItem = iterator.next();
            if( mixedDrinkItem.isAlcoholic()) {
            System.out.print( mixedDrinkItem.getName() + ", ");
            System.out.print(mixedDrinkItem.getPrice() + " ---- ");
            System.out.println(mixedDrinkItem.getDescription());            
            }
        }
    }
    private boolean isAlcoholic(String name, Iterator iterator ){
        while(iterator.hasNext()){
            MixedDrinkItem mixedDrinkItem = iterator.next();
            if(mixedDrinkItem.getName().equals(name)){
                if(mixedDrinkItem.isAlcoholic()){
                    return true;
                }
            }
            
        }
        return false;
    }
    
}
