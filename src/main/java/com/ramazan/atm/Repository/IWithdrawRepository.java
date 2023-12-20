package com.ramazan.atm.Repository;
import com.ramazan.atm.Entities.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWithdrawRepository extends JpaRepository<Withdraw, Long> {
}