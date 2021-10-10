package za.ac.nwu.AccountSystem.logic.flow.inter.transaction;

import org.springframework.stereotype.Service;
import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;

import java.util.List;

@Service
public interface FetchAccountTransactionFlow {
    List<AccountTransactionDto> getAllAccountTransactions();
}
