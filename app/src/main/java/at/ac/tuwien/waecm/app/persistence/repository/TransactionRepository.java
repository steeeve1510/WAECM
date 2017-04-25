package at.ac.tuwien.waecm.app.persistence.repository;


import org.springframework.data.repository.CrudRepository;

import at.ac.tuwien.waecm.app.persistence.dbo.Transaction;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction,Long>{
}