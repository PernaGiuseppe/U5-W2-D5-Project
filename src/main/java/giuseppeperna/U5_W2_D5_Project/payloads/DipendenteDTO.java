package giuseppeperna.U5_W2_D5_Project.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record DipendenteDTO(
        @NotEmpty(message = "L'username è obbligatorio")
        String username,

        @NotEmpty(message = "Il nome è obbligatorio")
        String nome,

        @NotEmpty(message = "Il cognome è obbligatorio")
        String cognome,

        @NotEmpty(message = "L'email è obbligatoria")
        @Email(message = "Email non valida")
        String email
) {
}

