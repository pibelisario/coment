package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import intities.Comment;
import intities.Post;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		Scanner in = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		System.out.println("Moment: ");
		Date moment = sdf.parse(in.next());
		
		System.out.println("Title: ");
		in.nextLine();
		String title = in.nextLine();
		
		System.out.println("Content: ");
		in.nextLine();
		String content = in.nextLine();
		
		//Post post = new Post(moment, title, content);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Comment " +(1+i)+": ");
			in.nextLine();
			String Comments = in.nextLine();
		}

	}

}
