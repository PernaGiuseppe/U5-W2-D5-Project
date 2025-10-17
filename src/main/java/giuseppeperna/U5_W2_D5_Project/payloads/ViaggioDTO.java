package giuseppeperna.U5_W2_D5_Project.payloads;

import giuseppeperna.U5_W2_D5_Project.entities.StatoViaggio;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ViaggioDTO(
        @NotEmpty(message = "La destinazione è obbligatoria")
        String destinazione,

        @NotNull(message = "La data è obbligatoria")
        LocalDate data,

        @NotNull(message = "Lo stato è obbligatorio")
        StatoViaggio stato
) {
}

