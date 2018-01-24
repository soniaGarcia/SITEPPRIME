package sv.gob.mh.sitepcommon.domain;

import java.util.*;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAT_EMBALAJE")
@SequenceGenerator(name = "SEQ_CAT_EMBALAJE", sequenceName = "SEQ_CAT_EMBALAJE", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_EMBALAJE"})
@ToString(of = {"ID_EMBALAJE"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_EMBALAJE  implements BaseEntity<Long> {

   private static final long serialVersionUID =  932244132082204L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_EMBALAJE")
   @Column(nullable = false, name = "ID_EMBALAJE")
   @NonNull
   /** CORRELATIVO DEL EMBALAJE */
   public Long id;
   
   
   @Column(length = 7, nullable = true)
   /** tomará las primeras tres letras del tipo y le asignará un número correlativo, salvo para el tipo otros que tomará toda la palabra sin correlativo */
   public String codigo;
   
   
   @Column(length = 50, nullable = true)
   /** DESCRIPCION DEL EMBALAJE */
   public String tipo;
   
   
   @Column(length = 300, nullable = true)
   /** JUSTIFICACION O MODIFICACION */
   public String justificacion;
   
   
   @Column(name = "F_CREA_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA CREACION REGISTRO */
   public Date f_crea_fecha;
   
   
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
   
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_EMBALAJE", referencedColumnName="ID_EMBALAJE")
   })
   Set<ING_DECOMISO> iNG_DECOMISOSet;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   CAT_ESTADO idestado;


}