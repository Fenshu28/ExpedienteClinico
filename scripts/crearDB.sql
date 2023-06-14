CREATE DATABASE HistorialClinico;
use HistorialClinico;
-- Crear tabla Paciente
CREATE TABLE Paciente (
NSS VARCHAR(20) PRIMARY KEY,
Nombre VARCHAR(50) NOT NULL,
Apellido VARCHAR(50) NOT NULL,
FechaNacimiento DATE,
Genero VARCHAR(10),
Direccion VARCHAR(100),
Telefono VARCHAR(15)
);

-- Crear tabla Expediente
CREATE TABLE Expediente (
ID_Expediente INT PRIMARY KEY AUTO_INCREMENT,
NSS_Paciente VARCHAR(20) NOT NULL,
FechaCreacion DATE,
FechaUltimaActualizacion DATE,
FOREIGN KEY (NSS_Paciente) REFERENCES Paciente(NSS)
);

-- Crear tabla Medico
CREATE TABLE Medico (
RFC VARCHAR(20) PRIMARY KEY,
Nombre VARCHAR(50) NOT NULL,
Apellido VARCHAR(50) NOT NULL,
Especialidad VARCHAR(50),
Direccion VARCHAR(100),
Telefono VARCHAR(15)
);

-- Crear tabla ConsultaMedica
CREATE TABLE ConsultaMedica (
ID_Consulta INT PRIMARY KEY AUTO_INCREMENT,
ID_Expediente INT,
RFC_Medico VARCHAR(20),
FechaConsulta DATE,
Sintomas VARCHAR(200),
Diagnostico VARCHAR(200),
Tratamiento VARCHAR(200),
NotasAdicionales VARCHAR(500),
FOREIGN KEY (ID_Expediente) REFERENCES Expediente(ID_Expediente),
FOREIGN KEY (RFC_Medico) REFERENCES Medico(RFC)
);

-- Crear tabla ResultadoExamen
CREATE TABLE ResultadoExamen (
ID_Resultado INT PRIMARY KEY AUTO_INCREMENT,
ID_Expediente INT,
TipoExamen VARCHAR(50),
FechaExamen DATE,
Resultados VARCHAR(200),
FOREIGN KEY (ID_Expediente) REFERENCES Expediente(ID_Expediente)
);

-- Crear tabla MedicamentoRecetado
CREATE TABLE MedicamentoRecetado (
ID_Receta INT PRIMARY KEY AUTO_INCREMENT,
ID_Expediente INT,
Medicamento VARCHAR(50),
Dosis VARCHAR(50),
Frecuencia VARCHAR(50),
Duracion VARCHAR(50),
FOREIGN KEY (ID_Expediente) REFERENCES Expediente(ID_Expediente)
);



-- Crear tabla Usuarios
CREATE TABLE Usuarios (
    ID_Usuario INT PRIMARY KEY AUTO_INCREMENT,
    Usuario VARCHAR(50) NOT NULL,
    Contraseña VARCHAR(100) NOT NULL,
    Nombre VARCHAR(50) NOT NULL,
    PreguntaRecuperacion VARCHAR(200) NOT NULL
);


