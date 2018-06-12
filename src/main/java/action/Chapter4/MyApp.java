package action.Chapter4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import action.JavaBeanConfig;

/**
 * Created by mukeshpal on 31/03/18.
 */
public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaBeanConfig.class);

		CDPlayer4 cdPlayer = ctx.getBean(CDPlayer4.class);
		cdPlayer.play();
	}
}
