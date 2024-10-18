package dev.sandeep.Splitwise_JUL24.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayoutDTO {
    private Integer userId;
    private double paidAmount;
    private double owedAmount;
}
