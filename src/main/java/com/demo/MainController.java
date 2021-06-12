package com.demo;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainController {

    private final UsersImpl usersImpl = (UsersImpl) DemoApplication.ctx.getBean("usersImpl");

    @FXML
    private Pane at;

    @FXML
    private Pane rg;

    @FXML
    private Pane errorparlog;

    @FXML
    private Pane errorconfpar;

    @FXML
    private Pane errorzanlog;

    @FXML
    private Pane erroremptfd;

    @FXML
    private Pane zareg;

    @FXML
    private TextField l_log;

    @FXML
    private PasswordField l_par;

    @FXML
    private TextField r_log;

    @FXML
    private PasswordField r_par;

    @FXML
    private PasswordField r_cpar;

    public void initialize()
    {
        auth();
    }

    public void auth()
    {
        at.setVisible(true);
        rg.setVisible(false);
    }

    public void reg()
    {
        at.setVisible(false);
        rg.setVisible(true);
    }

    public void unvispl()
    {
        errorparlog.setVisible(false);
    }

    public void unvispovpar()
    {
        errorconfpar.setVisible(false);
    }

    public void unvislogzan()
    {
        errorzanlog.setVisible(false);
    }

    public void unvisemptfd()
    {
        erroremptfd.setVisible(false);
    }

    public void zaregok()
    {
        zareg.setVisible(false);
        auth();
    }

    public void signup()
    {
        if(r_log.getText().isEmpty() || r_par.getText().isEmpty() || r_cpar.getText().isEmpty()) {
            erroremptfd.setVisible(true);
            return;
        }
        if(usersImpl.hasuser(r_log.getText()))
        {
            errorzanlog.setVisible(true);
            return;
        }
        if(!r_par.getText().equals(r_cpar.getText()))
        {
            errorconfpar.setVisible(true);
            return;
        }
        Users user = new Users();
        user.setUsername(r_log.getText());
        user.setPassword(r_par.getText());
        usersImpl.add(user);
        zareg.setVisible(true);
    }

    public void log_in() throws IOException {
        if(l_log.getText().isEmpty() || l_par.getText().isEmpty()) {
            erroremptfd.setVisible(true);
            return;
        }
        boolean truelp = usersImpl.checkpar(l_log.getText(), l_par.getText());
        if(!truelp)
        {
            errorparlog.setVisible(true);
        }else{
            Start.close_main();
            Start.show_base();
        }
    }
}
