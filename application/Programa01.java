package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Post;
import entities.comment;

public class Programa01 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		comment c1 = new comment("Have a nice trip!");
		comment c2 = new comment("Wow that´s awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		comment c3 = new comment("Good night");
		comment c4 = new comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
