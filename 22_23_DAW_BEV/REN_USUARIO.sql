create table REN_USUARIO
(
    ID_USUARIO       NUMBER(5) not null
        primary key,
    NOMBRE_USUARIO   VARCHAR2(15),
    APELLIDOS        VARCHAR2(15),
    CONTRASEÑA       VARCHAR2(15),
    EMPRESA_ASOCIADA VARCHAR2(15),
    TIPO_USUARIO     NUMBER(1)
)
/

