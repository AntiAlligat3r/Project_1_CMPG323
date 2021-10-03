/*package za.ac.nwu.AccountSystem.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.AccountSystem.domain.service.GeneralResponse;
import za.ac.nwu.AccountSystem.domain.service.Pong;

@RestController
@RequestMapping("demo")

public class DemoController {
    @GetMapping("/ping")
    @ApiOperation(value = "Echo the ping",notes = "This echos the ping back to the client")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "The ping was recieved and echoed",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 404,message = "Not Found",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> ping(
            @RequestParam(value = "echo",defaultValue = "pong") String echo)
    {GeneralResponse<String> response = new GeneralResponse<>(true,echo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("")
    @ApiOperation(value = "Echo the ping",notes = "This echos the ping back to the client")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "The ping was recieved and echoed",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 404,message = "Not Found",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> getPing(
            @RequestParam(value = "echo",defaultValue = "pong") String echo)
    {GeneralResponse<String> response = new GeneralResponse<>(true,echo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/ping")
    @ApiOperation(value = "Echo the ping",notes = "This echos the ping back to the client")
    @ApiResponses(value = {
            @ApiResponse(code = 201,message = "The Pong was created successfully",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<String>> postPong(
            @ApiParam(value = "Request body to create a new Pong",required = true) @RequestBody Pong pong)
    {GeneralResponse<Pong> response = new GeneralResponse<>(true,pong);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/ping")
    @ApiOperation(value = "Update the pong")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "The pong was updated",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<String>> putPong(
            @RequestParam(value = "The number of days to add",defaultValue = "2") int daysToAdd,
            @ApiParam(value = "The Pong",required = true)
            @RequestBody Pong pong)
    {
        pong.setOnDate(pong.getOnDate().plusDays(daysToAdd));
        GeneralResponse<Pong> response = new GeneralResponse<>(true,pong);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @DeleteMapping("/ping")
    @ApiOperation(value = "Delete the pong")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "The Pong was deleted",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<String>> deletePong(
            @RequestParam(value = "The pong",required = true)
            @RequestBody Pong pong)
    {
        GeneralResponse<Pong> response = new GeneralResponse<>(true,pong);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/error")
    @ApiOperation(value = "Throws an exception")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "The Pong was deleted",response = GeneralResponse.class),
            @ApiResponse(code = 400,message = "Bad Request",response = GeneralResponse.class),
            @ApiResponse(code = 404,message = "Not Found",response = GeneralResponse.class),
            @ApiResponse(code = 500,message = "Internal Server Error",response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<String>> ping()
    {
        throw new RuntimeException("Give");
    }
}*/