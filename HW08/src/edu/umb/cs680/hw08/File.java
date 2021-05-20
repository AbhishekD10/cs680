package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.FSElement;

public class File extends FSElement {
	public File( Directory parent,String name, int size, LocalDateTime createdTime) {
		super( parent, name, size, createdTime);
		parent.appendChild(this);
	}

	public boolean isDirectory() {
		return false;
	}
	
	public boolean isFile() {
		return true;
	}
}
