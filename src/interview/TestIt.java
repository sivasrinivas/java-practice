package interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestIt {

	public static void main(String[] args) {
		
		List<RestaurantInfo> list = new LinkedList<RestaurantInfo>();
		list.add(new RestaurantInfo(1, 100, 1));

		RestaurantFinder rf = new RestaurantFinderImpl();
		//Returns empty list as condition is order count should be strictly greater than average city order count
		System.out.println(rf.getTopPerformers(list));
	}

}
