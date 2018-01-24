package sv.gob.mh.sitepcommon.domain;

import java.util.*;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
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
@Table(name="CAT_TIPO_SEDE")
@SequenceGenerator(name = "SEQ_CAT_TIPO_SEDE", sequenceName = "SEQ_CAT_TIPO_SEDE", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_TIPO_SEDE"})
@ToString(of = {"ID_TIPO_SEDE"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_TIPO_SEDE  implements BaseEntity<Double> {

   private static final long serialVersionUID =  31849746943296L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_TIPO_SEDE")
   @Column(nullable = false,name = "ID_TIPO_SEDE")
   @NonNull
   /** ID QUE REPRESENTA LOS TIPOS DE SEDES */
   public Double id;
   
   
   @Column(length = 200, nullable = true)
   /** DESCRIPCION JUDIAL|FISCALES|POLICIALES */
   public String dESCRIPCION;
   
   
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
   
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_TIPO_SEDE_ID_TIPO_SEDE", referencedColumnName="ID_TIPO_SEDE")
   })
   Set<CAT_SEDE> cAT_SEDESet;


}