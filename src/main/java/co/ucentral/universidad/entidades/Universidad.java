package co.ucentral.universidad.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Universidad")
@Table(name = "UNIVERSIDAD")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UNIVERSIDAD")
    @SequenceGenerator(name = "SEQ_UNIVERSIDAD", sequenceName = "SEQ_UNIVERSIDAD", allocationSize = 1)


    @Column(name = "EQU_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EQU_UNIFORME", nullable = false)
    private String uniforme;

    @Column(name = "EQU_TECNICO", nullable = false)
    private String tecnico;

    @Column(name = "EQU_DIRECCION", nullable = false)
    private String direccion;
}
public class Universidad {

}
