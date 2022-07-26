package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import intities.Comment;
import intities.Post;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment comment1 = new Comment("Have a nice tripe");
		Comment comment2 = new Comment("Wow tha's awesome");
		
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		post.addComment(comment1);
		post.addComment(comment2);
		
		System.out.println(post);
		//------------------------------------//
		System.out.println();
		
		Post post2 = new Post(sdf.parse("28/08/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the force be with you");
	
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post2);
		
		
	}
}
