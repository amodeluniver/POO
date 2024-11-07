-- Crear tabla pacientes
CREATE TABLE pacientes (
    idPaciente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    dni VARCHAR(10)
);

-- Crear tabla citas
CREATE TABLE citas (
    idCita INT PRIMARY KEY AUTO_INCREMENT,
    idPaciente INT,
    fecha DATE,
    hora TIME,
    FOREIGN KEY (idPaciente) REFERENCES pacientes(idPaciente)
);

-- Crear tabla personal
CREATE TABLE personal (
    idPersonal INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    especialidad VARCHAR(50)
);

-- Crear tabla inventario
CREATE TABLE inventario (
    idProducto INT PRIMARY KEY AUTO_INCREMENT,
    nombreProducto VARCHAR(100),
    cantidad INT
);
