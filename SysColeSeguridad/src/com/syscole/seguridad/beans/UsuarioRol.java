package com.syscole.seguridad.beans;

import java.io.Serializable;


public class UsuarioRol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsurioRol;
	private Integer idUsuario; 
	private Integer idRol;
	private Boolean estado;
	public Integer getIdUsurioRol() {
		return idUsurioRol;
	}
	public void setIdUsurioRol(Integer idUsurioRol) {
		this.idUsurioRol = idUsurioRol;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "UsuarioRol [idUsurioRol=" + idUsurioRol + ", idUsuario="
				+ idUsuario + ", idRol=" + idRol + ", estado=" + estado + "]";
	}
}
