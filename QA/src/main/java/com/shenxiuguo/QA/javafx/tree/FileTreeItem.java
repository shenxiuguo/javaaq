package com.shenxiuguo.QA.javafx.tree;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FileTreeItem extends TreeItem<String> {
	private static final Image dirIconImage = new Image(FileTreeItem.class.getResource("dir-icon.png").toString());
	private static final Image fileIconImage = new Image(FileTreeItem.class.getResource("file-icon.png").toString());
	
	private boolean isLeaf;
	
	private boolean isFirstTimeChildren = true;
	
	private File file;
	
	public FileTreeItem(File file) {
		super(file.getName());
		this.file = file;
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
	public ObservableList<TreeItem<String>> getChildren() {
		if(isFirstTimeChildren) {
			//在第一次的时候必须在改处提前设置，否则会进入死循环
			isFirstTimeChildren = false;
			ObservableList<TreeItem<String>> children = super.getChildren();
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				if(files != null) {
					ObservableList<TreeItem<String>> list = FXCollections.observableArrayList();
					for (File f : files) {
						list.add(new FileTreeItem(f));
					}
					children.clear();
					children.setAll(list);
				}
			}
			
//			isFirstTimeChildren = false; //不能在这里才设置改值  children.setAll(list);会回掉getChildren方法，否则会进入死循环
		}
		
		return super.getChildren();
    }
	
}
