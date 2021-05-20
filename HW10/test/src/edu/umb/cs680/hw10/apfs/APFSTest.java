package edu.umb.cs680.hw10.apfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class APFSTest {
	public LocalDateTime date = LocalDateTime.now();

	APFS getInstance = APFS.getInstance();

	private String[] ApfsElementtoStringArray(ApfsElement element) {

		String[] elementInfo = { element.getName(), Boolean.toString(element.isDirectory()), element.getOwnerName() };

		return elementInfo;
	}

	@Test
	public void APFSVerification() {
		APFS a = APFS.getInstance();
		APFS b = APFS.getInstance();
		assertSame(a, b);
	}

	@Test
	public void getRootDirsVerification() {
        getInstance.InitFileSystem("APFS", 717);
		ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFS" };
		assertArrayEquals(expected, ApfsElementtoStringArray(actual));
	}

	
	@Test
	public void getRootDirsError() {
        getInstance.InitFileSystem("APFS", 7);
		ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFSFileSystem" };
		assertFalse(Arrays.deepEquals(expected, ApfsElementtoStringArray(actual)) );
	}
	
	@Test
	public void createDefaultRootVerification() {
		getInstance.InitFileSystem("APFS", 17);
        ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFS" };
		assertArrayEquals(expected, ApfsElementtoStringArray(actual));
	}
	
	@Test
	public void createDefaultRootError() {
		getInstance.InitFileSystem("APFS", 17);
        ApfsDirectory actual = getInstance.getRootDirs();
		String[] expected = { "root", "true", "APFSFileSystem" };
		assertFalse(Arrays.deepEquals(expected, ApfsElementtoStringArray(actual)) );
	}
	
	

}

