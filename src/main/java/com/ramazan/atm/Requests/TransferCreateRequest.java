package com.ramazan.atm.Requests;
import lombok.Data;

@Data
public class TransferCreateRequest {

    Long id;
    Long senderId;
    Long receiverId;
    Long amount;
}