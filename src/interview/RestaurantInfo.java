package interview;

public class RestaurantInfo {
	private int restaurantId;
	private int orderCount;
	private int cityId;

	public RestaurantInfo(int restaurantId, int orderCount, int cityId) {
		this.restaurantId = restaurantId;
		this.orderCount = orderCount;
		this.cityId = cityId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public int getCityId() {
		return cityId;
	}
	//Utility function to use Object directly in println method
	public String toString(){
		return "["+restaurantId+","+orderCount+","+cityId+"]";
	}
}