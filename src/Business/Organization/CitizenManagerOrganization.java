/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CitizenManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Irene, Yushan
 */
public class CitizenManagerOrganization extends Organization {
    public CitizenManagerOrganization() {
        super(Organization.Type.CitizenManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CitizenManagerRole());
        return roles;
    }
}
