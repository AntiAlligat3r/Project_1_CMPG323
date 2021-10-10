package za.ac.nwu.AccountSystem.logic.flow.inter.type;

import org.springframework.stereotype.Service;
import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;

@Service
public interface CreateAccountTypeFlow {

    AccountTypeDto create(AccountTypeDto accountType);
}
