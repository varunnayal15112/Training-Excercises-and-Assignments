package models;

import lombok.Data;
import utils.DepartmentNameUtility;
import utils.EmployeeCategory;
import utils.EmployeeTypeUtility;
import utils.EventPermission;

import java.util.HashMap;
import java.util.Map;

@Data
public class TownHallEvent {

    private static Map<EmployeeCategory, EventPermission> townHallEventPermission = new HashMap<EmployeeCategory,EventPermission>();

    public TownHallEvent() {
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.ADMIN, DepartmentNameUtility.CONSULTANCY)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.ADMIN, DepartmentNameUtility.ENGINEERING)),EventPermission.NO);
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.ADMIN, DepartmentNameUtility.MANAGEMENT)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.NONADMIN, DepartmentNameUtility.CONSULTANCY)),EventPermission.NO);
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.NONADMIN, DepartmentNameUtility.ENGINEERING)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeTypeUtility.NONADMIN, DepartmentNameUtility.MANAGEMENT)),EventPermission.YES);
    }

    public Map<EmployeeCategory, EventPermission> getTownHallEventPermission() {
        return townHallEventPermission;
    }
}
