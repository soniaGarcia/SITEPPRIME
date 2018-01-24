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
@Table(name="ING_DECOMISO")
@SequenceGenerator(name = "SEQ_ING_DECOMISO", sequenceName = "SEQ_ING_DECOMISO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DECOMISO"})
@ToString(of = {"ID_DECOMISO"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ING_DECOMISO  implements BaseEntity<Double>, java.io.Serializable {

   private static final long serialVersionUID =  76250364395232L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ING_DECOMISO")
   @Column(nullable = false,name = "ID_DECOMISO")
   @NonNull
   /** ID DEL DECOMISO */
   public Double id;
   
   
   @Column(name = "NUMERO_OFICIO", length = 30, nullable = true)
   /** NUMERO OFICIO, NO SE GENERA */
   public String nUMERO_OFICIO;
   
   
   @Column(name = "FECHAOFICIO", nullable = true)
   @Temporal(TemporalType.DATE)
   /** FECHA DEL DECOMISO */
   public Date fECHA_OFICIO;
   
   
   @Column(length = 30, nullable = true)
   /** REFERENCIA DEL DECOMISO */
   public String rEFERENCIA;
   
   
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
   
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   Set<ING_DECOMISO_IMAGEN> iNG_DECOMISO_IMAGENSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   Set<ING_DECOMISO_VICTIMA> iNG_DECOMISO_VICTIMASet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   Set<ING_DECOMISO_MONEDA> iNG_DECOMISO_MONEDASet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   Set<ING_DECOMISO_IMPUTADO> iNG_DECOMISO_IMPUTADOSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="ID_DECOMISO", referencedColumnName="ID_DECOMISO")
   })
   Set<ING_DECOMISO_DELITO> iNG_DECOMISO_DELITOSet;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   CAT_ESTADO cAT_ESTADO;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ID_EMBALAJE", referencedColumnName="ID_EMBALAJE")
   })
   CAT_EMBALAJE cAT_EMBALAJE;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ID_SEDE", referencedColumnName="ID_SEDE")
   })
   CAT_SEDE cAT_SEDE;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="ORDEN_ID_SEDE", referencedColumnName="ID_SEDE")
   })
   CAT_SEDE cAT_SEDE2;


}