package com.project.authenticationbff.presentation.controllers.v1;

import com.project.authenticationbff.application.interfaces.ICreatePasswordUseCase;
import com.project.authenticationbff.application.requests.CreatePasswordRequest;
import com.project.authenticationbff.application.responses.CreatePasswordResponse;
import com.project.authenticationbff.application.useCases.CreatePasswordUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/password")
public class PasswordController {

    private final ICreatePasswordUseCase createPasswordUseCase;

    public PasswordController(ICreatePasswordUseCase createPasswordUseCase) {
        this.createPasswordUseCase = createPasswordUseCase;
    }

    @PostMapping
    @Operation(summary = "Post Password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created successfully", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CreatePasswordResponse.class)) }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CreatePasswordResponse.class)) }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CreatePasswordResponse.class)) })
    })
    public ResponseEntity<?> post(@RequestBody CreatePasswordRequest request){

        try {
            Boolean successfullyExecuted = createPasswordUseCase.execute(request.getPassword());

            if (successfullyExecuted == true){
                return new ResponseEntity<CreatePasswordResponse>(
                        new CreatePasswordResponse(true, "Created successfully" ), HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<CreatePasswordResponse>(
                        new CreatePasswordResponse(false, "Unprocessable Entity" ), HttpStatus.UNPROCESSABLE_ENTITY);
            }
        } catch(Exception ex){
            return new ResponseEntity<CreatePasswordResponse>(
                    new CreatePasswordResponse(false, "Internal Server Error" ), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
