package models;

import lombok.Data;
import utils.DepartmentNameUtility;
import utils.EmployeeTypeUtility;

@Data
public class OrganisationEmployee {

    private String empID, empName,empEmailID,empContactNo;
    private DepartmentNameUtility departmentType;
    private EmployeeTypeUtility employeeType;
    private static int countOfEmployees = 0;

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void updateCountOfEmployees() {
        countOfEmployees += 1;
    }

}
