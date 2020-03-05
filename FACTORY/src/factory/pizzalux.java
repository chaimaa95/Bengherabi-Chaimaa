package factory;

public class pizzalux extends pizzafactory{
	public static pizza getcreatpizza(String pizzaType){
		 if(pizzaType == null){
		 return null;
		 }
		 if(pizzaType.equalsIgnoreCase("MARGARITA PIZZA")) {
		 return new margaritapizza();
		 }
		 else if(pizzaType.equalsIgnoreCase("TUNA PIZZA")) {
			 return new tunapizza();
		 }
		 return null;
		 }
		}
