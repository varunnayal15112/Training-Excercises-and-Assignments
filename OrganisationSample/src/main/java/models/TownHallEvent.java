package models;

import lombok.Data;
import utils.DepartmentName;
import utils.EmployeeCategory;
import utils.EmployeeType;
import utils.EventPermission;

import java.util.HashMap;
import java.util.Map;

@Data
public class TownHallEvent {

    private static Map<EmployeeCategory, EventPermission> townHallEventPermission = new HashMap<EmployeeCategory,EventPermission>();

    public TownHallEvent() {
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.ADMIN, DepartmentName.CONSULTANCY)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.ADMIN, DepartmentName.ENGINEERING)),EventPermission.NO);
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.ADMIN, DepartmentName.MANAGEMENT)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.NONADMIN, DepartmentName.CONSULTANCY)),EventPermission.NO);
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.NONADMIN, DepartmentName.ENGINEERING)),EventPermission.YES);
        townHallEventPermission.put((new EmployeeCategory(EmployeeType.NONADMIN, DepartmentName.MANAGEMENT)),EventPermission.YES);
    }

    public Map<EmployeeCategory, EventPermission> getTownHallEventPermission() {
        return townHallEventPermission;
    }
}
