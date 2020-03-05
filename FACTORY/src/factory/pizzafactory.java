package factory;

public class pizzafactory {

	public static void main(String[] args) {
		pizza pizza = pizzahouma.getcreatpizza("TUNA PIZZA");
        pizza.getprice();
        pizza pizzaa = pizzahouma.getcreatpizza("Simple PIZZA");
        pizzaa.getprice();
        pizza pizza1 = pizzalux.getcreatpizza("MARGARITA PIZZA");
        pizza1.getprice();
        pizza pizza2 = pizzalux.getcreatpizza("TUNA PIZZA");
        pizza2.getprice();

	      
		
		 }
		 }