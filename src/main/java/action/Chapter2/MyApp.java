package action.Chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import action.CDPlayerConfig;

/**
 * Created by mukeshpal on 31/03/18.
 */
public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

		CDPlayer cdPlayer1 = ctx.getBean(CDPlayer.class);
		cdPlayer1.play();
	}
}
