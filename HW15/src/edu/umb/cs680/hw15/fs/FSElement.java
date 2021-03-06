package edu.umb.cs680.hw15.fs;

import java.time.LocalDateTime;
import edu.umb.cs680.hw15.apfs.*;

public abstract class FSElement {
	private ApfsDirectory parent;
	private String name;
	private int size;
	private LocalDateTime creationTime;
	
	public FSElement(String name, int size, LocalDateTime creationTime,ApfsDirectory parent ) {
		this.name= name;
		this.size=size;
		this.creationTime=creationTime;
		this.parent = parent;
	}
	
	public void setParent(ApfsDirectory parent) {
		this.parent = parent;
	}
	
	public ApfsDirectory getParent() {
		return this.parent;
	}
	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}
	
	public LocalDateTime getCreationTime() {
		return this.creationTime;
	}
	public abstract boolean isDirectory();
	
	public abstract boolean isFile();
	
	public abstract boolean isLink();
	
}