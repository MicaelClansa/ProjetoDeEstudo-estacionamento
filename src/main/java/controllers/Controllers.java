package controllers;

import adapter.dto.ClientDTO;
import adapter.interfaces.ClientAdapter;
import core.usecase.ClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controllers {

    @Autowired
    ClientUseCase ClientUseCase;


    @PostMapping("/create-client")
    public String createClient(@RequestBody ClientDTO clientDTO) {

        ClientUseCase.createClient(clientDTO);

        return "Cliente Criado";
    }
}
