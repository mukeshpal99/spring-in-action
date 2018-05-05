package action.Chapter3.nouniquebean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
public class Icecream2 implements Dessert{

	public Icecream2()
	{
		System.out.println("Creating Icecream Bean");
	}
}
