package sv.gob.mh.sv.gob.mh.sitep.model;

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
@Table(name="CAT_EMBALAJE_LOG")
@SequenceGenerator(name = "SEQ_CAT_EMBALAJE_LOG", sequenceName = "SEQ_CAT_EMBALAJE_LOG", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_EMBALAJE_LOG"})
@ToString(of = {"ID_EMBALAJE_LOG"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_EMBALAJE_LOG  implements BaseEntity<Double> {

   private static final long serialVersionUID =  394585090663776L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_EMBALAJE_LOG")
   @Column(nullable = false, name = "ID_EMBALAJE_LOG")
   @NonNull
   /** CORRELATIVO DEL EMBALAJE LOG */
   public Double Id;
   
   
   @Column(name = "ID_EMBALAJE", precision = 10, scale = 2, nullable = true)
   /** CORRELATIVO DEL EMBALAJE */
   public Double iD_EMBALAJE;
   
   
   @Column(length = 7, nullable = true)
   /** tomará las primeras tres letras del tipo y le asignará un número correlativo, salvo para el tipo otros que tomará toda la palabra sin correlativo */
   public String cODIGO;
   
   
   @Column(length = 50, nullable = true)
   /** DESCRIPCION DEL EMBALAJE */
   public String tIPO;
   
   
   @Column(length = 300, nullable = true)
   /** JUSTIFICACION O MODIFICACION */
   public String jUSTIFICACION;
   
   
   @Column(name = "ID_ESTADO", precision = 10, scale = 2, nullable = true)
   /** ESTADO DEL REGISTRO */
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