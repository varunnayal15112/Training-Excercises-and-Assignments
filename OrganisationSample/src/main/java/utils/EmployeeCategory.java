package utils;

import lombok.Data;

@Data
public class EmployeeCategory {
    private EmployeeTypeUtility employeeType;
    private DepartmentNameUtility departmentType;

    public EmployeeCategory(EmployeeTypeUtility employeeType, DepartmentNameUtility departmentType) {
        this.departmentType = departmentType;
        this.employeeType = employeeType;
    }
}
