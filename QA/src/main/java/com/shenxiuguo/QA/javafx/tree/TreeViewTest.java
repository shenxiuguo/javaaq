package com.shenxiuguo.QA.javafx.tree;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

/**
 * TreeView示例
 * @author shenxg
 *
 */
public class TreeViewTest extends Application {
	/**
	 * nothing:加载 tree.fxml中的树形结构 <br/>
	 * singleRoot:只有一个Root的树形结构<br/>
	 * multiRoot:多个Root的树形结构<br/>
	 * fileSystem:加载文件系统中的文件树形结构
	 */
	public static final String TreeType = "fileSystem"; 

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("tree.fxml"));
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
