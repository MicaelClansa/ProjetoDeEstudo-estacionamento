package core.usecase;

import adapter.dto.ClientDTO;

public interface ClientUseCase {
    void createClient(ClientDTO clientDTO);
}
