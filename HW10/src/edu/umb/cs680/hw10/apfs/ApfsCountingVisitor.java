package edu.umb.cs680.hw10.apfs;

public class ApfsCountingVisitor implements ApfsFSVisitor {
	
	private int directoryNumber = 0;
	private int fileNumber = 0;
	private int linkNumber = 0;
	
	public void visit(ApfsFile file) {
		fileNumber++;
	}
	
	public void visit(ApfsDirectory dir) {
		directoryNumber++;
	}
	
	public void visit(ApfsLink link) {
		linkNumber++;
	}
	
	public int getDirectoryNumber(){
		return this.directoryNumber;
	}
	
	public int getfileNumber(){
		return this.fileNumber;
	}
	
	public int getlinkNumber(){
		return this.linkNumber;
	}
}
