package za.ac.nwu.AccountSystem.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.AccountSystem.domain.persistance.AccountTransaction;
import za.ac.nwu.AccountSystem.domain.persistance.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@ApiModel(value = "AccountTransaction",description = "A DTO that represents the AccountTransaction")
public class AccountTransactionDto implements Serializable
{
    private static final Long serialVersionUID = -53468532868289868L;

    private AccountType accountType ;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransactionDto() {
    }

    public AccountTransactionDto(AccountType accountType, Long amount, LocalDate transactionDate) {
        this.accountType = accountType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransactionDto(AccountTransaction accountTransaction)
    {
        this.setAccountType(accountTransaction.getAccountType());
        this.setAmount(accountTransaction.getAmount());
        this.setTransactionDate(accountTransaction.getTransactionDate());
    }

    @JsonIgnore
    public AccountTransaction getAccountTransaction()
    {
        return new AccountTransaction(getAccountType(),getAmount(),getTransactionDate());
    }
    @ApiModelProperty
            (
                    position = 1,
                    value = "AccountTransaction AccountType",
                    name = "AccountTypeName",
                    notes = "Name of AccountType",
                    dataType = "java.lang.String",
                    example = "Miles",
                    required = true
            )
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @ApiModelProperty
            (
                    position = 2,
                    value = "AccountTransaction Amount",
                    name = "Amount",
                    notes = "Amount the transaction is worth",
                    dataType = "java.lang.String",
                    example = "Miles",
                    required = true
            )
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


    @ApiModelProperty
            (
                    position = 3,
                    value = "AccountTransactionDate",
                    name = "Amount",
                    notes = "Amount the transaction is worth",
                    dataType = "java.lang.String",
                    example = "Miles",
                    required = true
            )
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
