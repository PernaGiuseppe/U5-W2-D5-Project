package giuseppeperna.U5_W2_D5_Project.payloads;

public record DipendenteResponseDTO(
        Long id,
        String username,
        String nome,
        String cognome,
        String email,
        String immagineProfilo
) {
}
