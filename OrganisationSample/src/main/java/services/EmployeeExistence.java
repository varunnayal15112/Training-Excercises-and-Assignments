package services;

import lombok.Data;
import models.OrganisationDashBoard;

@Data
public class EmployeeExistence {

    public boolean isEmployeeExist( String empID) {
        return (new OrganisationDashBoard()).getEmpIdContainer().containsKey(empID);
    }
}
