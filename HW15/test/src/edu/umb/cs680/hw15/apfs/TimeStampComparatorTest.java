package edu.umb.cs680.hw15.apfs;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;


class TimeStampComparatorTest {

	LocalDateTime date = LocalDateTime.now();
	 APFS getInstance = APFS.getInstance();
		ApfsDirectory root = (ApfsDirectory) getInstance.InitFileSystem("APFSDirectory", 2);
	  ApfsDirectory home = new ApfsDirectory( "home", 0, date,root,"APFS",date);
	  ApfsDirectory code = new ApfsDirectory( "code", 0, date,home,"APFS",date);
	  ApfsDirectory applications = new ApfsDirectory( "applications", 0, date,root,"APFS",date);
	 ApfsFile a = new ApfsFile( "a", 100, date,applications,"APFS",date);
	 ApfsFile b = new ApfsFile( "b", 200, date,applications,"APFS",date);
	 ApfsFile c = new ApfsFile( "c", 300, date,home,"APFS",date);
	 ApfsFile d = new ApfsFile( "d", 400, date,home,"APFS",date);
	 ApfsFile e = new ApfsFile( "e", 500, date,code,"APFS",date);
	 ApfsFile f = new ApfsFile( "f", 600, date,code,"APFS",date);
	 ApfsLink x = new ApfsLink("x",0, date, home,"APFS",date,applications);
	 ApfsLink y = new ApfsLink("y",0,date,code,"APFS",date,f);

	
	 
	 @Test
	 public void getSubDirectoriesVerification() {
		     ApfsDirectory[] expected = { code};
           ApfsDirectory directory = home;
	        List<ApfsDirectory> element = directory.getSubDirectories((ApfsElement o1, ApfsElement o2) -> 
			 o2.getModifiedTime().compareTo(o1.getModifiedTime()));
	        assertArrayEquals(expected,element.toArray() );
	 }
	 
	 @Test
	 public void getFilesVerification() {
		     ApfsFile[] expected = { e,f};
           ApfsDirectory directory = code;
	        List<ApfsFile> element = directory.getFiles((ApfsElement o1, ApfsElement o2) -> 
			 o2.getModifiedTime().compareTo(o1.getModifiedTime()));
	        assertArrayEquals(expected,element.toArray());
	 }
	 
	 @Test
	 public void getChildrenVerification() {
		     ApfsElement[] expected = {applications, home};
            ApfsDirectory directory = root;
	        List<ApfsElement> element = directory.getChildren((ApfsElement o1, ApfsElement o2) -> o1.getName().compareTo(o2.getName()));
	        assertArrayEquals(expected,element.toArray() );
	 }
	 

}