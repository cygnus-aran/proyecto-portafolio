package com.cl.duoc.nmamaintainer.dto.persona;

public class PersonaIn {

    private Integer idPersona;

    private String runPersona;

    private String nombrePersona;

    private String fechaAlta;

    private String fechaBaja;

    private String estadoPersona;

    private String puestoPersona;

    private String usuarioIdUsuario;

    private String rolIdRol;

    public PersonaIn() {
    }

    public PersonaIn(Integer idPersona, String runPersona, String nombrePersona, String fechaAlta, String fechaBaja, String estadoPersona, String puestoPersona, String usuarioIdUsuario, String rolIdRol) {
        this.idPersona = idPersona;
        this.runPersona = runPersona;
        this.nombrePersona = nombrePersona;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estadoPersona = estadoPersona;
        this.puestoPersona = puestoPersona;
        this.usuarioIdUsuario = usuarioIdUsuario;
        this.rolIdRol = rolIdRol;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getRunPersona() {
        return runPersona;
    }

    public void setRunPersona(String runPersona) {
        this.runPersona = runPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(String estadoPersona) {
        this.estadoPersona = estadoPersona;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
    }

    public String getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(String usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    public String getRolIdRol() {
        return rolIdRol;
    }

    public void setRolIdRol(String rolIdRol) {
        this.rolIdRol = rolIdRol;
    }
}
