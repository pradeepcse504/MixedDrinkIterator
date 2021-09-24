package mixeddrinkiterator;
import java.util.*;
public class NoonIterator implements Iterator{
	List<MixedDrinkItem> mixedDrinkItems;
	int position = 0;
	public NoonIterator( List<MixedDrinkItem> mixedDrinkItems) {
		this.mixedDrinkItems = mixedDrinkItems;
	}
	public boolean hasNext() {
		if(position >= mixedDrinkItems.size() ) {
			return false;
		}
		else {
			return true;
		}
	}
	public MixedDrinkItem next() {
		MixedDrinkItem mixedDrinkItem = mixedDrinkItems.get(position);
		position = position + 1;
		return mixedDrinkItem;
	}
	
}
