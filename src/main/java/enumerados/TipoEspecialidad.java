package enumerados;

import java.util.List;
import java.util.Arrays;

public enum TipoEspecialidad {
    INSTALACION_Y_CONFIGURACION(Arrays.asList(TipoProblema.ERRORES_DURANTE_LA_INSTALACION, TipoProblema.CONFIGURACION_INCORRECTA, TipoProblema.CONFLICTOS_DE_SOFTWARE)),
    ACTUALIZACIONES_Y_PARCHES(Arrays.asList(TipoProblema.PROBLEMAS_DE_COMPATIBILIDAD, TipoProblema.FALLO_EN_LA_APLICACION_DE_PARCHES, TipoProblema.ERRORES_POST_ACTUALIZACION)),
    SOPORTE_TECNICO_REMOTO(Arrays.asList(TipoProblema.ERRORES_DE_SOFTWARE_REMOTOS, TipoProblema.PROBLEMAS_DE_CONECTIVIDAD, TipoProblema.ASISTENCIA_EN_LA_RESOLUCION_DE_PROBLEMAS)),
    MANTENIMIENTO_PREVENTIVO(Arrays.asList(TipoProblema.RENDIMIENTO_LENTO, TipoProblema.ERRORES_FRECUENTES, TipoProblema.OPTIMIZACION_DEL_SISTEMA)),
    RESOLUCION_DE_PROBLEMAS(Arrays.asList(TipoProblema.ERRORES_DE_APLICACION, TipoProblema.PROBLEMAS_DE_HARDWARE, TipoProblema.PROBLEMAS_DE_RED)),
    BACKUP_Y_RECUPERACION_DE_DATOS(Arrays.asList(TipoProblema.PERDIDA_DE_DATOS, TipoProblema.PROBLEMAS_DE_RESPALDO, TipoProblema.RECUPERACION_DE_DATOS_DESPUES_DE_FALLAS)),
    CAPACITACION_USUARIOS(Arrays.asList(TipoProblema.PROBLEMAS_DE_USO_DEL_SOFTWARE, TipoProblema.DIFICULTADES_EN_LA_ADOPCION_DE_NUEVAS_TECNOLOGIAS, TipoProblema.ERRORES_FRECUENTES_DE_LOS_USUARIOS)),
    SEGURIDAD_INFORMATICA(Arrays.asList(TipoProblema.VIRUS_Y_MALWARE, TipoProblema.VIOLACIONES_DE_SEGURIDAD, TipoProblema.CONFIGURACION_DE_CORTAFUEGOS_Y_ANTIVIRUS)),
    MONITOREO_CONTINUO(Arrays.asList(TipoProblema.PROBLEMAS_DE_RENDIMIENTO_NO_DETECTADOS, TipoProblema.SUPERVISION_DE_RECURSOS_DEL_SISTEMA, TipoProblema.ALERTAS_DE_RENDIMIENTO)),
    INTEGRACION_DE_SISTEMAS(Arrays.asList(TipoProblema.PROBLEMAS_DE_INTEROPERABILIDAD, TipoProblema.ERRORES_EN_LA_INTEGRACION, TipoProblema.PROBLEMAS_DE_TRANSFERENCIA_DE_DATOS)),
    CONSULTORIA_TECNICA(Arrays.asList(TipoProblema.NECESIDAD_DE_ASESORAMIENTO_TECNICO, TipoProblema.OPTIMIZACION_DE_PROCESOS, TipoProblema.EVALUACION_DE_TECNOLOGIAS_EMERGENTES)),
    GESTION_DE_LICENCIAS(Arrays.asList(TipoProblema.PROBLEMAS_DE_CUMPLIMIENTO_LEGAL, TipoProblema.GESTION_DE_LICENCIAS_VENCIDAS, TipoProblema.AUDITORIA_DE_SOFTWARE));

    private List<TipoProblema> problemasAsociados;

    private TipoEspecialidad(List<TipoProblema> tipoProblemas) {
        problemasAsociados = tipoProblemas;
    }

    public List<TipoProblema> getProblemasAsociados() {
        return problemasAsociados;
    }

    public boolean contains(TipoProblema problema) {
        return problemasAsociados.contains(problema);
    }


}
