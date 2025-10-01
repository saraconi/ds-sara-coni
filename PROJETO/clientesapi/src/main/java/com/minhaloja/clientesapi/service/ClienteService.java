package com.minhaloja.clientesapi.service;

import com.minhaloja.clientesapi.model.Cliente;
import com.minhaloja.clientesapi.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente atualizarCliente(Long id, Cliente novoCliente) {
        return clienteRepository.findById(id).map(cliente -> {
            cliente.setNome(novoCliente.getNome());
            cliente.setEmail(novoCliente.getEmail());
            cliente.setTelefone(novoCliente.getTelefone());
            return clienteRepository.save(cliente);
        }).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
