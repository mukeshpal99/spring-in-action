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
		//CDPlayer cdPlayer1 = ctx.getBean("cDPlayer", CDPlayer.class);
		//CDPlayer cdPlayer2 = ctx.getBean("anotherCdPlayer", CDPlayer.class);
		cdPlayer1.play();


		System.out.println("CD Player1 Bean: "+cdPlayer1);
		System.out.println("Compact Disc1 Bean: "+cdPlayer1.compactDisc);

		//System.out.println("CD Player2 Bean: "+cdPlayer2);
		//System.out.println("Compact Disc2 Bean: "+cdPlayer2.compactDisc);


	}
}
