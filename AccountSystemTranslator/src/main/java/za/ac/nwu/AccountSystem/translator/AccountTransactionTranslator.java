package za.ac.nwu.AccountSystem.translator;

import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;

public interface AccountTransactionTranslator {
    AccountTransactionDto createTransaction(AccountTransactionDto accountTransaction);
}
