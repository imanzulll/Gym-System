/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**

 */
public class Coach {
    private String coach_id;
    private String coach_name;
    private int coach_mobile;
    private String coach_username;
    private String coach_password;
    private String coach_address;
    
    public Coach(String ch_un, String ch_pw) {
       
        this.coach_username = ch_un;
        this.coach_password = ch_pw;
    }
    public Coach( String ch_username) {
        this.coach_username = ch_username;
    }

    public void setcoach_id(String coach_id) {
        this.coach_id = coach_id;
    }

    public String getcoach_id() {
        return coach_id;
    }

    public void setcoach_name(String coach_name) {
        this.coach_name = coach_name;
    }

    public String getcoach_name() {
        return coach_name;
    }
    
    public void setcoach_mobile(int coach_mobile) {
        this.coach_mobile = coach_mobile;
    }

    public int getcoach_mobile() {
        return coach_mobile;
    }
    
    public void setcoach_username(String coach_username) {
        this.coach_username = coach_username;
    }

    public String getcoach_username() {
        return coach_username;
    }
    
    public void setcoach_password(String coach_password) {
        this.coach_password = coach_password;
    }

    public String getcoach_password() {
        return coach_password;
    }
    
    public void setcoach_address(String coach_address) {
        this.coach_address = coach_address;
    }

    public String getcoach_address() {
        return coach_address;
    }
}
