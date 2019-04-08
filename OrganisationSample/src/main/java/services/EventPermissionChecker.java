package services;

import models.TownHallEvent;
import utils.DepartmentNameUtility;
import utils.EmployeeCategory;
import utils.EmployeeTypeUtility;
import utils.EventPermission;

public class EventPermissionChecker {
    public EventPermission checkEventPermission(EmployeeTypeUtility employeeType, DepartmentNameUtility departmentName) {
        return (new TownHallEvent()).getTownHallEventPermission().get(new EmployeeCategory(employeeType,departmentName));
    }
}
