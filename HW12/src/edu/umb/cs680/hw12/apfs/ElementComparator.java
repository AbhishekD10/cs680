package edu.umb.cs680.hw12.apfs;

import java.util.Comparator;

public class ElementComparator implements Comparator<ApfsElement> {
	
	public int compare(ApfsElement element1, ApfsElement element2) {
		return element1.getOwnerName().compareTo(element2.getOwnerName());
	}
}