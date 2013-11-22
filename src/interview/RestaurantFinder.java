
package interview;

import java.util.List;

public interface RestaurantFinder {
	//Using generics to make use of auto boxing
	/**
	 * Takes restaurants list and finds top performing restaurants whose order count is strictly greater than
	 * the average order count in the city. 
	 * @param restaurants
	 * @return List
	 */
	public List<RestaurantInfo> getTopPerformers(List<RestaurantInfo> restaurants);
	
}
