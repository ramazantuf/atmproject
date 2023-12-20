package com.ramazan.atm.Requests;
import lombok.Data;

@Data
public class UserCreateRequest {

    Long id;
    String userName;
    String password;
    Long adminId;
    Long money;

}