package factory;

public class pizzahouma extends pizzafactory {

	 //use getPlan method to get object of type Plan
	 public static pizza getcreatpizza(String pizzaType){
	 if(pizzaType == null){
	 return null;
	 }
	 if(pizzaType.equalsIgnoreCase("SIMPLE PIZZA")) {
	 return new simplepizza();
	 }
	 else if(pizzaType.equalsIgnoreCase("TUNA PIZZA")) {
		 return new tunapizza();
	 }
	 return null;
	 }
	}