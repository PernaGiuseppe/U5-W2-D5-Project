package giuseppeperna.U5_W2_D5_Project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "viaggi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String destinazione;

    @Column(nullable = false)
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatoViaggio stato;

    @OneToMany(mappedBy = "viaggio", cascade = CascadeType.ALL)
    private List<Prenotazione> prenotazioni;
}

