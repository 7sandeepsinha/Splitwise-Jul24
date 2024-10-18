package dev.sandeep.Splitwise_JUL24.service;

import dev.sandeep.Splitwise_JUL24.model.PayoutLedger;
import dev.sandeep.Splitwise_JUL24.repository.PayoutLedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayoutLedgerService {
    @Autowired
    private PayoutLedgerRepository payoutLedgerRepository;

    public PayoutLedger createPayoutLedger(PayoutLedger payoutLedger) {
        return payoutLedgerRepository.save(payoutLedger);
    }
}
