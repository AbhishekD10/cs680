package edu.umb.cs680.hw10.apfs;

import java.util.LinkedList;
import java.util.List;

public class ApfsfileCrawlingVisitor implements ApfsFSVisitor {

	private List<ApfsFile> files = new LinkedList<ApfsFile>();

	public List<ApfsFile> getFiles() {
		return files;
	}

	public void visit(ApfsLink link) {
		return;
	}

	public void visit(ApfsDirectory dir) {
		return;
	}

	public void visit(ApfsFile file) {
		files.add(file);
	}

}
