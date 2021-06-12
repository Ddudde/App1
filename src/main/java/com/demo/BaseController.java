package com.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.KeyEvent;

public class BaseController {

    @FXML
    private Pane ak;

    @FXML
    private Pane glav;

    @FXML
    private Pane catal;

    public void initialize()
    {
        setgl();
    }

    public void setacc()
    {
        glav.setVisible(false);
        ak.setVisible(true);
        catal.setVisible(false);
    }

    public void setgl()
    {
        glav.setVisible(true);
        ak.setVisible(false);
        catal.setVisible(false);
    }

    public void setcat()
    {
        glav.setVisible(false);
        ak.setVisible(false);
        catal.setVisible(true);
    }
}
