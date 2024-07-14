package controllers;

import adapter.dto.ClientDTO;
import adapter.interfaces.ClientAdapter;
import core.usecase.ClientUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controllers {

    private final ClientUseCase clientUseCase;

    public Controllers(ClientUseCase clientUseCase) {
        this.clientUseCase = clientUseCase;
    }

    @PostMapping("/create-client")
    public String createClient(@RequestBody ClientDTO clientDTO) {
        clientUseCase.createClient(clientDTO);
        return "Cliente Criado";
    }
}
