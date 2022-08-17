DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

create table departamentos(
    codigo int auto_increment,
    nombre varchar(100),
    presupuesto int,
    primary key (codigo)
);

create table empleados(
    dni varchar(8),
    nombre varchar(100),
    apellidos varchar(255),
    departamento int,
    primary key (dni),
    constraint empleados_fk foreign key (departamento) references departamentos(codigo)
    on update cascade on delete cascade
);

insert into departamentos (nombre, presupuesto)values('Informatica', 20000);
insert into departamentos (nombre, presupuesto)values('Marketing', 20000);
insert into departamentos (nombre, presupuesto)values('Macacos', 20000);
insert into departamentos (nombre, presupuesto)values('Informatica', 20000);
insert into departamentos (nombre, presupuesto)values('Informatica', 20000);

insert into empleados (dni, nombre, apellidos, departamento)values('23452345', 'Izan', 'Dueso', 1);
insert into empleados (dni, nombre, apellidos, departamento)values('45674567', 'Joel', 'Romero', 1);
insert into empleados (dni, nombre, apellidos, departamento)values('34563456', 'asdf', 'asdf', 2);
insert into empleados (dni, nombre, apellidos, departamento)values('87658765', 'xcvb', 'cxvb', 3);
insert into empleados (dni, nombre, apellidos, departamento)values('12341234', 'ghjk', 'ghjk', 4);