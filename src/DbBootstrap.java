import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class DbBootstrap {
    private static final Path DB_DIR = Paths.get("db");
    private static final Path DOCTORES = DB_DIR.resolve("doctores.csv");
    private static final Path PACIENTES = DB_DIR.resolve("pacientes.csv");
    private static final Path CITAS = DB_DIR.resolve("citas.csv");

    public static void ensureDb() {
        try {
            if (Files.notExists(DB_DIR)) {
                Files.createDirectories(DB_DIR);
            }
            createIfMissing(DOCTORES, List.of(
                    "id,nombre,especialidad,telefono,email",
                    "1,Dr. Demo,General,5550000000,dr.demo@demo.com"
            ));
            createIfMissing(PACIENTES, List.of(
                    "id,nombre,edad,telefono,email",
                    "1,Paciente Demo,30,5551111111,paciente@demo.com"
            ));
            createIfMissing(CITAS, List.of(
                    "id,id_paciente,id_doctor,fecha,hora,estado,nota",
                    "1,1,1,2025-10-10,10:00,PROGRAMADA,Primera cita demo"
            ));
        } catch (IOException e) {
            throw new RuntimeException("Error preparando archivos de DB: " + e.getMessage(), e);
        }
    }

    private static void createIfMissing(Path file, List<String> lines) throws IOException {
        if (Files.notExists(file)) {
            Files.write(file, lines, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }
    }
}
