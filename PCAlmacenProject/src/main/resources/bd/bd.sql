
use `almacenbd`;
CREATE TABLE PROVEEDOR(
idproveedor int auto_increment,
direccion varchar(30),
cidudad varchar(30),
primary key (idproveedor)
);
CREATE TABLE PRODUCTO(
idproducto int auto_increment,
idproveedor varchar(3),
descripccion varchar(25),
primary key(idproducto),
key kf_producto_proveedor(idproveedor)
);