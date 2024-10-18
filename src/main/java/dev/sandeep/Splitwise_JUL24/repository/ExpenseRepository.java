package dev.sandeep.Splitwise_JUL24.repository;

import dev.sandeep.Splitwise_JUL24.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
