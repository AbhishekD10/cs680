package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class DirectoryTest {

	LocalDateTime date = LocalDateTime.now();
	 Directory root = new Directory( null,"root", 0, date);
	 Directory home = new Directory( root, "home", 0, date);
	 Directory code = new Directory( home,"code", 0, date);
	 Directory applications = new Directory( root,"applications", 0, date);
	 File a = new File( applications,"a", 100, date);
	 File b = new File( applications,"b", 200, date);
	 File c = new File( home,"c", 300, date);
	 File d = new File( home,"d", 400, date);
	 File e = new File( code,"e", 500, date);
	 File f = new File( code,"f", 600, date);

	 private String[] dirToStringArray(Directory d) {
			String parentName = null;
			Directory parent = d.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),Boolean.toString(d.isDirectory()),
					d.getCreationTime().toString(),parentName, Integer.toString(d.countChildren()),Integer.toString(d.getTotalSize()) };
			return dirInfo;
		}
		
	 
	 @Test
		public void DirectoryRootVerification() {
			
			String[] expected = {  "root", "0","true", date.toString(), null, "2","2100" };
			Directory actual = root;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		@Test
		public void DirectoryHomeVerification() {
		
			String[] expected = {  "home", "0","true", date.toString(),"root", "3","1800" };
			Directory actual = home;
			assertArrayEquals(expected, dirToStringArray(actual));
		}

		

		@Test
		public void DirectoryCodeVerification() {
		
			String[] expected = {  "code", "0","true", date.toString(), "home", "2","1100" };
			Directory actual = code;
			assertArrayEquals(expected, dirToStringArray(actual));
			
		}
		
		@Test
		public void DirectoryApplicationsVerification() {

			String[] expected = {  "applications", "0","true", date.toString(), "root", "2","300" };
			Directory actual = applications;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
}
