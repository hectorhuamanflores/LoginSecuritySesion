package com.bcp.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="registroHoras")
public class RegistroHoras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_hora;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone="America/Bogota")
	private Date fecha;
	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "horaInicial")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "KK:mm a", timezone="America/Bogota")
//	private Date horaInicial;
//   
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name = "horaFinal")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "KK:mm a", timezone="America/Bogota")
//	private Date horaFinal;
	
	@Column(name = "horaInicial", length = 50, nullable = false)
	private String horaInicial;
	
	@Column(name = "horaFinal", length = 50, nullable = false)
	private String horaFinal;
	
	@Column(name = "estado", length = 50, nullable = false)
	private String estado;

	public int getId_hora() {
		return id_hora;
	}

	public void setId_hora(int id_hora) {
		this.id_hora = id_hora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	
	
	
	
}
