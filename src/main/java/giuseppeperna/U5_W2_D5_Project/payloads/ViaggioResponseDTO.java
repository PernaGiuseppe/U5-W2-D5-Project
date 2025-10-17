package giuseppeperna.U5_W2_D5_Project.payloads;

import giuseppeperna.U5_W2_D5_Project.entities.StatoViaggio;

import java.time.LocalDate;

public record ViaggioResponseDTO(
        Long id,
        String destinazione,
        LocalDate data,
        StatoViaggio stato
) {
}

