/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;


import gym.Coach;

/**
 *
 * 
 */
public class Member {
    private String member_name;
    private String member_id;
    private String member_username;
    private String member_mobile;
    private String member_password;
    private String member_address;
    



    public Member(String member_username,String member_password) {
   
        this.member_username = member_username;
        this.member_password = member_password;
    }
    
    public Member( String member_name,String member_id, String member_username, String member_password, String member_mobile, String member_address) {
        this.member_name = member_name;
        this.member_id = member_id;
        this.member_username = member_username;
        this.member_password = member_password;
        this.member_mobile = member_mobile;
        this.member_address = member_address;

    }
    
   
    public String getmember_name() {
        return member_name;
    }

    public String getmember_id() {
        return member_id;
    }

    public String getmember_username() {
        return member_username;
    }
        
    public String getmember_mobile() {
        return member_mobile;
    }

    public String getmember_password() {
        return member_password;
    }
    
     public String getmember_address() {
        return member_address;
    }
    
    

   

}
