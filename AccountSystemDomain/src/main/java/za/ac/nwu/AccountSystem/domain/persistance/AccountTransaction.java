package za.ac.nwu.AccountSystem.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name= "DEMO_ACCOUNT_TYPE",schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable{
    private static final long serialVersionUID = -142829431701917576L;

    private Long transactionId,memberId,amount;
    private AccountType accountType;
    private LocalDate transactionDate;

    public AccountTransaction()
    {}

    public AccountTransaction(Long transactionId,AccountType accountType, Long memberId,Long amount,LocalDate transactionDate)
    {
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ",sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name="TX_ID")

    public Long getTransactionId()
    {
        return transactionId;
    }
}
