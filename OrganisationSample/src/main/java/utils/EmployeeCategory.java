package utils;

import lombok.Data;

@Data
public class EmployeeCategory {
    private EmployeeType employeeType;
    private DepartmentName departmentType;

    public EmployeeCategory(EmployeeType employeeType, DepartmentName departmentType) {
        this.departmentType = departmentType;
        this.employeeType = employeeType;
    }
}
