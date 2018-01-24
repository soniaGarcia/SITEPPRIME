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
@Table(name="CAT_MUNICIPIO")
@SequenceGenerator(name = "SEQ_CAT_MUNICIPIO", sequenceName = "SEQ_CAT_MUNICIPIO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID"})
@ToString(of = {"ID"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_MUNICIPIO  implements BaseEntity<Double> {

   private static final long serialVersionUID =  154853830374081L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_MUNICIPIO")
   @Column(nullable = false, name = "ID")
   @NonNull
   /** CORRELATIVO DEL MUNICIPIO */
   public Double id;
   
   
   @Column(name = "ID_MUNICIPIO", length = 10, nullable = true)
   /** ID DEL MUNICPIO */
   public String iD_MUNICIPIO;
   
   
   @Column(length = 200, nullable = true)
   /** NOMBRE DEL MUNICIPIO */
   public String dESCRIPCION;
   
   
   @Column(name = "F_CREA_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   public Date f_CREA_FECHA;
   
   
   @Column(name = "F_MOD_FECHA", nullable = true)
   @Temporal(TemporalType.DATE)
   public Date f_MOD_FECHA;
   
   
   @Column(name = "S_CREA_USUARIO", length = 30, nullable = true)
   public String s_CREA_USUARIO;
   
   
   @Column(name = "S_MOD_USUARIO", length = 20, nullable = true)
   public String s_MOD_USUARIO;
   
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_MUNICIPIO_ID", referencedColumnName="ID")
   })
   Set<CAT_SEDE> cAT_SEDESet;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_DEPARTAMENTO_ID_DEPARTAMENTO", referencedColumnName="ID_DEPARTAMENTO")
   })
   CAT_DEPARTAMENTO cAT_DEPARTAMENTO;


}