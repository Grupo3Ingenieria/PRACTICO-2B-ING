-- Elimina la tabla 'users' si ya existe para asegurar un inicio limpio
DROP TABLE IF EXISTS users;

-- Crea la tabla 'users' con los campos originales, adaptados para SQLite
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, -- Clave primaria autoincremental para SQLite
    name TEXT NOT NULL UNIQUE,          -- Nombre de usuario (TEXT es el tipo de cadena recomendado para SQLite), con restricción UNIQUE
    password TEXT NOT NULL           -- Contraseña hasheada (TEXT es el tipo de cadena recomendado para SQLite)
);

DROP TABLE IF EXISTS persons;
CREATE TABLE persons(
    id_per INTEGER PRIMARY KEY,
    dni INTEGER NOT NULL UNIQUE,
    mail VARCHAR(250) NOT NULL,
    tel INTEGER NOT NULL,
    nombre VARCHAR(250) NOT NULL,
    apellido VARCHAR(250) NOT NULL,
    direccion VARCHAR(250) NOT NULL,
    CONSTRAINT fk_per FOREIGN KEY (id_per) REFERENCES users(id) ON DELETE CASCADE
);


DROP TABLE IF EXISTS professors;
CREATE TABLE professors(
    id_prof INTEGER PRIMARY KEY,
    legajo INTEGER NOT NULL UNIQUE,
    cargo VARCHAR(250) NOT NULL,
    CONSTRAINT fk_prof FOREIGN KEY (id_prof) REFERENCES persons(id_per) ON DELETE CASCADE
);

