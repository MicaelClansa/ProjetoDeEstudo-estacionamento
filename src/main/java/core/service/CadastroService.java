package core.service;


import adapter.dto.ClientDTO;
import adapter.interfaces.ClientAdapter;
import core.usecase.ClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastroService implements ClientUseCase {

    @Autowired
    ClientAdapter clientAdapter;


    @Override
    public void createClient(ClientDTO clientDTO) {
        clientAdapter.createClient(clientDTO);
    }
}
