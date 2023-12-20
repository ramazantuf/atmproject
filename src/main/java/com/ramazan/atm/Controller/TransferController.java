package com.ramazan.atm.Controller;

import com.ramazan.atm.Entities.Transfer;
import com.ramazan.atm.Requests.TransferCreateRequest;
import com.ramazan.atm.Services.TransferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    private TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping
    public List<Transfer> getAllTransfers(){
        return transferService.getAllTransfers();
    }

    @PostMapping
    public Transfer createTransfer(@RequestBody TransferCreateRequest newTransferRequest){
        return transferService.saveOneTransfer(newTransferRequest);
    }

    @GetMapping("/{transferId}")
    public Transfer getOneTransfer(@PathVariable Long transferId){
        return transferService.getOneTransfer(transferId);
    }
}