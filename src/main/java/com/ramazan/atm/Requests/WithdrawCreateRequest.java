package com.ramazan.atm.Requests;
import lombok.Data;

@Data
public class WithdrawCreateRequest {

    Long id;
    Long userId;
    Long amount;


}