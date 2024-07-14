package adapter.interfaces;

import adapter.dto.ClientDTO;
import org.springframework.stereotype.Service;

@Service
public interface ClientAdapter {
    void createClient(ClientDTO clientDTO);
}
