package za.ac.nwu.AccountSystem.logic.flow.impl.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;
import za.ac.nwu.AccountSystem.logic.flow.inter.type.CreateAccountTypeFlow;
import za.ac.nwu.AccountSystem.translator.AccountTypeTranslator;

import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow
{
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType)
    {
        if(null== accountType.getCreationDate())
        {
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }
}
