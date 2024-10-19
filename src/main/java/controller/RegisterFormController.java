package controller;

import com.jfoenix.controls.JFXButton;
import dto.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import service.ServiceFactory;
import service.SuperService;
import service.custom.AdminService;
import util.ServiceType;

public class RegisterFormController {

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtCompanyName;

    @FXML
    private TextField txtFullName;

    @FXML
    private TextField txtGmailAddress;

    @FXML
    private TextField txtPassword;

    @FXML
    void btnSignUpOnAction(ActionEvent event) {
        AdminService adminService = ServiceFactory.getInstance().getServiceType(ServiceType.admin);
        Admin admin = new Admin(
                txtFullName.getText(),
                txtGmailAddress.getText(),
                txtPassword.getText(),
                Integer.parseInt(txtAge.getText()),
                txtCompanyName.getText()
        );
//        if (adminService.addAdmin(admin)){
//            new Alert(Alert.AlertType.INFORMATION,"Admin Added!").show();
//        }else {
//            new Alert(Alert.AlertType.ERROR,"Admin Not Added!").show();
//        }
    }
}
