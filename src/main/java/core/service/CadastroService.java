package core.service;


import adapter.dto.ClientDTO;
import adapter.interfaces.ClientAdapter;
import core.usecase.ClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;

@Autowired
ClientAdapter clientAdapter;

public class CadastroService implements ClientUseCase {

    @Override
    public void createClient(ClientDTO clientDTO) {
        clientAdapter.createClient(clientDTO);
    }
}
