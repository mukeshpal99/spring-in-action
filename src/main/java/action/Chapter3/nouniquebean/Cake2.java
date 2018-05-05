package action.Chapter3.nouniquebean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
public class Cake2 implements Dessert{

	public Cake2()
	{
		System.out.println("Creating Cake Bean");
	}

}
