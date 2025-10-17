package giuseppeperna.U5_W2_D5_Project.payloads;

import java.time.LocalDate;

public record PrenotazioneResponseDTO(
        Long id,
        Long viaggioId,
        String destinazioneViaggio,
        Long dipendenteId,
        String nomeDipendente,
        String cognomeDipendente,
        LocalDate dataRichiesta,
        String note,
        String preferenze
) {
}

