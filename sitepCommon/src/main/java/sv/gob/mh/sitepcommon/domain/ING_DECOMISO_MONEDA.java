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
@Table(name="ING_DECOMISO_MONEDA")
@SequenceGenerator(name = "SEQ_ING_DECOMISO_MONEDA", sequenceName = "SEQ_ING_DECOMISO_MONEDA", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO_MONEDA"})
@ToString(of = {"ID_DECOMISO_MONEDA"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO_MONEDA  implements BaseEntity<Double>, java.io.Serializable {

   private static final long serialVersionUID =  521907947824586L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO_MONEDA")
   @Column(nullable = false, name = "ID_DECOMISO_MONEDA")
   @NonNull
   public Double id;
   
   
   @Column(length = 20, nullable = true)
   /** TIPO DE MONEDA */
   public String mONEDA;
   
   
   @Column(precision = 10, scale = 10, nullable = true)
   /** MONTO */
   public Double mONTO;
   
   
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