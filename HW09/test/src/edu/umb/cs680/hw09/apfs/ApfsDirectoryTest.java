package edu.umb.cs680.hw09.apfs;

import static org.junit.jupiter.api.Assertions.*;
import edu.umb.cs680.hw09.fs.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ApfsDirectoryTest {

	  LocalDateTime date = LocalDateTime.now();
	  APFS getInstance = APFS.getInstance();
	  ApfsDirectory root = (ApfsDirectory) getInstance.InitFileSystem("APFSDirectory", 5);
	  ApfsDirectory applications = new ApfsDirectory( "applications", 0, date,root,"APFS",date);
	  ApfsDirectory home = new ApfsDirectory( "home", 0, date,root,"APFS",date);
	  ApfsDirectory code = new ApfsDirectory( "code", 0, date,home,"APFS",date);
	  ApfsFile a = new ApfsFile( "a", 100, date,applications,"APFS",date);
	  ApfsFile b = new ApfsFile( "b", 200, date,applications,"APFS",date);
	  ApfsFile c = new ApfsFile( "c", 300, date,home,"APFS",date);
	  ApfsFile d = new ApfsFile( "d", 400, date,home,"APFS",date);
	  ApfsFile e = new ApfsFile( "e", 500, date,code,"APFS",date);
	  ApfsFile f = new ApfsFile( "f", 600, date,code,"APFS",date);
	  ApfsLink x = new ApfsLink("x",0, date, home,"APFS",date,applications);
	  ApfsLink y = new ApfsLink("y",0,date,code,"APFS",date,f);
	 
	 

	 private String[] directoryToStringArr(ApfsDirectory d) {
			String parentName = null;
			ApfsDirectory parent = d.getParent();
			if (parent != null) {
				parentName = parent.getName();
			}
			String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),Boolean.toString(d.isDirectory()),
					d.getCreationTime().toString(),parentName, Integer.toString(d.getTotalSize()),
					d.getOwnerName(), d.getModifiedTime().toString()};
			return dirInfo;
		}
	 
	 @Test
		public void DirectoryEqualityRootVerification() {
			
			String[] expected = {  "root", "0","true", date.toString(), null, "2100","APFS",date.toString() };
			ApfsDirectory actual = root;
			assertArrayEquals(expected, directoryToStringArr(actual));
		}

	 @Test
		public void DirectoryEqualityApplicationsVerification() {

			String[] expected = {  "applications", "0","true", date.toString(), "root", "300","APFS",date.toString() };
			ApfsDirectory actual = applications;
			assertArrayEquals(expected, directoryToStringArr(actual));
		}
		
		@Test
		public void DirectoryEqualityHomeVerification() {
		
			String[] expected = {  "home", "0","true", date.toString(),"root", "1800","APFS",date.toString() };
			ApfsDirectory actual = home;
			assertArrayEquals(expected, directoryToStringArr(actual));
		}

		

		@Test
		public void DirectoryEqualityCodeVerification() {
		
			String[] expected = {  "code", "0","true", date.toString(), "home", "1100","APFS",date.toString() };
			ApfsDirectory actual = code;
			assertArrayEquals(expected, directoryToStringArr(actual));
			
		}
		
}

