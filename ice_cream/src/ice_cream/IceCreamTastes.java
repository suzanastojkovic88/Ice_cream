package ice_cream;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class IceCreamTastes {

	private static IceCreamTastes firstInstance = null;

	String[] allTastes = { "vanilla", "chocolate", "strawberry", "snickers", "pistachios", "kiwi", "raspberry", "melon",
			"plazma", "cappuccino", "coffee", "cherry", "banana", "cheesecake" };

	private LinkedList<String> tasteList = new LinkedList<String>(Arrays.asList(allTastes));

	static boolean iceCream = true;

	private IceCreamTastes() {
	}

	public static IceCreamTastes getInstance() {
		if (firstInstance == null) {

			if (iceCream) {

				iceCream = false;

				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			synchronized (IceCreamTastes.class) {

				if (firstInstance == null) {

					firstInstance = new IceCreamTastes();

					Collections.shuffle(firstInstance.tasteList);

				}

			}

		}

		return firstInstance;
	}

	public LinkedList<String> getTasteList() {

		return firstInstance.tasteList;

	}

	public LinkedList<String> getTastes(int howManyTastes) {

		LinkedList<String> tastes = new LinkedList<String>();

		for (int i = 0; i <= howManyTastes; i++) {

			tastes.add(firstInstance.tasteList.remove(0));

		}

		return tastes;

	}

}