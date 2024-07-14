package com.dailycodework.lakesidehotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Simpson Alfred
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    public void setEmail(String e)
    {
    	email=e;
    }
    public void setPassword(String p)
    {
    	password=p;
    }
    public String getEmail()
    {
    	return email;
  
    }
    public String getPassword()
    {
    	return password
;    }
    public LoginRequest()
    {
    	super();
    }
    public LoginRequest(String e,String p)
    {
    	email=e;
    	password=p;
    }
}
