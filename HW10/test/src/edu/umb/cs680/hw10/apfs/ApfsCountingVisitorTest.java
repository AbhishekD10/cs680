package edu.umb.cs680.hw10.apfs;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class ApfsCountingVisitorTest {
	ApfsCountingVisitor visitor = new ApfsCountingVisitor();
	LocalDateTime date = LocalDateTime.now();
	APFS getInstance = APFS.getInstance();
	ApfsDirectory root = (ApfsDirectory) getInstance.InitFileSystem("APFSDirectory", 2);
	ApfsDirectory home = new ApfsDirectory("home", 0, date, root, "APFS", date);
	ApfsDirectory code = new ApfsDirectory("code", 0, date, home, "APFS", date);
	ApfsDirectory applications = new ApfsDirectory("applications", 0, date, root, "APFS", date);
	ApfsFile a = new ApfsFile("a", 100, date, applications, "APFS", date);
	ApfsFile b = new ApfsFile("b", 200, date, applications, "APFS", date);
	ApfsFile c = new ApfsFile("c", 300, date, home, "APFS", date);
	ApfsFile d = new ApfsFile("d", 400, date, home, "APFS", date);
	ApfsFile e = new ApfsFile("e", 500, date, code, "APFS", date);
	ApfsFile f = new ApfsFile("f", 600, date, code, "APFS", date);
	ApfsLink x = new ApfsLink("x", 0, date, home, "APFS", date, applications);
	ApfsLink y = new ApfsLink("y", 0, date, code, "APFS", date, f);

	@Test
	public void DirectoryNumberTestVerification() {
		root.accept(visitor);
		int expected = 4;
		int actual = visitor.getDirectoryNumber();
		assertEquals(expected, actual);
		assertNotEquals(5, actual);
	}

	@Test
	public void FileNumberTestVerification() {
		root.accept(visitor);
		int expected = 6;
		int actual = visitor.getfileNumber();
		assertEquals(expected, actual);
		assertNotEquals(4, actual);
	}

	@Test
	public void LinkNumberTestVerification() {
		root.accept(visitor);
		int expected = 2;
		int actual = visitor.getlinkNumber();
		assertEquals(expected, actual);
		assertNotEquals(1, actual);
	}

}
