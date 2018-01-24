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
@Table(name="CAT_FUNCIONARIO")
@SequenceGenerator(name = "SEQ_CAT_FUNCIONARIO", sequenceName = "SEQ_CAT_FUNCIONARIO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_FUNCIONARIO"})
@ToString(of = {"ID_FUNCIONARIO"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_FUNCIONARIO  implements BaseEntity<Double> {

   private static final long serialVersionUID =  414751277221093L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_FUNCIONARIO")
   @Column(nullable = false, name = "ID_FUNCIONARIO")
   @NonNull
   /** ID DEL FUNCIONARIO */
   public Double id;
   
   
   @Column(length = 300, nullable = true)
   /** NOMBRE DEL FUNCIONARIO */
   public String nOMBRE;
   
   
   @Column(length = 300, nullable = true)
   /** CARGO QUE EMPLEA */
   public String cARGO;
   
   
   @Column(name = "NUMERO_CARNET", length = 50, nullable = true)
   /** NUMERO DE CARNET */
   public String nUMERO_CARNET;
   
   
   @Column(name = "ID_UNIDAD_ORGANIZATIVA", precision = 10, scale = 2, nullable = true)
   /** ID DE UNIDAD, SE TOMARA DE VISTAS */
   public Double iD_UNIDAD_ORGANIZATIVA;
   
   
   @Column(length = 500, nullable = true)
   /** JUSTIFICACION O MODIFICACIO */
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
   
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_ESTADO_ID_ESTADO", referencedColumnName="ID_ESTADO")
   })
   CAT_ESTADO cAT_ESTADO;


}