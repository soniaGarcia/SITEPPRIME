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
@Table(name="CAT_ESTADO")
@SequenceGenerator(name = "SEQ_CAT_ESTADO", sequenceName = "SEQ_CAT_ESTADO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_ESTADO"})
@ToString(of = {"ID_ESTADO"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_ESTADO  implements BaseEntity<Long> {

   private static final long serialVersionUID =  461441394126432L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_ESTADO")
   @Column(nullable = false, name = "ID_ESTADO")
   @NonNull
   /** ID DEL ESTADO */
   public Long id;
   
   
   @Column(length = 300, nullable = true)
   /** DESCRIPCION DEL ESTADO */
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
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   Set<ING_DECOMISO> iNG_DECOMISOSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   Set<CAT_TIPOS_DEVOLUCION> cAT_TIPOS_DEVOLUCIONSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   Set<CAT_SEDE_LOG> cAT_SEDE_LOGSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   Set<CAT_FUNCIONARIO> cAT_FUNCIONARIOSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   Set<CAT_EMBALAJE> cAT_EMBALAJESet;


}