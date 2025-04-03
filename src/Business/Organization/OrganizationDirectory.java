/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Irene, Yushan
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.HII.getValue())){
            organization = new HIIOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Hospital.getValue())) {
            organization = new HospitalOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RegionalGovernment.getValue())){
            organization = new RegionalGovOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.CitizenManager.getValue())) {
            organization = new CitizenManagerOrganization();
            organizationList.add(organization);
        }
       
        return organization;
    }
}
