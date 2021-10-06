package za.ac.nwu.AccountSystem.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.AccountSystem.domain.persistance.AccountTransaction;

@Repository("accountTransactionRepository")
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction,Long>{
}
