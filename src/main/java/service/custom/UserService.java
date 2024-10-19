package service.custom;

import dto.User;
import service.SuperService;

public interface UserService extends SuperService {
    boolean addCashier(User user);
}
