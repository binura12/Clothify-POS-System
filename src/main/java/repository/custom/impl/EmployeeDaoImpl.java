package repository.custom.impl;

import dto.Employee;
import repository.custom.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public boolean save(Employee employee) {
        return false;
    }
}
