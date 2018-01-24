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
@Table(name="ING_DECOMISO_IMAGEN_LOG")
@SequenceGenerator(name = "SEQ_ING_DECOMISO_IMAGEN_LOG", sequenceName = "SEQ_ING_DECOMISO_IMAGEN_LOG", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO_IMAGEN_LOG"})
@ToString(of = {"ID_DECOMISO_IMAGEN_LOG"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO_IMAGEN_LOG  implements BaseEntity<Double> {

   private static final long serialVersionUID =  769147497535223L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO_IMAGEN_LOG")
   @Column(nullable = false, name = "ID_DECOMISO_IMAGEN_LOG")
   @NonNull
   public Double Id;
   
   
   @Column(name = "ID_DECOMISOIMAGEN", precision = 10, scale = 2, nullable = true)
   /** ID DEL ARCHIVO */
   public Double iD_DECOMISO_IMAGEN;
   
   
   @Column(name = "ID_DECOMISO", precision = 10, scale = 2, nullable = true)
   /** ID DEL DECOMISO */
   public Double iD_DECOMISO;
   
   
   @Column(length = 255, nullable = true)
   /** BYTES DE ARCHIVO */
   public String aRCHIVO;
   
   
   @Column(name = "NOMBRE_ARCHIVO", length = 300, nullable = true)
   /** NOMBRE Y EXTENSION DE ARCHIVO */
   public String nOMBRE_ARCHIVO;
   
   
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
   
   
   @Column(name = "S_CREA_USUARIO", length = 20, nullable = true)
   /** USUARIO QUE CREO EL REGISTRO */
   public String s_CREA_USUARIO;
   
   
   @Column(name = "S_MOD_USUARIO", length = 20, nullable = true)
   /** USUARIO QUE MODIFICO EL REGISTRO LA ULTIMA VEZ */
   public String s_MOD_USUARIO;


}