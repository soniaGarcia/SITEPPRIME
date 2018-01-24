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
@Table(name="ING_DECOMISO_VICTIMA")
@SequenceGenerator(name = "SEQ_ING_DECOMISO_VICTIMA", sequenceName = "SEQ_ING_DECOMISO_VICTIMA", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO_VICTIMA"})
@ToString(of = {"ID_DECOMISO_VICTIMA"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO_VICTIMA  implements BaseEntity<Double>, java.io.Serializable {

   private static final long serialVersionUID =  35197084092217L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO_VICTIMA")
   @Column(nullable = false, name="ID_DECOMISO_VICTIMA")
   @NonNull
   public Double Id;
   
   
   @Column(length = 300, nullable = true)
   /** NOMBRE DE LA VICTIMA */
   public String nOMBRE;
   
   
   @Column(name = "F_CREA_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA CREACION REGISTRO */
   public Date f_CREA_FECHA;
   
   
   @Column(name = "F_MOD_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA MODIFICACION REGISTRO */
   public Date f_MOD_FECHA;
   
   
   @Column(name = "S_CREA_USUARIO", length = 20, nullable = true)
   /** USUARIO QUE CREO EL REGISTRO */
   public String s_CREA_USUARIO;
   
   
   @Column(name = "S_MOD_USUARIO", length = 20, nullable = true)
   /** USUARIO QUE MODIFICO EL REGISTRO LA ULTIMA VEZ */
   public String s_MOD_USUARIO;
   
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ING_DECOMISO_ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   ING_DECOMISO iNG_DECOMISO;


}