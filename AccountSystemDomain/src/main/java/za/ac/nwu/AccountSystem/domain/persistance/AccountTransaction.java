package za.ac.nwu.AccountSystem.domain.persistance;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name= "ACCOUNT_TRANSACTION",schema = "DONOVAN")
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

    public AccountTransaction( AccountType accountType,Long amount, LocalDate transactionDate) {
        this.accountType = accountType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    @Id
    @SequenceGenerator(name = "ACCOUNT_TRANSACTION_SEQ",sequenceName = "DONOVAN.ACCOUNT_TRANSACTION_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ACCOUNT_TRANSACTION_SEQ")

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
    //@JoinColumn(name = "ACCOUNT_TYPE_ID")
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

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(memberId, that.memberId) && Objects.equals(amount, that.amount) && Objects.equals(accountType, that.accountType) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, memberId, amount, accountType, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", accountType=" + accountType +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
