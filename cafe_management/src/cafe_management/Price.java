package cafe_management;

public enum Price {
	
	LATTLE(30),ICED_LATTLE(35),ESPRESSO(40),CAPPUCCINO(50),	ICE_CAPPUCCINO(60),
	COFFEE_CAKE(150),RED_VELVED_CAKE(250),BOSTON_CAKE(250),BLACK_FOREST_CAKE(300),	LAGOS_CAKE(400);
	int price;
	
	Price(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return this.price;
	}
}
