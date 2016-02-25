package com.syscole.seguridad.beans;

import java.io.Serializable;

public class ModuloUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idModuloUsuario;
	private Integer idUsuarioRol;
	private Integer idModulo;

	public Integer getIdModuloUsuario() {
		return idModuloUsuario;
	}

	public void setIdModuloUsuario(Integer idModuloUsuario) {
		this.idModuloUsuario = idModuloUsuario;
	}

	public Integer getIdUsuarioRol() {
		return idUsuarioRol;
	}

	public void setIdUsuarioRol(Integer idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	@Override
	public String toString() {
		return "ModuloUsuario [idModuloUsuario=" + idModuloUsuario
				+ ", idUsuarioRol=" + idUsuarioRol + ", idModulo=" + idModulo
				+ "]";
	}
}
