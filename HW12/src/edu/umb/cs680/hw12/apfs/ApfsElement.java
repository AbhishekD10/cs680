package edu.umb.cs680.hw12.apfs;

import java.time.LocalDateTime;

import edu.umb.cs680.hw12.fs.*;

public abstract class ApfsElement extends FSElement {

	 private String ownerName;
	 private LocalDateTime modifiedTime;
	 
	 public ApfsElement( String name, int size, LocalDateTime createdTime, ApfsDirectory parent,String ownerName,LocalDateTime modifiedTime) {
			super( name, size, createdTime,parent);
			this.ownerName = ownerName;
			this.modifiedTime = modifiedTime;
		}

	public String getOwnerName() {
		return ownerName;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}
	  

}