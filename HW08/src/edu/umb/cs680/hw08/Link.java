package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public class Link extends FSElement {
	
	public FSElement target;
	
	public Link( Directory parent, String name, int size, LocalDateTime createdTime, FSElement target){
		super( parent, name, size, createdTime);
		this.target = target;
	}
	
	public boolean isLink() {
		return true;
	}
	
	public boolean isFile() {
		return false;
		
	}

	public boolean isDirectory() {
		return false;
	}
	
	public FSElement getTarget() {
		return target;
	}
	
}
