package ice_cream;

import java.util.LinkedList;

public class IceCreamApp {

	public static void main(String[] args) {

		IceCreamTastes instance = IceCreamTastes.getInstance();

		System.identityHashCode(instance);

		System.out.println("Ice Cream Tastes: \n" + instance.getTasteList());
		System.out.println("");

		System.out.println("..................................................................");
		LinkedList<String> iceCream1 = instance.getTastes(2);

		System.out.println("Ice Cream 1: " + iceCream1);

		LinkedList<String> iceCream2 = instance.getTastes(4);

		System.out.println("Ice Cream 2: " + iceCream2);
		System.out.println("..................................................................");

	}

}
