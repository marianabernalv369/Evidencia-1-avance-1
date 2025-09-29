# Evidencia-1-avance-1
Evidencia 1 – Avance 1  
**Sistema de Administración de Citas para un Consultorio Clínico**

---

##  Objetivo del proyecto
El propósito de este proyecto es desarrollar un sistema en Java que simule la administración de citas en un consultorio clínico.  
El sistema permitirá:  
- Dar de alta doctores.  
- Dar de alta pacientes.  
- Crear una cita con fecha y hora.  
- Relacionar una cita con un doctor y un paciente.  
- Control de acceso mediante administradores (login con usuario y contraseña).  

---

## Ambiente de desarrollo
- **Lenguaje:** Java 17   
- **IDE:** IntelliJ IDEA Community Edition  
- **Control de versiones:** Git + GitHub  
- **Sistema Operativo de pruebas:** Windows 10  

### Evidencia de configuración
- Java instalado   
- IntelliJ configurado  
- Repositorio en GitHub creado   

---

##  Diagrama de flujo
```mermaid
flowchart TD
    A[Inicio] --> B[Login Administrador]
    B -->|Credenciales válidas| C[Mostrar menú principal]
    B -->|Credenciales inválidas| A

    C --> D[1. Dar de alta doctor]
    C --> E[2. Dar de alta paciente]
    C --> F[3. Crear cita]
    C --> G[4. Salir]

    D --> C
    E --> C
    F --> C
    G --> H[Fin]
