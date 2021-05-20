package edu.umb.cs680.hw15.apfs;

import java.time.LocalDateTime;
import java.util.LinkedList;
import edu.umb.cs680.hw15.fs.*;

public class APFS extends FileSystem {

	private static APFS instance = null;

	private ApfsDirectory root;

	protected FSElement createDefaultRoot() {
		LocalDateTime localTime = LocalDateTime.now();
		root = new ApfsDirectory( "root", 0, localTime,null, "APFS", localTime);
		return root;
	}

	public ApfsDirectory getRootDirs() {
		return root;
	}

	public static APFS getInstance() {
		if (instance == null)
			instance = new APFS();
		return instance;
	}
}
