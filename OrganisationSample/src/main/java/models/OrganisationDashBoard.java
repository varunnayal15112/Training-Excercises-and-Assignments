package models;

import lombok.Data;
import services.FieldGeneration;
import services.FieldValidation;
import utils.DepartmentNameUtility;
import utils.EmployeeStatus;
import utils.EmployeeTypeUtility;

import java.util.HashMap;
import java.util.Map;

@Data
public class OrganisationDashBoard {

    private OrganisationEmployee organisationEmployee = new OrganisationEmployee();
    private static Map<String, EmployeeStatus> empIDContainer= new HashMap<String, EmployeeStatus>();

    public boolean addNewEmployee(String empName, EmployeeTypeUtility empType, DepartmentNameUtility departmentType, String contactNo, String emailID) throws Exception{
        boolean status = (new FieldValidation()).emailIDValidation(emailID);
        if(status) {
            organisationEmployee.updateCountOfEmployees();
            String empID = (FieldGeneration.getInstance()).employeeIDGeneration();
            organisationEmployee.setEmpID(empID);
            organisationEmployee.setEmpName(empName);
            organisationEmployee.setDepartmentType(departmentType);
            organisationEmployee.setEmpContactNo(contactNo);
            organisationEmployee.setEmpEmailID(emailID);
            organisationEmployee.setEmployeeType(empType);
            empIDContainer.put(empID, EmployeeStatus.ACTIVE);
            return true;

        }
        else {
            throw new Exception("Invalid EmailID !!!");
        }
    }

    public Map<String, EmployeeStatus> getEmpIdContainer() {
        return empIDContainer;
    }

    public void printDetailsOfEmployee() {
        System.out.println("Employee ID : " + organisationEmployee.getEmpID() + "\n" +
                "Employee Name : " + organisationEmployee.getEmpName() + "\n" +
                "Employee Type : " + organisationEmployee.getEmployeeType() + "\n" +
                "Employee Department Name : " + organisationEmployee.getDepartmentType() + "\n" +
                "Employee Contact No : " + organisationEmployee.getEmpContactNo() + "\n" +
                "Employee EmailID : " + organisationEmployee.getEmpEmailID() + "\n");
    }
}
