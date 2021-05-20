package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FileTest {

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
	 
	 
	 private String[] fileToString(File file) {
			String parentName = null;
			Directory parent = file.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] fileInfo = {  parentName,file.getName(), Integer.toString(f.getSize()),Boolean.toString(file.isDirectory()),
					file.getCreationTime().toString() };
			return fileInfo;
		}
	 
		 @Test
		    void error_FileA() {
				
				String[] expected = { "applications", "a", "50","true", date.toString()};
				File actual = a;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
		    void error_FileB() {
				
				String[] expected = { "home","y", "200", "false",date.toString()};
				File actual = b;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}

			@Test
			void error_FileC() {
				
				String[] expected = { "home","z", "300","false", date.toString()};
				File actual = c;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			 void error_FileD() {
				
				String[] expected = { "code", "d", "400","false", date.toString()};
				File actual = d;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			
			@Test
		     void error_FileE() {
			
				String[] expected = {  "code", "k", "500","false", date.toString()};
				File actual = e;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			void error_FileF() {
				String[] expected = {  "code","f", "600","true", date.toString() };
				File actual = f;
				assertFalse(Arrays.deepEquals(expected, fileToString(actual)) );
			}
			
			@Test
			void pass_FileF() {
				String[] expected = {  "code","f", "600","false", date.toString() };
				File actual = f;
				assertTrue(Arrays.deepEquals(expected, fileToString(actual)) );
			}
		
		

}
