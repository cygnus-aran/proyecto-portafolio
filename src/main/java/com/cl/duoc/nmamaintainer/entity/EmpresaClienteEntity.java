package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa_cliente")
public class EmpresaClienteEntity {

    @Id
    @Column(name = "id_empresa")
    private int idEmpresa;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Column(name = "fono_empresa")
    private String fonoEmpresa;
    @Column(name = "email_empresa")
    private String emailEmpresa;
    @Column(name = "responsable_empresa")
    private String responsableEmpresa;
    @Column(name = "estado_empresa")
    private String estadoEmpresa;
    @Column(name = "usuarios_id_usuario")
    private int usuariosIdUsuario;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getFonoEmpresa() {
        return fonoEmpresa;
    }

    public void setFonoEmpresa(String fonoEmpresa) {
        this.fonoEmpresa = fonoEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getResponsableEmpresa() {
        return responsableEmpresa;
    }

    public void setResponsableEmpresa(String responsableEmpresa) {
        this.responsableEmpresa = responsableEmpresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public int getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(int usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }
}
