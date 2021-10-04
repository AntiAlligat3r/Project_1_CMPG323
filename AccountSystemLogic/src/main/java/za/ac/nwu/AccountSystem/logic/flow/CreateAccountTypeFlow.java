package za.ac.nwu.AccountSystem.logic.flow;

import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;

public interface CreateAccountTypeFlow {

    AccountTypeDto create(AccountTypeDto accountType);
}
