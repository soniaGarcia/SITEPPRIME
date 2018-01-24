package sv.gob.mh.sitepcommon.domain;

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
@Table(name="ING_DECOMISO_LOG")
@SequenceGenerator(name = "SEQ_ING_DECOMISO_LOG", sequenceName = "SEQ_ING_DECOMISO_LOG", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO_LOG"})
@ToString(of = {"ID_DECOMISO_LOG"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO_LOG  implements BaseEntity<Double> {

   private static final long serialVersionUID =  164853301816892L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO_LOG")
   @Column(nullable = false, name = "ID_DECOMISO_LOG")
   @NonNull
   /** ID DEL DECOMISO LOG */
   public Double Id;
   
   
   @Column(name = "ID_DECOMISO", precision = 10, scale = 2, nullable = true)
   /** ID DEL DECOMISO */
   public Double iD_DECOMISO;
   
   
   @Column(name = "NUMERO_OFICIO", length = 30, nullable = true)
   /** NUMERO OFICIO, NO SE GENERA */
   public String nUMERO_OFICIO;
   
   
   @Column(name = "FECHA_OFICIO", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA DEL DECOMISO */
   public Date fECHA_OFICIO;
   
   
   @Column(length = 30, nullable = true)
   /** REFERENCIA DEL DECOMISO */
   public String rEFERENCIA;
   
   
   @Column(name = "ID_SEDE", precision = 10, scale = 2, nullable = true)
   /** ID DE LA SEDE */
   public Double iD_SEDE;
   
   
   @Column(name = "ORDEN_ID_SEDE", precision = 10, scale = 2, nullable = true)
   /** ID DE LA SEDE QUE QUEDA EL DECOMISO */
   public Double oRDEN_ID_SEDE;
   
   
   @Column(name = "ID_EMBALAJE", precision = 10, scale = 2, nullable = true)
   /** DETALLE DEL EMBALAJE */
   public Double iD_EMBALAJE;
   
   
   @Column(length = 300, nullable = true)
   /** JUSTIFICACION O MODIFICACION */
   public String jUSTIFICACION;
   
   
   @Column(name = "ID_ESTADO", precision = 10, scale = 2, nullable = true)
   /** ESTADO */
   public Double iD_ESTADO;
   
   
   @Column(name = "F_CREA_FECHA_LOG", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA CREACION REGISTRO LOG */
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


}