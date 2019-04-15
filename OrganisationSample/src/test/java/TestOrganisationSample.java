import models.OrganisationDashBoard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.EventPermissionChecker;
import services.FieldValidation;
import utils.DepartmentName;
import utils.EmployeeType;
import utils.EventPermission;

public class TestOrganisationSample {
    @Before
     public void init() throws Exception {
        /*
        OrganisationDashBoard object1 = new OrganisationDashBoard();
        OrganisationDashBoard object2 = new OrganisationDashBoard();
        OrganisationDashBoard object3 = new OrganisationDashBoard();

        object1.addNewEmployee("Varun Nayal", EmployeeTypeUtility.ADMIN, DepartmentNameUtility.ENGINEERING, "8007682909", "varun.nayal@hashmapinc.com");
        object2.addNewEmployee("Ved Pal", EmployeeTypeUtility.NONADMIN, DepartmentNameUtility.MANAGEMENT, "8007830506", "vedprakash.pal@hashmapinc.com");
        object3.addNewEmployee("Abhilash Reddy", EmployeeTypeUtility.NONADMIN, DepartmentNameUtility.CONSULTANCY, "8007817150", "abhilashreddyy1@gmail.com");

         */

        OrganisationDashBoard objectArray[] = new OrganisationDashBoard[3];
        objectArray[0] = new OrganisationDashBoard();
        objectArray[1] = new OrganisationDashBoard();
        objectArray[2] = new OrganisationDashBoard();
        objectArray[0].addNewEmployee("Varun Nayal", EmployeeType.ADMIN, DepartmentName.ENGINEERING, "8007682909", "varun.nayal@hashmapinc.com");
        objectArray[1].addNewEmployee("Ved Pal", EmployeeType.NONADMIN, DepartmentName.MANAGEMENT, "8007830506", "vedprakash.pal@hashmapinc.com");
        objectArray[2].addNewEmployee("Abhilash Reddy", EmployeeType.NONADMIN, DepartmentName.CONSULTANCY, "8007817150", "abhilashreddyy1@gmail.com");

        /*
        object1.printDetailsOfEmployee();
        object2.printDetailsOfEmployee();
        object3.printDetailsOfEmployee();
         */
    }


    @Test
    public void testFieldValidation1() {
        String emailIdToBeTested = "nayal.varun11@gmail.com";
        FieldValidation fieldValidation = new FieldValidation();
        boolean status = fieldValidation.emailIDValidation(emailIdToBeTested);
        Assert.assertEquals(true,status);
    }

    @Test
    public void testFieldValidation2() {
        String emailIdToBeTested = "nayal.varun11@gmail";
        FieldValidation fieldValidation = new FieldValidation();
        boolean status = fieldValidation.emailIDValidation(emailIdToBeTested);
        Assert.assertEquals(false,status);
    }

    @Test
    public void testEmployeeExistence1() {
        String empIdToBeCheckedForExistence = "Emp1";
        OrganisationDashBoard organisationDashBoard = new OrganisationDashBoard();
        boolean status = organisationDashBoard.isEmployeeExist(empIdToBeCheckedForExistence);
        Assert.assertEquals(true,status);

    }

    @Test
    public void testEventPermissionChecker1() {
        EventPermissionChecker eventPermissionChecker = new EventPermissionChecker();
        EventPermission eventPermission = eventPermissionChecker.checkEventPermission(EmployeeType.ADMIN,DepartmentName.CONSULTANCY);
        Assert.assertEquals(EventPermission.YES,eventPermission);
    }

    @Test
    public void testEventPermissionChecker2() {
        EventPermissionChecker eventPermissionChecker = new EventPermissionChecker();
        EventPermission eventPermission = eventPermissionChecker.checkEventPermission(EmployeeType.NONADMIN,DepartmentName.CONSULTANCY);
        Assert.assertEquals(EventPermission.NO,eventPermission);
    }

}
