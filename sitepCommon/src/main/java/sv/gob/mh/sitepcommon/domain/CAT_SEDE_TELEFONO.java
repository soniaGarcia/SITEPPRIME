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
@Table(name="CAT_SEDE_TELEFONO")
@SequenceGenerator(name = "SEQ_CAT_SEDE_TELEFONO", sequenceName = "SEQ_CAT_SEDE_TELEFONO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_SEDE_TELEFONO"})
@ToString(of = {"ID_SEDE_TELEFONO"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_SEDE_TELEFONO  implements BaseEntity<Double> {

   private static final long serialVersionUID =  471791251350277L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_SEDE_TELEFONO")
   @Column(nullable = false, name = "ID_SEDE_TELEFONO")
   @NonNull
   /** ID DE TELEFONO POR SEDE */
   public Double id;
   
   
   @Column(length = 20, nullable = true)
   /** NUMERO TELEFONICO DE LA SEDE */
   public String tELEFONO;
   
   
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
       @JoinColumn(name="CAT_SEDE_ID_SEDE", referencedColumnName="ID_SEDE")
   })
   CAT_SEDE cAT_SEDE;


}