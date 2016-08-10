package com.shenxiuguo.QA.javafx.tree;
import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TreeViewController {
	
	private final Image dirIconImage = new Image(getClass().getResource("dir-icon.png").toString());
	private final Image fileIconImage = new Image(getClass().getResource("file-icon.png").toString());

    @SuppressWarnings("rawtypes")
	@FXML
    private TreeView treeView;

    @FXML
    void initialize() {
    	if("nothing".equals(TreeViewTest.TreeType)) {
    	} 
    	else if("singleRoot".equals(TreeViewTest.TreeType)) {
    		singleRoot();
    	}
    	else if("multiRoot".equals(TreeViewTest.TreeType)){
    		multiRoot();
    	}
    	else if("fileSystem".equals(TreeViewTest.TreeType)){
    		fileSystem();
    	}
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void fileSystem() {
    	TreeItem rootItem = new TreeItem();
    	treeView.setRoot(rootItem);
    	//将最原始的root隐藏掉
    	treeView.setShowRoot(false);
    	File[] fileRoots = File.listRoots();
    	for (File root : fileRoots) {
    		rootItem.getChildren().add(new FileTreeItem(root));
		}
    	
    }
    
    /**
     * 显示多个root节点
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void multiRoot() {
    	TreeItem rootItem = new TreeItem("hideRoot");
    	treeView.setRoot(rootItem);
    	//将最原始的root隐藏掉
    	treeView.setShowRoot(false);
    	TreeItem<String> rootA = new TreeItem<>("RootA", getDirIcon());
    	rootA.getChildren().add(new TreeItem<>("nodeA", getFileIcon()));
    	TreeItem<String> rootB = new TreeItem<>("RootB", getDirIcon());
    	rootB.getChildren().add(new TreeItem<>("nodeB", getFileIcon()));
    	TreeItem<String> rootC = new TreeItem<>("RootC", getDirIcon());
    	rootC.getChildren().add(new TreeItem<>("nodeC", getFileIcon()));
    	rootItem.getChildren().add(rootA);
    	rootItem.getChildren().add(rootB);
    	rootItem.getChildren().add(rootC);
    }
    
    /**
     * 添加单节点树
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void singleRoot() {
    	TreeItem rootItem = new TreeItem("root", getDirIcon());
    	treeView.setRoot(rootItem);
    	for(int i=0; i< 100; i++) {
    		rootItem.getChildren().add(new TreeItem<>("number"+ i));
    	}
    	rootItem.getChildren().add(new TreeItem<>("number abc f d sa fd sa d sa f dsa fd saf ds a fd sa fd sa fd sa f dsa fdsa "));
    }
    
    private Node getDirIcon() {
    	return new ImageView(dirIconImage);
    }
    private Node getFileIcon() {
    	return new ImageView(fileIconImage);
    }
}
