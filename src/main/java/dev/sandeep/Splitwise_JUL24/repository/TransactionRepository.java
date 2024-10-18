package dev.sandeep.Splitwise_JUL24.repository;

import dev.sandeep.Splitwise_JUL24.model.Expense;
import dev.sandeep.Splitwise_JUL24.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
