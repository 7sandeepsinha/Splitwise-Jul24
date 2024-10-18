package dev.sandeep.Splitwise_JUL24.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "CUSTOMER")
public class User extends BaseModel{
    private String username;
    private String password;
    private String email;
    @ManyToMany
    private List<Group> groups;
    @ManyToMany
    private List<Transaction> transactions;
    @ManyToMany
    private List<Expense> expenses;
}
