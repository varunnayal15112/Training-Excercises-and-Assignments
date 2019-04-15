package services;

import models.TownHallEvent;
import utils.DepartmentName;
import utils.EmployeeCategory;
import utils.EmployeeType;
import utils.EventPermission;

public class EventPermissionChecker {
    public EventPermission checkEventPermission(EmployeeType employeeType, DepartmentName departmentName) {
        return (new TownHallEvent()).getTownHallEventPermission().get(new EmployeeCategory(employeeType,departmentName));
    }
}
