package com.cl.duoc.nmamaintainer.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "formulario", schema = "nma")
public class FormularioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folio")
    private Integer folio;

    @Column(name = "ap_paterno", nullable = false)
    private String apellidoPaterno;

    @Column(name = "ap_materno", nullable = false)
    private String apellidoMaterno;

    @Column(name = "nombres_trabajador", nullable = false)
    private String nombresTrabajador;

    @Column(name = "profesion")
    private String profesion;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @Column(name = "anno_antiguedad")
    private Integer annoAntiguedad;

    @Column(name = "fecha_episodio", nullable = false)
    private Date fechaEpisodio;

    @Column(name = "hora_episodio", nullable = false)
    private Date horaEpisodio;

    @Column(name = "region")
    private String region;

    @Column(name = "ubicacion_o_faena", nullable = false)
    private String ubicacionOFaena;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "ubicacion_exacta", nullable = false)
    private String ubicacionExacta;

    @Column(name = "nombre_jefatura", nullable = false)
    private String nombreJefatura;

    @Column(name = "activdad_realizada", nullable = false)
    private String actividadRealizada;

    @Column(name = "lugar_especifico_episodio", nullable = false)
    private String lugarEspecificoEpisodio;

    @Column(name = "tipo_episodio", nullable = false)
    private String tipoEpisodio;

    @Column(name = "accion_insegura", nullable = false)
    private String accionInsegura;

    @Column(name = "condicion_insegura", nullable = false)
    private String condicionInsegura;

    @Column(name = "causas", nullable = false)
    private String causas;

    @Column(name = "testigos")
    private String testigos;

    @Column(name = "cargo_testigo")
    private String cargoTestigo;

    @Column(name = "elaborador_informe", nullable = false)
    private String elaboradorInforme;

    @Column(name = "cargo_elaborador_informe", nullable = false)
    private String cargoElaboradorInforme;

    @Column(name = "telefono_elaborador_informe", nullable = false)
    private String telefonoElaboradorInforme;

    @Column(name = "nombre_revisador", nullable = false)
    private String nombreRevisador;

    @Column(name = "cargo_revisador", nullable = false)
    private String cargoRevisador;

    @Column(name = "fecha_revision", nullable = false)
    private Date fechaRevision;

    @Column(name = "id_cliente", nullable = false)
    private String idCliente;

    @Column(name = "rut_trabajador", nullable = false)
    private String rutTrabajador;

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombresTrabajador() {
        return nombresTrabajador;
    }

    public void setNombresTrabajador(String nombresTrabajador) {
        this.nombresTrabajador = nombresTrabajador;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getAnnoAntiguedad() {
        return annoAntiguedad;
    }

    public void setAnnoAntiguedad(Integer annoAntiguedad) {
        this.annoAntiguedad = annoAntiguedad;
    }

    public Date getFechaEpisodio() {
        return fechaEpisodio;
    }

    public void setFechaEpisodio(Date fechaEpisodio) {
        this.fechaEpisodio = fechaEpisodio;
    }

    public Date getHoraEpisodio() {
        return horaEpisodio;
    }

    public void setHoraEpisodio(Date horaEpisodio) {
        this.horaEpisodio = horaEpisodio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUbicacionOFaena() {
        return ubicacionOFaena;
    }

    public void setUbicacionOFaena(String ubicacionOFaena) {
        this.ubicacionOFaena = ubicacionOFaena;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUbicacionExacta() {
        return ubicacionExacta;
    }

    public void setUbicacionExacta(String ubicacionExacta) {
        this.ubicacionExacta = ubicacionExacta;
    }

    public String getNombreJefatura() {
        return nombreJefatura;
    }

    public void setNombreJefatura(String nombreJefatura) {
        this.nombreJefatura = nombreJefatura;
    }

    public String getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(String actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
    }

    public String getLugarEspecificoEpisodio() {
        return lugarEspecificoEpisodio;
    }

    public void setLugarEspecificoEpisodio(String lugarEspecificoEpisodio) {
        this.lugarEspecificoEpisodio = lugarEspecificoEpisodio;
    }

    public String getTipoEpisodio() {
        return tipoEpisodio;
    }

    public void setTipoEpisodio(String tipoEpisodio) {
        this.tipoEpisodio = tipoEpisodio;
    }

    public String getAccionInsegura() {
        return accionInsegura;
    }

    public void setAccionInsegura(String accionInsegura) {
        this.accionInsegura = accionInsegura;
    }

    public String getCondicionInsegura() {
        return condicionInsegura;
    }

    public void setCondicionInsegura(String condicionInsegura) {
        this.condicionInsegura = condicionInsegura;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getTestigos() {
        return testigos;
    }

    public void setTestigos(String testigos) {
        this.testigos = testigos;
    }

    public String getCargoTestigo() {
        return cargoTestigo;
    }

    public void setCargoTestigo(String cargoTestigo) {
        this.cargoTestigo = cargoTestigo;
    }

    public String getElaboradorInforme() {
        return elaboradorInforme;
    }

    public void setElaboradorInforme(String elaboradorInforme) {
        this.elaboradorInforme = elaboradorInforme;
    }

    public String getCargoElaboradorInforme() {
        return cargoElaboradorInforme;
    }

    public void setCargoElaboradorInforme(String cargoElaboradorInforme) {
        this.cargoElaboradorInforme = cargoElaboradorInforme;
    }

    public String getTelefonoElaboradorInforme() {
        return telefonoElaboradorInforme;
    }

    public void setTelefonoElaboradorInforme(String telefonoElaboradorInforme) {
        this.telefonoElaboradorInforme = telefonoElaboradorInforme;
    }

    public String getNombreRevisador() {
        return nombreRevisador;
    }

    public void setNombreRevisador(String nombreRevisador) {
        this.nombreRevisador = nombreRevisador;
    }

    public String getCargoRevisador() {
        return cargoRevisador;
    }

    public void setCargoRevisador(String cargoRevisador) {
        this.cargoRevisador = cargoRevisador;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutTrabajador() {
        return rutTrabajador;
    }

    public void setRutTrabajador(String rutTrabajador) {
        this.rutTrabajador = rutTrabajador;
    }
}
