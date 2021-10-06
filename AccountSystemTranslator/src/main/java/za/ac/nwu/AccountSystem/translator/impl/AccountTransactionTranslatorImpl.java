package za.ac.nwu.AccountSystem.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;
import za.ac.nwu.AccountSystem.domain.persistance.AccountTransaction;
import za.ac.nwu.AccountSystem.repo.persistence.AccountTransactionRepository;
import za.ac.nwu.AccountSystem.translator.AccountTransactionTranslator;

//@Component("accountTransactionRepository")
public class AccountTransactionTranslatorImpl implements AccountTransactionTranslator {

    private final AccountTransactionRepository accountTransactionRepository;

    @Autowired
    public AccountTransactionTranslatorImpl(AccountTransactionRepository accountTransactionRepository) {
        this.accountTransactionRepository = accountTransactionRepository;
    }

    @Override
    public AccountTransactionDto createTransaction(AccountTransactionDto accountTransactionDto) {
        try
        {
            AccountTransaction accountTransaction = accountTransactionRepository.save(accountTransactionDto.getAmount().toString());
            return new AccountTransactionDto(accountTransaction);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Unable to save to the DB",e);
        }
    }
}
