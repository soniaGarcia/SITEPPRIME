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
@Table(name="CAT_TIPOS_DEVOLUCION")
@SequenceGenerator(name = "SEQ_CAT_TIPOS_DEVOLUCION", sequenceName = "SEQ_CAT_TIPOS_DEVOLUCION", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_TIPOS_DEVOLUCION"})
@ToString(of = {"ID_TIPOS_DEVOLUCION"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_TIPOS_DEVOLUCION  implements BaseEntity<Double> {

   private static final long serialVersionUID =  179609933921762L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_TIPOS_DEVOLUCION")
   @Column(nullable = false,name = "ID_TIPOS_DEVOLUCION")
   @NonNull
   /** CORRELATIVO DEL TIPO DE DEVOLUCION */
   public Double id;
   
   
   @Column(length = 7, nullable = true)
   /** tomará las primeras tres letras del tipo y le asignará un número correlativo, salvo para el tipo otros que tomará toda la palabra sin correlativo */
   public String cODIGO;
   
   
   @Column(length = 50, nullable = true)
   /** DESCRIPCION DEL EMBALAJE */
   public String tIPO;
   
   
   @Column(length = 300, nullable = true)
   /** JUSTIFICACION O MODIFICACION */
   public String jUSTIFICACION;
   
   
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
   
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   CAT_ESTADO cAT_ESTADO;


}