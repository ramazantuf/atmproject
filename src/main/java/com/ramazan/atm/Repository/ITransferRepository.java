package com.ramazan.atm.Repository;

import com.ramazan.atm.Entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransferRepository extends JpaRepository<Transfer, Long> {
}
