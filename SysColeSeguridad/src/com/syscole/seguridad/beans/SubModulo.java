package com.syscole.seguridad.beans;

import java.io.Serializable;

public class SubModulo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idSubModulo;
	private Integer idModulo;
	private String subModulo;
	private String estado;
	private String url;

	public Integer getIdSubModulo() {
		return idSubModulo;
	}

	public void setIdSubModulo(Integer idSubModulo) {
		this.idSubModulo = idSubModulo;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getSubModulo() {
		return subModulo;
	}

	public void setSubModulo(String subModulo) {
		this.subModulo = subModulo;
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
		return "SubModulo [idSubModulo=" + idSubModulo + ", idModulo="
				+ idModulo + ", subModulo=" + subModulo + ", estado=" + estado
				+ ", url=" + url + "]";
	}

	
}
