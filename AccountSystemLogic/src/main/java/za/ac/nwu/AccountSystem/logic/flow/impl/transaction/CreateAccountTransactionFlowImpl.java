package za.ac.nwu.AccountSystem.logic.flow.impl.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;
import za.ac.nwu.AccountSystem.logic.flow.inter.transaction.CreateAccountTransactionFlow;
import za.ac.nwu.AccountSystem.translator.AccountTransactionTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTransactionFlowAmount")
public class CreateAccountTransactionFlowImpl implements CreateAccountTransactionFlow
{
    private final AccountTransactionTranslator accountTransactionTranslator;

    @Autowired
    public CreateAccountTransactionFlowImpl(AccountTransactionTranslator accountTransactionTranslator) {
        this.accountTransactionTranslator = accountTransactionTranslator;
    }

    @Override
    public AccountTransactionDto createTransaction(AccountTransactionDto accountTransaction)
    {
        if(null == accountTransaction.getTransactionDate())
        {
            accountTransaction.setTransactionDate(LocalDate.now());
        }
        return accountTransactionTranslator.createTransaction(accountTransaction);
    }


}
