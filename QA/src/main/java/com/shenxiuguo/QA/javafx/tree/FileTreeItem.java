package com.shenxiuguo.QA.javafx.tree;

import java.io.File;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FileTreeItem extends TreeItem<File> {
	private static final Image dirIconImage = new Image(FileTreeItem.class.getResource("dir-icon.png").toString());
	private static final Image fileIconImage = new Image(FileTreeItem.class.getResource("file-icon.png").toString());
	
	private boolean isLeaf;
	
	private boolean isFirstTimeChildren = true;
	
	public FileTreeItem(File file) {
		super(file);
		if(file.isDirectory()) {
			isLeaf = false;
			setGraphic(new ImageView(dirIconImage));
		} else {
			isLeaf = true;
			setGraphic(new ImageView(fileIconImage));
		}
 	}
	
	@Override 
	public boolean isLeaf() {
        return isLeaf;
    }
	
	@Override 
	public ObservableList<TreeItem<File>> getChildren() {
		System.out.println(getValue());
		if(isFirstTimeChildren) {
			ObservableList<TreeItem<File>> children = super.getChildren();
			File file = getValue();
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				for (File f : files) {
					children.add(new FileTreeItem(f));
				}
			}
			isFirstTimeChildren = false;
		}
		
		return super.getChildren();
    }
	
	private void justtest() {
		File value2 = getValue();
	}
}
