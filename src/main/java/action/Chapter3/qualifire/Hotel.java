package action.Chapter3.qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mukeshpal on 26/04/18.
 */
@Component
public class Hotel {

	@Autowired
	@Qualifier("cake")
	public Dessert dessert;

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}



}
