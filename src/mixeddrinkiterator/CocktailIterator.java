
package mixeddrinkiterator;

public class CocktailIterator implements Iterator {
    MixedDrinkItem[] drinks;
    int index = 0;
    public CocktailIterator(MixedDrinkItem[] drinks){
        this.drinks = drinks;
    }
    public MixedDrinkItem next(){
        return drinks[index++];
    }
    public boolean hasNext(){
        if(index >= drinks.length || drinks[index] == null){
            return false;
        }
        return true ;
    }
}

