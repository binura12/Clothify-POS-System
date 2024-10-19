package controller;

import com.jfoenix.controls.JFXButton;
import dto.Admin;
import dto.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import service.ServiceFactory;
import service.custom.AdminService;
import service.custom.UserService;
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
        if (DashFormController.isAdmin){
            AdminService adminService = ServiceFactory.getInstance().getServiceType(ServiceType.admin);
            Admin admin = new Admin(
                    txtFullName.getText(),
                    txtGmailAddress.getText(),
                    txtPassword.getText(),
                    Integer.parseInt(txtAge.getText()),
                    txtCompanyName.getText()
            );
            if (adminService.addAdmin(admin)){
                new Alert(Alert.AlertType.INFORMATION,"Admin Added!").show();
            }else {
                new Alert(Alert.AlertType.ERROR,"Admin Not Added!").show();
            }
        }
        if (DashFormController.isUser){
            UserService userService = ServiceFactory.getInstance().getServiceType(ServiceType.cashier);
            User user = new User(
                    txtFullName.getText(),
                    txtGmailAddress.getText(),
                    txtPassword.getText(),
                    Integer.parseInt(txtAge.getText()),
                    txtCompanyName.getText()
            );
            if (userService.addCashier(user)){
                new Alert(Alert.AlertType.INFORMATION,"Cashier Added!").show();
            }else {
                new Alert(Alert.AlertType.ERROR,"Cashier Not Added!").show();
            }
        }
    }
}
