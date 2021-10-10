package za.ac.nwu.AccountSystem.logic.flow.inter.transaction;

import org.springframework.stereotype.Service;
import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;

@Service
public interface CreateAccountTransactionFlow {
    AccountTransactionDto createTransaction(AccountTransactionDto accountTransaction);
}
