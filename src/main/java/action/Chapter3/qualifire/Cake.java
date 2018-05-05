package action.Chapter3.qualifire;

import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
public class Cake implements Dessert {

	public Cake()
	{
		System.out.println("Creating Cake Bean");
	}


	public String getDessert() {
		return "CAKE";
	}
}
