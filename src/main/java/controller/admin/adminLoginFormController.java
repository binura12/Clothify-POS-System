package controller.admin;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class adminLoginFormController {

    @FXML
    private Label lblAdminPswIncorrect;
    @FXML
    private Label btnDontHaveAcc;

    @FXML
    private Label btnForgotPassword;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private TextField txtAdminGmailEnter;

    @FXML
    private TextField txtAdminPasswordEnter;

    @FXML
    void btnDontHaveAccOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnForgotAdmPswOnMouseClicked(MouseEvent event) {
        System.out.println("clicked forgot password button");
    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

}
