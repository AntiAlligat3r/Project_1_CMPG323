package za.ac.nwu.AccountSystem.domain.dto;

import za.ac.nwu.AccountSystem.domain.persistance.AccountType;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountTypeDto implements Serializable
{
    private static final Long serialVersionUID = -53468532868289868L;

    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto(AccountType accountType) {
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
