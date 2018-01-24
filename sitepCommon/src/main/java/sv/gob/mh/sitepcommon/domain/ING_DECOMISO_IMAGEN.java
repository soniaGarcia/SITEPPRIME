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
@Table(name="ING_DECOMISO_IMAGEN")
@SequenceGenerator(name = "SEQ_ING_DECOMISO_IMAGEN", sequenceName = "SEQ_ING_DECOMISO_IMAGEN", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO_IMAGEN"})
@ToString(of = {"ID_DECOMISO_IMAGEN"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO_IMAGEN  implements BaseEntity<Double> {

   private static final long serialVersionUID =  841178729585154L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO_IMAGEN")
   @Column(nullable = false,name = "ID_DECOMISO_IMAGEN")
   @NonNull
   /** ID DEL ARCHIVO */
   public Double Id;
   
   
   @Column(length = 255, nullable = true)
   /** BYTES DE ARCHIVO */
   public String aRCHIVO;
   
   
   @Column(name = "NOMBRE_ARCHIVO", length = 300, nullable = true)
   /** NOMBRE Y EXTENSION DE ARCHIVO */
   public String nOMBRE_ARCHIVO;
   
   
   @Column(name = "F_CREA_FECHA_LOG", nullable = true)
   @Temporal(TemporalType.DATE)
   public Date f_CREA_FECHA_LOG;
   
   
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