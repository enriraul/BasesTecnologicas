BEGIN;

CREATE TABLE cliente (
    id_cliente VARCHAR(10) PRIMARY KEY,
    nombre_cliente VARCHAR(50),
    correo_cliente VARCHAR(30)
);

CREATE TABLE venta (
    id_venta VARCHAR(10) PRIMARY KEY,
    cantidad_producto INTEGER,
    id_cliente VARCHAR(10) REFERENCES cliente(id_cliente) ON DELETE CASCADE
);

CREATE TABLE producto (
    id_producto VARCHAR(10) PRIMARY KEY,
    nombre_producto VARCHAR(30),
    precio_producto REAL,
    categoria_producto VARCHAR(30),
    existencia_producto INTEGER
);

CREATE TABLE detalle_venta (
    id_venta VARCHAR(10) REFERENCES venta(id_venta) ON DELETE CASCADE,
    id_producto VARCHAR(10) REFERENCES producto(id_producto) ON DELETE CASCADE,
    cantidad INTEGER,
    PRIMARY KEY (id_venta, id_producto)
);

COMMIT;
