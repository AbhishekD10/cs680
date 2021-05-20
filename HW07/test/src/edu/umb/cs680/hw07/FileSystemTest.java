package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FileSystemTest {

static LocalDateTime creationTime = LocalDateTime.now();
	
	
	private String[] fileSystemToString(Directory d) {
		String[] dirInfo = {  d.getName(), Integer.toString(d.getSize()),null, d.getCreationTime().toString() };
		return dirInfo;
	}
	
	
	@Test
	void FileSystem_validverification() {
		FileSystem one = FileSystem.getFileSystem();
		FileSystem two = FileSystem.getFileSystem();
		assertSame(one, two);
	}

	@Test
	void addRootDirTest_validverification() {
		Directory root = new Directory( null,"root", 207, creationTime);
		String[] expected = { "root", "207",null, creationTime.toString() };
		Directory actual = root;
		assertArrayEquals(expected, fileSystemToString(actual));
	}
	
	@Test
	void addRootDirTest_invalidverification() {
		Directory root = new Directory( null,"main", 1717, creationTime);
		String[] expected = { "root", "207",null, creationTime.toString() };
		Directory actual = root;
		assertFalse(Arrays.deepEquals(expected, fileSystemToString(actual)) );
		
	}
	
	
	
	

}
