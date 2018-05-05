package action.Chapter3.qualifire;

import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
public class Icecream implements Dessert {

	public Icecream()
	{
		System.out.println("Creating Icecream Bean");
	}

	public String getDessert() {
		return "ICE CREAM";
	}
}
