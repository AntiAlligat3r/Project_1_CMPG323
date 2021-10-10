package za.ac.nwu.AccountSystem.logic.flow.inter.type;

import org.springframework.stereotype.Service;
import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;
import java.util.List;

@Service
public interface FetchAccountTypeFlow {

    List<AccountTypeDto> getAllAccountTypes();

   // AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
}
