package za.ac.nwu.AccountSystem.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.AccountSystem.domain.dto.AccountTransactionDto;
import za.ac.nwu.AccountSystem.domain.dto.AccountTypeDto;
import za.ac.nwu.AccountSystem.domain.service.GeneralResponse;
import za.ac.nwu.AccountSystem.logic.flow.inter.transaction.CreateAccountTransactionFlow;
import za.ac.nwu.AccountSystem.logic.flow.inter.transaction.FetchAccountTransactionFlow;


import java.util.List;


@RestController
@RequestMapping("account-transaction")
public class AccountTransactionController {
    private final FetchAccountTransactionFlow fetchAccountTransactionFlow;
    private final CreateAccountTransactionFlow createAccountTransactionFlow;

    @Autowired
    public AccountTransactionController(@Qualifier(value = "fetchAccountTransactionFlowAmount") FetchAccountTransactionFlow fetchAccountTransactionFlow, @Qualifier(value ="createAccountTransactionFlowAmount") CreateAccountTransactionFlow createAccountTransactionFlow)
    {
        this.fetchAccountTransactionFlow = fetchAccountTransactionFlow;
        this.createAccountTransactionFlow = createAccountTransactionFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured account types",notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Account types returned",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 404,message = "Not Found",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<List<AccountTransactionDto>>> getAll()
    {
        List<AccountTransactionDto> accountTransactions = fetchAccountTransactionFlow.getAllAccountTransactions();
        GeneralResponse<List<AccountTransactionDto>> response = new GeneralResponse<>(true,accountTransactions);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    @ApiOperation(value = "Create a new AccountType",notes = "Create a new AccountType in the DB")
    @ApiResponses(value = {
            @ApiResponse(code = 201,message = "AccountType was created successfully",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<AccountTransactionDto>> createTransaction(@ApiParam(value = "Request body to create",required = true) @RequestBody AccountTransactionDto accountTransaction)
    {
        AccountTransactionDto accountTransactionResponse = createAccountTransactionFlow.createTransaction(accountTransaction);
        GeneralResponse<AccountTransactionDto> response = new GeneralResponse<>(true,accountTransactionResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
