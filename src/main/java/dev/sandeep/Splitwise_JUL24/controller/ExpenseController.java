package dev.sandeep.Splitwise_JUL24.controller;

import dev.sandeep.Splitwise_JUL24.dto.ExpenseCreationReqDTO;
import dev.sandeep.Splitwise_JUL24.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/expense")
    public ResponseEntity addExpense(@RequestBody ExpenseCreationReqDTO expenseCreationReqDTO) {
        return ResponseEntity.ok(expenseService.createExpense(expenseCreationReqDTO));
    }
}
