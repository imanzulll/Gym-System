package gym;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class Package {
    private String package_id;
    private String package_name;
    private int package_amount;
    private int package_total;
    private String package_info;
    private String package_type;

    public Package( String package_type) {
        this.package_type = package_type;
    }

    public Package() {
        this.package_type = package_type;
        
    }
    
    public void setpackge_id(String package_id) {
        this.package_id = package_id;
    }

    public String getpackage_id() {
        return package_id;
    }

    public void setpackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getpackage_name() {
        return package_name;
    }
    
    public void setpackage_amount(int package_amount) {
        this.package_amount = package_amount;
    }

    public int getpackage_amount() {
        return package_amount;
    }
    
    public void setpackage_total(int package_total) {
        this.package_total = package_total;
    }

    public int getpackage_total() {
        return package_total;
    }
    
    public void setpackage_info(String package_info) {
        this.package_info = package_info;
    }

    public String getpackage_info() {
        return package_info;
    }
    
    public void setpackage_type(String package_type) {
        this.package_type = package_type;
    }

    public String getpackage_type() {
        return package_type;
    }
}
