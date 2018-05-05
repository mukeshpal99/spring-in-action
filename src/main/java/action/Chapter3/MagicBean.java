package action.Chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by mukeshpal on 26/04/18.
 */

public class MagicBean {

	public MagicBean(){
		System.out.println("Instantiating magc bean");
	}
}
