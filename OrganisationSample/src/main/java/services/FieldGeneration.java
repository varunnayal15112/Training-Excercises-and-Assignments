package services;

import models.OrganisationEmployee;

public class FieldGeneration {
    private static FieldGeneration ourInstance = new FieldGeneration();

    public static FieldGeneration getInstance() {
        return ourInstance;
    }

    public String employeeIDGeneration() {
        return "Emp" + Integer.toString((new OrganisationEmployee()).getCountOfEmployees());
    }
}
