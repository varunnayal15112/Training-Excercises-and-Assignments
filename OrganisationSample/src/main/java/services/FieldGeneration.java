package services;

import models.OrganisationEmployee;

public class FieldGeneration {
    private static FieldGeneration ourInstance = null;

    private FieldGeneration() {}

    public static FieldGeneration getInstance() {
        if(ourInstance == null) {
            ourInstance = new FieldGeneration();
        }
        return ourInstance;
    }

    public String employeeIDGeneration() {
        return "Emp" + Integer.toString((new OrganisationEmployee()).getCountOfEmployees());
    }
}
