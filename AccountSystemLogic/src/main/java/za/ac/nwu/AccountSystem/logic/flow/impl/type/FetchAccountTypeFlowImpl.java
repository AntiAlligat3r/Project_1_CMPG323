package za.ac.nwu.AccountSystem.logic.flow.impl.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;
import za.ac.nwu.AccountSystem.logic.flow.inter.type.FetchAccountTypeFlow;
import za.ac.nwu.AccountSystem.translator.AccountTypeTranslator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component("fetchAccountTypeFlowName")
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow
{
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("Miles","miles", LocalDate.now()));
        return accountTypeDtos;
    }

    /*@Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic)
    {
        return accountTypeTranslator.getAccountTypeByMnemonicNativeQuery(mnemonic);
    }*/
}
