INSERT INTO nma.cliente (id, id_empresa, rut_empresa, nombre_empresa, fono_empresa, email_empresa, responsable_empresa, estado_empresa, usuario_id_usuario, rol_id_rol) VALUES (4, '4', '81908529-3', 'Inmobiliaria Aconcagua', '+5620000000', 'novedades@infoaconcagua.cl', 'Profesional 2', 'A', '4', '4');
INSERT INTO nma.cliente (id, id_empresa, rut_empresa, nombre_empresa, fono_empresa, email_empresa, responsable_empresa, estado_empresa, usuario_id_usuario, rol_id_rol) VALUES (3, '3', '84879435-k', 'MACH', '+5629999999', 'contacto@mail.somosmach.com', 'Profesional 2', 'A', '4', '4');
INSERT INTO nma.cliente (id, id_empresa, rut_empresa, nombre_empresa, fono_empresa, email_empresa, responsable_empresa, estado_empresa, usuario_id_usuario, rol_id_rol) VALUES (2, '2', '82941181-4', 'MeatMe', '+5628888888', 'contacto@meatme.cl', 'Profesional 1', 'A', '3', '3');
INSERT INTO nma.cliente (id, id_empresa, rut_empresa, nombre_empresa, fono_empresa, email_empresa, responsable_empresa, estado_empresa, usuario_id_usuario, rol_id_rol) VALUES (1, '1', '88798940-0', 'Duoc UC', '+56277777777', 'duoc@duoc.cl', 'Profesional 1', 'A', '3', '3');
INSERT INTO nma.cliente (id, id_empresa, rut_empresa, nombre_empresa, fono_empresa, email_empresa, responsable_empresa, estado_empresa, usuario_id_usuario, rol_id_rol) VALUES (7, '5', '909103622', 'Coopeuch', '+56976056314', 'contacto@coopeuch.cl', 'Profesional 1', 'A', '3', '4');

INSERT INTO nma.contrato (id_contrato, fecha_contrato, estado_contrato, id_cliente_contrato) VALUES (1, '2023-05-19', 'A', '1');
INSERT INTO nma.contrato (id_contrato, fecha_contrato, estado_contrato, id_cliente_contrato) VALUES (2, '2022-05-31', 'A', '5');

INSERT INTO nma.formulario (ap_paterno, ap_materno, nombres_trabajador, profesion, cargo, edad, sexo, anno_antiguedad, fecha_episodio, hora_episodio, region, ubicacion_o_faena, area, ubicacion_exacta, nombre_jefatura, activdad_realizada, lugar_especifico_episodio, tipo_episodio, accion_insegura, condicion_insegura, causas, testigos, cargo_testigo, elaborador_informe, cargo_elaborador_informe, fecha_informe, nombre_revisador, cargo_revisador, fecha_revision, anexos, id_cliente, folio) VALUES ('Perez', 'Pereira', 'Juan', 'Ingeniero', 'KAM', 40, 'M', 10, '2023-05-17', '2023-05-17', 'Metropolitana', 'Casa Matriz', 'Primer Piso', 'Cocina', 'Jefecito', 'Uso Hervidor', 'Cocina Coopeuch', 'Accidente', 'Si', 'Si', 'Mala conexion electrica', 'Jefecito', 'Jefatura', 'Juan Perez', 'KAM', '2023-05-18', 'Revisador 1', 'Revisador', '2023-05-18', null, '5', 1);

INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (4, '92970696-k', 'Profesional 1', '2023-05-12', '2024-05-12', 'A', 'PROFESIONAL', '3', '3');
INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (5, '95142791-8', 'Profesional 2', '2023-05-12', '2024-05-12', 'A', 'PROFESIONAL', '3', '3');
INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (1, '92289406-k', 'Admin', '2023-05-12', '2024-05-12', 'A', 'ADMINISTRADOR', '1', '2');
INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (3, '92195277-5', 'Cliente 2', '2023-05-12', '2024-05-12', 'A', 'CLIENTE', '2', '1');
INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (2, '92942426-3', 'Cliente 1', '2023-05-12', '2024-05-12', 'A', 'CLIENTE', '2', '1');
INSERT INTO nma.persona (id_persona, run_persona, nombre_persona, fecha_alta, fecha_baja, estado_persona, puesto_persona, usuario_id_usuario, rol_id_rol) VALUES (6, '172681913', 'Sergio Arancibia', '2023-05-19', '2024-05-19', 'A', 'ADMINISTRADOR', '0', '2');

INSERT INTO nma.rol (id_rol, descripcion_rol, usuario_id_usuario, cliente_id_empresa, persona_run_persona) VALUES (1, 'ADMINISTRADOR', '1', '1', '2');
INSERT INTO nma.rol (id_rol, descripcion_rol, usuario_id_usuario, cliente_id_empresa, persona_run_persona) VALUES (2, 'CLIENTE', '2', '2', '2');
INSERT INTO nma.rol (id_rol, descripcion_rol, usuario_id_usuario, cliente_id_empresa, persona_run_persona) VALUES (3, 'PROFESIONAL', '3', '3', '3');

INSERT INTO nma.servicio (id_servicio, nombre_servicio, valor_servicio, descripcion_servicio, fecha_creacion_servicio, fecha_baja_servicio, id_cliente, id_persona) VALUES (1, 'Capacitacion Prueba', 1000000, 'Capacitacion Coopeuch', '2023-05-19', '2023-05-31', '5', '1');

INSERT INTO nma.usuario (id_usuario, nombre_usuario, contraseña_usuario, fecha_alta, cliente_id_empresa, persona_run_persona, rol_id_rol) VALUES (2, 'cliente.2', 'cliente.2', '2023-05-12', '2', '2', '2');
INSERT INTO nma.usuario (id_usuario, nombre_usuario, contraseña_usuario, fecha_alta, cliente_id_empresa, persona_run_persona, rol_id_rol) VALUES (4, 'profesional.2', 'profesional.2', '2023-05-12', '3', '3', '3');
INSERT INTO nma.usuario (id_usuario, nombre_usuario, contraseña_usuario, fecha_alta, cliente_id_empresa, persona_run_persona, rol_id_rol) VALUES (5, 'admin.1', 'YWRtaW4uMQ==', '2023-05-12', '1', '1', '1');
INSERT INTO nma.usuario (id_usuario, nombre_usuario, contraseña_usuario, fecha_alta, cliente_id_empresa, persona_run_persona, rol_id_rol) VALUES (1, 'cliente.1', 'Y2xpZW50ZS4x', '2023-05-12', '2', '2', '2');
INSERT INTO nma.usuario (id_usuario, nombre_usuario, contraseña_usuario, fecha_alta, cliente_id_empresa, persona_run_persona, rol_id_rol) VALUES (3, 'profesional.1', 'cHJvZmVzaW9uYWwuMQ==', '2023-05-12', '3', '3', '3');

INSERT INTO nma.visita (fecha_visita, descripcion_visita, nombre_profesional, estado, persona_run_persona, id_visita, id_empresa) VALUES ('2023-05-29', 'Visita Prueba', 'Profesional 1', 'A', '92970696-k', 1, '5');
