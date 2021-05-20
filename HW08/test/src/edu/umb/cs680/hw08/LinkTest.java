package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class LinkTest {

	 LocalDateTime date = LocalDateTime.now();
	 Directory root = new Directory( null,"root", 0, date);
	 Directory home = new Directory( root, "home", 0, date);
	 Directory code = new Directory( home,"code", 0, date);
	 Directory pics = new Directory( home,"pics", 0, date);
	 Directory applications = new Directory( root,"applications", 0, date);
	 File a = new File( applications,"a", 100, date);
	 File b = new File( home,"b", 200, date);
	 File c = new File( code,"c", 300, date);
	 File d = new File( code,"d", 400, date);
	 File e = new File( pics,"e", 500, date);
	 File f = new File( pics,"f", 600, date);
	 Link x = new Link (home,"x",700,date,applications);
	 Link y = new Link (code,"y",800,date,a);
	 
	 @Test
		public void LinkRootXVerification() {
			
			Directory expected = applications;
			FSElement actual = x.getTarget();
			assertSame(expected,actual);
		}
	 @Test
		public void LinkRootYVerification() {
			
			File expected = a;
			FSElement actual = y.getTarget();
			assertSame(expected,actual);
		}
	 @Test
		public void LinkRootXError() {
			
			Directory expected = home;
			FSElement actual = x.getTarget();
			assertNotEquals(expected,actual);
		}
	 @Test
		public void LinkRootYError() {
			
			File expected = c;
			FSElement actual = y.getTarget();
			assertNotEquals(expected,actual);
		}
}
