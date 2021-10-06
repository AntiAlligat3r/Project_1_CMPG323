package za.ac.nwu.AccountSystem.logic.flow.inter.type;

import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;

public interface CreateAccountTypeFlow {

    AccountTypeDto create(AccountTypeDto accountType);
}
