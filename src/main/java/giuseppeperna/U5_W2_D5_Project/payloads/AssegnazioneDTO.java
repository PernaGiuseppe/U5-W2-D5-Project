package giuseppeperna.U5_W2_D5_Project.payloads;

import jakarta.validation.constraints.NotNull;

public record AssegnazioneDTO(
        @NotNull(message = "L'ID del dipendente è obbligatorio")
        Long dipendenteId
) {
}

