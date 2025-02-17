package com.example.mspedido.service.impl;


import com.example.mspedido.entity.PedidoDetalle;
import com.example.mspedido.feign.CatalogoFeign;
import com.example.mspedido.repository.PedidoDetalleRepository;

import com.example.mspedido.service.PedidoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoDetalleServiceImpl implements PedidoDetalleService {


    @Autowired
    private PedidoDetalleRepository pedidoDetalleRepository;


    @Override
    public List<PedidoDetalle> lista() {
        return pedidoDetalleRepository.findAll();
    }

    @Override
    public PedidoDetalle guardar(PedidoDetalle pedidoDetalle) {
        return pedidoDetalleRepository.save(pedidoDetalle);
    }

    @Override
    public Optional<PedidoDetalle> buscarPorId(Integer id) {
        return pedidoDetalleRepository.findById(id);
    }

    @Override
    public PedidoDetalle actualizar(PedidoDetalle pedidoDetalle) {
        return pedidoDetalleRepository.save(pedidoDetalle);
    }

    @Override
    public void eleminar(Integer id) {
        pedidoDetalleRepository.deleteById(id);

    }
}
