package sv.gob.mh.sitepcommon.domain;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import sv.gob.mh.sitepcommon.domain.util.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAT_SEDE_LOG")
@SequenceGenerator(name = "SEQ_CAT_SEDE_LOG", sequenceName = "SEQ_CAT_SEDE_LOG", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_SEDE_LOG"})
@ToString(of = {"ID_SEDE_LOG"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_SEDE_LOG  implements BaseEntity<Double> {

   private static final long serialVersionUID =  419341194275798L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_SEDE_LOG")
   @Column(nullable = false, name = "ID_SEDE_LOG")
   @NonNull
   public Double id;
   
   
   @Column(name = "ID_SEDE", precision = 10, scale = 2, nullable = true)
   /** CORRELATIVO DE LA SEDE */
   public Double iD_SEDE;
   
   
   @Column(name = "ID_DEPARTAMENTO", length = 20, nullable = true)
   /** ID DEL DEPARTAMENTO */
   public String iD_DEPARTAMENTO;
   
   
   @Column(name = "ID_MUNICIPIO", precision = 10, scale = 2, nullable = true)
   /** ES LA PK DE LA TABLA CAT_MUNICIPIO */
   public Double iD_MUNICIPIO;
   
   
   @Column(name = "ID_TIPO_SEDE", precision = 10, scale = 2, nullable = true)
   /** ID TIPO DE SEDE A INGRESAR */
   public Double iD_TIPO_SEDE;
   
   
   @Column(length = 300, nullable = true)
   /** NOMBRE DE LA SEDE */
   public String nOMBRE;
   
   
   @Column(length = 300, nullable = true)
   /** DIRECCION DE LA SEDE */
   public String dIRECCION;
   
   
   @Column(length = 300, nullable = true)
   /** OBSERVACION DE LA SEDE */
   public String oBSERVACIONES;
   
   
   @Column(length = 1000, nullable = true)
   /** JUSTIFICACION */
   public String jUSTIFICACION;
   
   
   @Column(length = 300, nullable = true)
   /** DEPENDENCIA POLICIAL O FISCAL */
   public String dEPENDENCIA;
   
   
   @Column(name = "F_CREA_FECHA_LOG", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA CREACION REGISTRO DEL LOG */
   public Date f_CREA_FECHA_LOG;
   
   
   @Column(name = "F_CREA_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA CREACION REGISTRO */
   public Date f_CREA_FECHA;
   
   
   @Column(name = "F_MOD_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA MODIFICACION REGISTRO */
   public Date f_MOD_FECHA;
   
   
   @Column(name = "S_CREA_USUARIO", length = 30, nullable = true)
   /** USUARIO QUE CREO EL REGISTRO */
   public String s_CREA_USUARIO;
   
   
   @Column(name = "S_MOD_USUARIO", length = 30, nullable = true)
   /** USUARIO QUE MODIFICO EL REGISTRO LA ULTIMA VEZ */
   public String s_MOD_USUARIO;
   
   
   @Column(name = "CODIGO_SEDE", length = 20, nullable = true)
   public String cODIGO_SEDE;
   
   
   @Column(name = "CODIGO_SOLICITUD", length = 20, nullable = true)
   public String cODIGO_SOLICITUD;
   
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   CAT_ESTADO cAT_ESTADO;


}