BEGIN;
INSERT INTO producto (id_producto, nombre_producto, precio_producto, categoria_producto, existencia_producto) VALUES
('P001', 'Televisor 50"', 8500.00, 'Electrónica', 15),
('P002', 'Laptop 14"', 12500.00, 'Computación', 10),
('P003', 'Smartphone X100', 7200.00, 'Celulares', 20),
('P004', 'Tablet 10"', 4800.00, 'Computación', 12),
('P005', 'Refrigerador 400L', 10500.00, 'Electrodomésticos', 8),
('P006', 'Lavadora 18kg', 9300.00, 'Electrodomésticos', 6),
('P007', 'Microondas 1000W', 1500.00, 'Electrodomésticos', 18),
('P008', 'Bocina Bluetooth', 900.00, 'Audio', 25),
('P009', 'Audífonos inalámbricos', 1200.00, 'Audio', 30),
('P010', 'Monitor 24"', 2900.00, 'Computación', 14),
('P011', 'Teclado mecánico', 800.00, 'Accesorios', 40),
('P012', 'Mouse óptico', 450.00, 'Accesorios', 50),
('P013', 'Smartwatch', 3500.00, 'Celulares', 9),
('P014', 'Impresora multifuncional', 4100.00, 'Oficina', 7),
('P015', 'Silla ergonómica', 5200.00, 'Oficina', 5),
('P016', 'Router WiFi 6', 1800.00, 'Redes', 13),
('P017', 'Cámara de seguridad', 2200.00, 'Seguridad', 11),
('P018', 'Disco duro externo 1TB', 1600.00, 'Almacenamiento', 17),
('P019', 'Memoria USB 64GB', 350.00, 'Almacenamiento', 60),
('P020', 'Proyector LED', 4700.00, 'Multimedia', 4);
COMMIT;