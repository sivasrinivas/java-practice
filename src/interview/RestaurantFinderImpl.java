package interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RestaurantFinderImpl implements RestaurantFinder {

	@Override
	public List getTopPerformers(List<RestaurantInfo> restaurants) {
		//null condition check
		if(restaurants==null || restaurants.size()==0)
			return restaurants;
		
		//comparator to sort restaurants based on city id
		Comparator<RestaurantInfo> cityComp = new Comparator<RestaurantInfo>() {
			
			@Override
			public int compare(RestaurantInfo o1, RestaurantInfo o2) {
				if(o1.getCityId()<o2.getCityId())
					return -1;
				else if(o1.getCityId()>o2.getCityId())
					return 1;
				return 0;
			}
		};
		/*
		 * I am going sorting for grouping restaurants as we don't have predefined set of city ids
		 * and for each city id, traversing through list adn grouping has worst case complexity of O(NxN)
		 * With sorting, we can group restaurants by city id in O(NlogN + N). I am taking avg time complexity of Quick sort 
		 */
		Collections.sort(restaurants, cityComp);
		
		Iterator<RestaurantInfo> rit = restaurants.iterator();
		List<RestaurantInfo> partOfRestaurants = new LinkedList<RestaurantInfo>();
		List<RestaurantInfo> result = new LinkedList<RestaurantInfo>();
		int sum = 0;
		int size=0;
		int avg=0;
		//Initialize variables
		RestaurantInfo prev=rit.next();
		partOfRestaurants.add(prev);
		sum+=prev.getOrderCount();
		
		while(rit.hasNext()){
			RestaurantInfo loopVar = rit.next();
			if(prev.getCityId()==loopVar.getCityId()){
				sum+=loopVar.getOrderCount();
				partOfRestaurants.add(loopVar);
				
			}
			else{
				//we fond a new city id, so get the list for old group of restarants
				size=partOfRestaurants.size();
				if(size>0){
					avg = sum/size;
					result.addAll(getMorethanAvgRestaurants(partOfRestaurants, avg));
				}
				prev=loopVar;
				sum=prev.getOrderCount();
				partOfRestaurants.clear();
				partOfRestaurants.add(prev);
			}
		}
		
		//for last group of restaurants
		size=partOfRestaurants.size();
		if(size>0){
			avg = sum/size;
			result.addAll(getMorethanAvgRestaurants(partOfRestaurants, avg));
		}
		
		return result;
	}
	/**
	 * Returns list of restaurants that have order count greater than the given average order count
	 * @param restaurantsList
	 * @param avg
	 * @return List
	 */
	private List<RestaurantInfo> getMorethanAvgRestaurants(List<RestaurantInfo> restaurantsList, int avg){
		if(restaurantsList==null)
			return null;
		
		List<RestaurantInfo> result = new LinkedList<RestaurantInfo>();
		for(RestaurantInfo rest:restaurantsList){
			//I am checking strictly greater than condition for number of orders
			if(rest.getOrderCount()>avg)
				result.add(rest);
		}
		return result;
	}

}
