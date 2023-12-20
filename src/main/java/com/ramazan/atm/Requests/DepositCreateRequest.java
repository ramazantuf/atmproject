package com.ramazan.atm.Requests;
import lombok.Data;

@Data
public class DepositCreateRequest {

    Long id;
    Long userId;
    Long amount;
}