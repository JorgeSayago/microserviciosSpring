package ec.edu.ups.microserviciosSpring.services;

import ec.edu.ups.microserviciosSpring.model.Cliente;
import ec.edu.ups.microserviciosSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    // Guardar mis Clientes
    public Cliente create(Cliente cliente){
        return clienteRepository.save(cliente);
    }


    // Listar mis Clientes
    public List<Cliente> listClientes(){
        return clienteRepository.findAll();
    }
}
