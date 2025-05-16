BEGIN;

CREATE TABLE cliente(
    id_cliente varchar(10) PRIMARY KEY,
    nombre_cliente varchar(50);
    corre_cliente varchar(30)
);

CREATE TABLE venta(
    id_venta varchar(10) PRIMARY KEY,
    cantidad_producto integer,
    id_cliente varchar REFERENCES cliente(id_cliente) ON DELETE CASCADE
);

CREATE TABLE producto(
    id_producto varchar(10) PRIMARY KEY,
    nombre_producto varchar(30),
    precio_producto real,
    categoria_producto varchar(30),
    existencia_producto integer,
    id_venta varchar REFERENCES venta(id_venta) ON DELETE CASCADE
);

COMMIT;