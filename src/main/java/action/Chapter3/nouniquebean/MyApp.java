package action.Chapter3.nouniquebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import action.CDPlayerConfig;

/**
 * Created by mukeshpal on 31/03/18.
 */
public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		Hotel2 hotel = ctx.getBean(Hotel2.class);
	}
}
