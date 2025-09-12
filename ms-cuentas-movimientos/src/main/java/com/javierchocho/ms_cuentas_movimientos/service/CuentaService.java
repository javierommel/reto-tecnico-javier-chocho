package com.javierchocho.ms_cuentas_movimientos.service;

import java.util.List;

import com.javierchocho.ms_cuentas_movimientos.dto.CuentaDto;

public interface CuentaService {
    
    void createCuenta(CuentaDto cuentaDto);

    List<CuentaDto> getAllCuentas();

    CuentaDto getCuentaByNumeroCuenta(Long numeroCuenta);

    boolean updateCuenta(Long numeroCuenta, CuentaDto cuentaDto);
    
}
