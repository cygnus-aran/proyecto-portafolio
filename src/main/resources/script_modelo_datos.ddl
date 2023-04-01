-- Generado por Oracle SQL Developer Data Modeler 21.2.0.183.1957
--   en:        2023-03-30 02:37:07 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE empresa_cliente (
    id_empresa          INTEGER NOT NULL,
    nombre_empresa      VARCHAR2(100) NOT NULL,
    direccion_empresa   VARCHAR2(100) NOT NULL,
    fono_empresa        VARCHAR2(12) NOT NULL,
    email_empresa       VARCHAR2(100) NOT NULL,
    responsable_empresa VARCHAR2(100) NOT NULL,
    estado_empresa      CHAR(1) NOT NULL,
    usuarios_id_usuario NUMBER NOT NULL
);

CREATE UNIQUE INDEX empresa_cliente__idx ON
    empresa_cliente (
        usuarios_id_usuario
    ASC );

ALTER TABLE empresa_cliente ADD CONSTRAINT empresa_cliente_pk PRIMARY KEY ( id_empresa );

CREATE TABLE factura (
    id_factura                 INTEGER NOT NULL,
    id_empresa                 INTEGER NOT NULL,
    factura_fecha_emision      DATE NOT NULL,
    factura_total_neto         INTEGER NOT NULL,
    factura_total_bruto        INTEGER NOT NULL,
    factura_iva                INTEGER NOT NULL,
    estado_factura             CHAR(1) NOT NULL,
    empresa_cliente_id_empresa INTEGER NOT NULL
);

ALTER TABLE factura ADD CONSTRAINT factura_pk PRIMARY KEY ( id_factura );

CREATE TABLE persona (
    id_usuario       VARCHAR2(50) NOT NULL,
    rut_persona      INTEGER NOT NULL,
    nombre_persona   VARCHAR2(100) NOT NULL,
    id_empresa       INTEGER NOT NULL,
    fecha_alta       DATE NOT NULL,
    fecha_baja       DATE NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    estado_persona   CHAR(1) NOT NULL,
    puesto_persona   VARCHAR2(100) NOT NULL,
    id_rol           INTEGER NOT NULL
);

ALTER TABLE persona ADD CONSTRAINT persona_pk PRIMARY KEY ( rut_persona,
                                                            id_usuario );

CREATE TABLE prestadores (
    id_usuario       VARCHAR2(50) NOT NULL,
    rut_persona      INTEGER NOT NULL,
    id_prestador     INTEGER NOT NULL,
    titulo_prestador VARCHAR2(50) NOT NULL
);

ALTER TABLE prestadores ADD CONSTRAINT prestadores_pk PRIMARY KEY ( rut_persona,
                                                                    id_usuario );

CREATE TABLE prestador_servicio (
    prestadores_rut_persona INTEGER NOT NULL,
    prestadores_id_usuario  VARCHAR2(50) NOT NULL,
    servicios_id_servicio   INTEGER NOT NULL
);

ALTER TABLE prestador_servicio
    ADD CONSTRAINT prestador_servicio_pk PRIMARY KEY ( prestadores_rut_persona,
                                               prestadores_id_usuario,
                                               servicios_id_servicio );

CREATE TABLE factura_servicio (
    servicios_id_servicio INTEGER NOT NULL,
    factura_id_factura    INTEGER NOT NULL
);

ALTER TABLE factura_servicio ADD CONSTRAINT factura_servicio_pk PRIMARY KEY ( servicios_id_servicio,
                                                                  factura_id_factura );

CREATE TABLE roles (
    id_rol          INTEGER NOT NULL,
    rol_descripcion VARCHAR2(50) NOT NULL
);

ALTER TABLE roles ADD CONSTRAINT roles_pk PRIMARY KEY ( id_rol );

CREATE TABLE servicios (
    id_servicio              INTEGER NOT NULL,
    nombre_servicio          VARCHAR2(50) NOT NULL,
    valor_servicio           INTEGER NOT NULL,
    descripcion_servicio     VARCHAR2 (200),
    fecha_creacion_serrvicio DATE NOT NULL,
    fecha_baja_servicio      DATE NOT NULL
);

ALTER TABLE servicios ADD CONSTRAINT servicios_pk PRIMARY KEY ( id_servicio );

CREATE TABLE usuarios (
    id_usuario          NUMBER NOT NULL,
    nombre_usuario      VARCHAR2(50) NOT NULL,
    contrasena_usuario  VARCHAR2(50) NOT NULL,
    id_rol              INTEGER NOT NULL,
    id_empresa          VARCHAR2(100) NOT NULL,
    fecha_alta          DATE NOT NULL,
    persona_rut_persona INTEGER NOT NULL,
    roles_id_rol        INTEGER NOT NULL,
    persona_id_usuario  VARCHAR2(50) NOT NULL
);

CREATE UNIQUE INDEX usuarios__idx ON
    usuarios (
        persona_rut_persona
    ASC,
        persona_id_usuario
    ASC );

CREATE UNIQUE INDEX usuarios__idxv1 ON
    usuarios (
        roles_id_rol
    ASC );

ALTER TABLE usuarios ADD CONSTRAINT usuarios_pk PRIMARY KEY ( id_usuario );

ALTER TABLE empresa_cliente
    ADD CONSTRAINT empresa_cliente_usuarios_fk FOREIGN KEY ( usuarios_id_usuario )
        REFERENCES usuarios ( id_usuario );

ALTER TABLE factura
    ADD CONSTRAINT factura_empresa_cliente_fk FOREIGN KEY ( empresa_cliente_id_empresa )
        REFERENCES empresa_cliente ( id_empresa );

ALTER TABLE prestadores
    ADD CONSTRAINT prestadores_persona_fk FOREIGN KEY ( rut_persona,
                                                        id_usuario )
        REFERENCES persona ( rut_persona,
                             id_usuario );

ALTER TABLE prestador_servicio
    ADD CONSTRAINT relation_4_prestadores_fk FOREIGN KEY ( prestadores_rut_persona,
                                                           prestadores_id_usuario )
        REFERENCES prestadores ( rut_persona,
                                 id_usuario );

ALTER TABLE s
    ADD CONSTRAINT relation_4_servicios_fk FOREIGN KEY ( servicios_id_servicio )
        REFERENCES servicios ( id_servicio );

ALTER TABLE relation_7
    ADD CONSTRAINT relation_7_factura_fk FOREIGN KEY ( factura_id_factura )
        REFERENCES factura ( id_factura );

ALTER TABLE relation_7
    ADD CONSTRAINT relation_7_servicios_fk FOREIGN KEY ( servicios_id_servicio )
        REFERENCES servicios ( id_servicio );

ALTER TABLE usuarios
    ADD CONSTRAINT usuarios_persona_fk FOREIGN KEY ( persona_rut_persona,
                                                     persona_id_usuario )
        REFERENCES persona ( rut_persona,
                             id_usuario );

ALTER TABLE usuarios
    ADD CONSTRAINT usuarios_roles_fk FOREIGN KEY ( roles_id_rol )
        REFERENCES roles ( id_rol );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             9
-- CREATE INDEX                             3
-- ALTER TABLE                             18
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   1
-- WARNINGS                                 0
