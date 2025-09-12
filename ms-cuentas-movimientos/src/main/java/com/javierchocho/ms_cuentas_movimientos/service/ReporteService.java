package com.javierchocho.ms_cuentas_movimientos.service;

import java.time.LocalDate;
import java.util.List;

import com.javierchocho.ms_cuentas_movimientos.dto.ReporteMovimientoDto;

public interface ReporteService {

    public List<ReporteMovimientoDto> generarReporte(Long clienteId, LocalDate fechaInicio, LocalDate fechaFin);
}
