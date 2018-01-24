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
@Table(name="CAT_SEDE")
@SequenceGenerator(name = "SEQ_CAT_SEDE", sequenceName = "SEQ_CAT_SEDE", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_SEDE"})
@ToString(of = {"ID_SEDE"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_SEDE  implements BaseEntity<Double> {

   private static final long serialVersionUID =  766560033053793L; 

   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_SEDE")
   @Column(nullable = false, name = "ID_SEDE")
   @NonNull
   /** CORRELATIVO DE LA SEDE */
   public Double id;
   
   
   @Column(length = 300, nullable = true)
   /** NOMBRE DE LA SEDE */
   public String nOMBRE;
   
   
   @Column(length = 300, nullable = true)
   /** DIRECCION DE LA SEDE */
   public String dIRECCION;
   
   
   @Column(length = 300, nullable = true)
   /** OBSERVACION DE LA SEDE */
   public String oBSERVACIONES;
   
   
   @Column(length = 1000, nullable = true)
   /** JUSTIFICACION */
   public String jUSTIFICACION;
   
   
   @Column(name = "ID_ESTADO", precision = 10, scale = 2, nullable = true)
   public Double iD_ESTADO;
   
   
   @Column(length = 300, nullable = true)
   /** DEPENDENCIA POLICIAL O FISCAL */
   public String dEPENDENCIA;
   
   
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
   
   
   @Column(name = "CODIGO_SEDE", length = 20, nullable = true)
   /** El sistema generará un código correlativo para el registro de Sedes Judiciales compuesto así: código de departamento, correlativo */
   public String cODIGO_SEDE;
   
   
   @Column(name = "CODIGO_SOLICITUD", length = 20, nullable = true)
   /** El sistema generará los números de las solicitudes de edición y anulación, compuesto así: ¿correlativo/año¿ */
   public String cODIGO_SOLICITUD;
   
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_SEDE_ID_SEDE", referencedColumnName="ID_SEDE")
   })
   Set<ING_DECOMISO> iNG_DECOMISOSet;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_SEDE_ID_SEDE", referencedColumnName="ID_SEDE")
   })
   Set<ING_DECOMISO> iNG_DECOMISOSet2;
   
   @OneToMany
   @JoinColumns({
       @JoinColumn(name="CAT_SEDE_ID_SEDE", referencedColumnName="ID_SEDE")
   })
   Set<CAT_SEDE_TELEFONO> cAT_SEDE_TELEFONOSet;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_TIPO_SEDE_ID_TIPO_SEDE", referencedColumnName="ID_TIPO_SEDE")
   })
   CAT_TIPO_SEDE cAT_TIPO_SEDE;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_MUNICIPIO_ID", referencedColumnName="ID")
   })
   CAT_MUNICIPIO cAT_MUNICIPIO;
   
   @ManyToOne
   @NotFound(action = NotFoundAction.IGNORE) 
   @JoinColumns({
       @JoinColumn(name="CAT_DEPARTAMENTO_ID_DEPARTAMENTO", referencedColumnName="ID_DEPARTAMENTO")
   })
   CAT_DEPARTAMENTO cAT_DEPARTAMENTO;


}