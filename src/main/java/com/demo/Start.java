package com.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class Start extends Application {

    private static Pane root;

    private static Map<String, Object> roots;

    private static Scene scene;

    private static Stage primStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        primStage = primaryStage;
        primStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/logo_mini.png")));
        primStage.setTitle("Lapy&Hwost");
        primStage.setResizable(false);
        show_main();
        //close_main();
        //show_base();
    }

    public void show_main() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/main.fxml");
        loader.setLocation(xmlUrl);
        root = loader.load();
        scene = new Scene(root,1280,720);
        primStage.setScene(scene);
        primStage.show();
        roots = loader.getNamespace();
        for(Node n : root.getChildrenUnmodifiable())
            n.requestFocus();
    }

    public static void close_main()
    {
        primStage.close();
    }

    public static void show_base() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = Start.class.getResource("/fxml/base.fxml");
        loader.setLocation(xmlUrl);
        root = loader.load();
        scene = new Scene(root,1280,720);
        primStage.setScene(scene);
        primStage.show();
        roots = loader.getNamespace();
        for(Node n : root.getChildrenUnmodifiable())
            n.requestFocus();
    }
}
