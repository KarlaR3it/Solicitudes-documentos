USE `portal_empleos`;

INSERT INTO solicitudes (titulo, estado, area, pais, localizacion, num_vacantes, descripcion, base_educ, conocim_excluyente, renta_desde, renta_hasta, mod_trabajo, tipo_servicio, nivel_experien, fecha_ini_proyecto, usuario_id)
VALUES 
    ('Desarrollador Backend Java', 'Abierta', 'Tecnología', 'Chile', 'Santiago', 2, 'Me interesa postular a esta oferta. Tengo 5 años de experiencia con Spring Boot y microservicios', 'Ingeniería en Computación', 'Java, Spring Boot, MySQL, Docker', 1800000, 2500000, 'Híbrido', 'Proyecto Interno', 'Senior', '2025-11-01', 1),
    
    ('Analista QA', 'Pendiente', 'Tecnología', 'Chile', 'Valparaíso', 1, 'Quisiera postular a esta posición. Tengo experiencia en automatización de pruebas y me interesa el trabajo remoto', 'Ingeniería en Informática', 'Selenium, Java, TestNG, Cucumber', 1200000, 1800000, 'Remoto', 'Outsourcing', 'Semi Senior', '2025-10-15', 2),
    
    ('Arquitecto de Software', 'Abierta', 'Tecnología', 'Chile', 'Las Condes', 1, 'Me entusiasma la oportunidad de liderar proyectos. Cuento con amplia experiencia en arquitectura de software', 'Ingeniería Civil en Computación', 'AWS, Microservicios, Kubernetes, Java', 3000000, 4000000, 'Presencial', 'Proyecto Interno', 'Senior', '2025-12-01', 3),
    
    ('Desarrollador Frontend React', 'Pendiente', 'Tecnología', 'Chile', 'Providencia', 2, 'Me interesa la oferta laboral. Tengo 3 años de experiencia en React y desarrollo frontend', 'Ingeniería en Software', 'React, TypeScript, Redux, CSS', 1500000, 2200000, 'Híbrido', 'Outsourcing', 'Semi Senior', '2025-11-15', 4),
    
    ('DevOps Engineer', 'Abierta', 'Tecnología', 'Chile', 'Vitacura', 1, 'Estoy interesado en la posición. Tengo experiencia en AWS y CI/CD que podría aportar al equipo', 'Ingeniería en Sistemas', 'AWS, Docker, Jenkins, Terraform', 2500000, 3500000, 'Remoto', 'Proyecto Interno', 'Senior', '2025-12-15', 5);


INSERT INTO documentos (extension, nombre_archivo, solicitud_id)
VALUES 
    ('pdf', 'CV_Juan_Desarrollador', 1),
    ('docx', 'CV_Ana_QA', 2),
    ('pdf', 'CV_Pedro_Frontend', 3);   
