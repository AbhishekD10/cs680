package edu.umb.cs680.hw12.fs;

import java.util.LinkedList;
import java.util.List;

public abstract class FileSystem {

	protected String name;
	protected int capacity;
	protected int id;
	protected abstract FSElement createDefaultRoot();
	protected FSElement rootDirs ;
	
	public FSElement InitFileSystem(String name,int capacity) {
		this.name = name;
		this.capacity = capacity;
		FSElement root = createDefaultRoot();
		if ((root.isDirectory()) && (capacity >=root.getSize())) {
			setRoot(root);
			this.id = root.hashCode();
			return root;
		}
		else {
			return null;
		}
	}
	
	public void setRoot(FSElement root)
	{
		this.rootDirs = root;
	}
	public String getName() {
		return this.name;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public int getId() {
		return this.id;
	}
	public FSElement getRoot() {
		return this.rootDirs;
	}
}
