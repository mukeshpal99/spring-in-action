package action.Chapter3.qualifire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
@Qualifier("best_ice_cream")
public class Icecream implements Dessert {

	public Icecream()
	{
		System.out.println("Creating Icecream Bean");
	}

	public String getDessert() {
		return "ICE CREAM";
	}
}
