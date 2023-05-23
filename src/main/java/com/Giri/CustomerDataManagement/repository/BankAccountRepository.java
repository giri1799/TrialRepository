package com.Giri.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Giri.CustomerDataManagement.entity.BanckAccount;

public interface BankAccountRepository extends JpaRepository<BanckAccount, Integer> {

}
