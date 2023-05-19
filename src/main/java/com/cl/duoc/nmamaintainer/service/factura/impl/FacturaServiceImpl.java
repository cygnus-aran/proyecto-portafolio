package com.cl.duoc.nmamaintainer.service.factura.impl;


import com.cl.duoc.nmamaintainer.dto.factura.FacturaRequest;
import com.cl.duoc.nmamaintainer.dto.factura.FacturaResponse;
import com.cl.duoc.nmamaintainer.entity.FacturaEntity;
import com.cl.duoc.nmamaintainer.repository.FacturaRepository;
import com.cl.duoc.nmamaintainer.service.factura.FacturaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    @Override
    public FacturaResponse register(FacturaRequest facturaRequest) {
        FacturaResponse response = new FacturaResponse();
        FacturaEntity save = facturaRepository.save(facturaRequest.getFacturas().get(0));
        response.setOperation("Guardado");
        if (save == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        List<FacturaEntity> facturas = new ArrayList<>();
        response.setFacturas(facturas);
        response.getFacturas().add(save);
        return response;
    }

    @Override
    public FacturaResponse find(FacturaRequest facturaRequest) {
        FacturaResponse response = new FacturaResponse();
        Optional<FacturaEntity> find = facturaRepository.findById(facturaRequest.getFacturas().get(0).getIdFactura());
        response.setOperation("Encontrar");
        response.setStatus("Exito");
        response.getFacturas().add(find.get());
        return response;
    }

    @Override
    public FacturaResponse findAll() {
        FacturaResponse response = new FacturaResponse();
        List<FacturaEntity> findAll = facturaRepository.findAll();
        response.setOperation("Encontrar Todos");
        if (findAll == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.setFacturas(findAll);
        return response;
    }

    @Override
    public FacturaResponse update(FacturaRequest facturaRequest) {
        FacturaResponse response = new FacturaResponse();
        FacturaEntity update = facturaRepository.saveAndFlush(facturaRequest.getFacturas().get(0));
        response.setOperation("Actualizar");
        if (update == null) {
            response.setStatus("Error");
            return response;
        }
        response.setStatus("Exito");
        response.getFacturas().add(update);
        return response;
    }

    @Override
    public FacturaResponse delete(FacturaRequest facturaRequest) {
        FacturaResponse response = new FacturaResponse();
        response.setOperation("Borrar");
        try {
            facturaRepository.deleteById(facturaRequest.getFacturas().get(0).getIdFactura());
        } catch (Exception e) {
            response.setStatus("Error");
            throw new RuntimeException(e);
        }
        response.setStatus("Exito");
        return response;
    }
}
