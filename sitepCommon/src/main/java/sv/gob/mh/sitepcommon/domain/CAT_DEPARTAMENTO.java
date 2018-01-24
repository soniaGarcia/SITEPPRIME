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
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import sv.gob.mh.sitepcommon.domain.util.BaseEntity;

@Entity
@Table(name = "CAT_DEPARTAMENTO")
@SequenceGenerator(name = "SEQ_CAT_DEPARTAMENTO", sequenceName = "SEQ_CAT_DEPARTAMENTO", allocationSize = 1)
@EqualsAndHashCode(of = {"ID_DEPARTAMENTO"})
@ToString(of = {"ID_DEPARTAMENTO"})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class CAT_DEPARTAMENTO implements BaseEntity<Double> {

    private static final long serialVersionUID = 605503858148965L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CAT_DEPARTAMENTO")
    @Column(nullable = false, name = "ID")
    @NonNull
    /**
     * ID
     */
    public Double id;

    @Column(nullable = false)
    @NonNull
    /**
     * ID DEL DEPARTAMENTO
     */
    public String iD_DEPARTAMENTO;

    @Column(length = 50, nullable = true)
    /**
     * NOMBRE DEL DEPARTAMENTO
     */
    public String dESCRIPCION;

    @Column(name = "F_CREA_FECHA", nullable = true)
    @Temporal(TemporalType.DATE)
    /**
     * FECHA CREACION REGISTRO
     */
    public Date f_CREA_FECHA;

    @Column(name = "F_MOD_FECHA", nullable = true)
    @Temporal(TemporalType.DATE)
    /**
     * FECHA MODIFICACION REGISTRO
     */
    public Date f_MOD_FECHA;

    @Column(name = "S_CREA_USUARIO", length = 20, nullable = true)
    /**
     * USUARIO QUE CREO EL REGISTRO
     */
    public String s_CREA_USUARIO;

    @Column(name = "S_MOD_USUARIO", length = 20, nullable = true)
    /**
     * USUARIO QUE MODIFICO EL REGISTRO LA ULTIMA VEZ
     */
    public String s_MOD_USUARIO;

    @OneToMany
    @JoinColumns({
        @JoinColumn(name = "CATDEPARTAMENTO_IDDEPARTAMENTO", referencedColumnName = "ID_DEPARTAMENTO")
    })
    Set<CAT_SEDE> cAT_SEDESet;

    @OneToMany
    @JoinColumns({
        @JoinColumn(name = "CATDEPARTAMENTO_IDDEPARTAMENTO", referencedColumnName = "ID_DEPARTAMENTO")
    })
    Set<CAT_MUNICIPIO> cAT_MUNICIPIOSet;

}
