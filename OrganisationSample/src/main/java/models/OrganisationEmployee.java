package models;

import lombok.Data;
import utils.DepartmentName;
import utils.EmployeeType;

@Data
public class OrganisationEmployee {

    private String empID, empName,empEmailID,empContactNo;
    private DepartmentName departmentType;
    private EmployeeType employeeType;
    private static int countOfEmployees = 0;

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void updateCountOfEmployees() {
        countOfEmployees += 1;
    }

}
