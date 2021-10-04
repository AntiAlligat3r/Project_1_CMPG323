package za.ac.nwu.AccountSystem.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name= "ACCOUNT_TRANSACTION")
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

    @Column(name="ACCOUNT_TRANSACTION_ID")
    public Long getTransactionId()
    {
        return transactionId;
    }

    @Column(name = "MEMBER_ID")
    public Long getMemberId()
    {
        return memberId;
    }

    @Column(name = "AMOUNT")
    public Long getAmount()
    {
        return amount;
    }

    @Column(name = "TRANSACTION_DATE")
    public LocalDate getTransactionDate()
    {
        return transactionDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType()
    {
        return accountType;
    }

    public void setTransactionId(Long transactionId)
    {
        this.transactionId = transactionId;
    }

    public void setMemberId(Long memberId)
    {
        this.memberId = memberId;
    }

    public void setAmount(Long amount)
    {
        this.amount = amount;
    }


}
