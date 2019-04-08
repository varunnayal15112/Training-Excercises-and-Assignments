package services;

import models.OrganisationEmployee;

public class FieldGeneration {

    public String employeeIDGeneration() {
        return "Emp" + Integer.toString((new OrganisationEmployee()).getCountOfEmployees());
    }
}
