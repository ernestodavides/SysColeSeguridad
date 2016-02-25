package com.syscole.seguridad.beans;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private Byte pass;
	private String user;
	private Boolean estado;
	private Date  fecha;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Byte getPass() {
		return pass;
	}
	public void setPass(Byte pass) {
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "UsuarioRol [idUsuario=" + idUsuario + ", pass=" + pass
				+ ", user=" + user + ", estado=" + estado + ", fecha=" + fecha
				+ "]";
	}
	
}
