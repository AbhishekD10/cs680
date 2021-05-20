package edu.umb.cs680.hw10.apfs;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ApfsFileSearchVisitorTest {

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
		public void ApfsFileAVerification() {
			ApfsFile[] expected = {a};
	        ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("a");
	        root.accept(visitor);
	        List<ApfsFile> files = visitor.getFoundFiles();
	        assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]) );
		}
			
		@Test
		public void ApfsFileBVerification() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("b");
			ApfsFile[] expected = {b};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]));
		}
		
		@Test
		public void ApfsFileCVerification() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("c");
			ApfsFile[] expected = {c};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]));
		}
		
		@Test
		public void ApfsFileDVerification() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("d");
			ApfsFile[] expected = {d};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]));
		}
		
		@Test
		public void ApfsFileEVerification() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("e");
			ApfsFile[] expected = {e};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]));
		}
		
		@Test
		public void ApfsFileFVerification() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("f");
			ApfsFile[] expected = {f};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertArrayEquals(expected,files.toArray(new ApfsFile[files.size()]));
		}

		@Test
		public void ApfsFileEError() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("a");
			ApfsFile[] expected = {e};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
		}
		
		@Test
		public void ApfsFileFError() {
			ApfsFileSearchVisitor visitor = new ApfsFileSearchVisitor("b");
			ApfsFile[] expected = {f};
			root.accept(visitor);
			List<ApfsFile> files = visitor.getFoundFiles();
			assertFalse(Arrays.deepEquals(expected, files.toArray(new ApfsFile[files.size()])) );
		}

}
