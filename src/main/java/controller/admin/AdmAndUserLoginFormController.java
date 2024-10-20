package controller.admin;

import com.jfoenix.controls.JFXButton;
import controller.DashFormController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import service.ServiceFactory;
import service.custom.AdminService;
import util.ServiceType;

import java.io.IOException;

public class AdmAndUserLoginFormController {

    @FXML
    private Label btnDontHaveAnAcc;

    @FXML
    private Label btnForgotPassword;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Label lblPswIncorrect;

    @FXML
    private TextField txtGmailEnter;

    @FXML
    private TextField txtPasswordEnter;

    @FXML
    void initialize() {
        lblPswIncorrect.setVisible(false);
    }

    @FXML
    void btnDontHaveAnAccOnMouseClicked(MouseEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/register_form.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnForgotPswOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        if (DashFormController.isAdmin){
            String enteredGmail = txtGmailEnter.getText();
            String enteredPassword = txtPasswordEnter.getText();

            AdminService adminService = ServiceFactory.getInstance().getServiceType(ServiceType.admin);
            boolean isAdminFound = adminService.loginAdmin(enteredGmail, enteredPassword);

            if(isAdminFound){
                System.out.println("Admin logged in successfully");
            }else{
                lblPswIncorrect.setText("Your password or email is incorrect");
                lblPswIncorrect.setVisible(true);
            }
        }
    }
}
