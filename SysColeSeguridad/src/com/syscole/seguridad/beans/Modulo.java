package com.syscole.seguridad.beans;

import java.io.Serializable;

public class Modulo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idModulo;
	private String modulo;
	private String estado;
	private String url;

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Modulo [idModulo=" + idModulo + ", modulo=" + modulo
				+ ", estado=" + estado + ", url=" + url + "]";
	}
}
