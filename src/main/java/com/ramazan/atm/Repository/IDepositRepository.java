package com.ramazan.atm.Repository;


import com.ramazan.atm.Entities.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepositRepository extends JpaRepository<Deposit, Long> {
}
