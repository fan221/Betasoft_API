-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: betawebdb0
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id_curso` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `id_instructor` bigint DEFAULT NULL,
  PRIMARY KEY (`id_curso`),
  KEY `FKqjnb59pdu6ufhtgsevriucmaw` (`id_instructor`),
  CONSTRAINT `FKqjnb59pdu6ufhtgsevriucmaw` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Crea un software profesional en desarrollo web con php, html 5,\n    material design y bases de datos de cero a experto','Ingenieria de software','https://i.imgur.com/GYNgOfm.jpg',1),(2,'Entrenamiento especializado y practico','Informatica forence','https://escuelaselect.com/wp-content/uploads/informatica-forense.jpg',2),(3,'¡Hazte un experto! Aprende tecnicas avanzadas de programacion','Programacion avanzada','https://i.ytimg.com/vi/SzlYjn0gLxw/maxresdefault.jpg',3),(4,'Formación completa en ciencia de datos: Matemáticas, Estadística, Python, \n Estadística Avanzada, Aprendizaje Automático','Ciencia de datos','https://i.imgur.com/GYNgOfm.jpg',4),(5,'Matemáticas, Estadística, Estadística Avanzada','Datawarehouse','https://i.imgur.com/GYNgOfm.jpg',4),(6,'Context API, MERN, Hooks, Firestore, JWT, Testing, Autenticaciones, Despliegues, CRUD, Logs, SASS, Multiple Routers...','React: De cero a experto ( Hooks y MERN )','https://img-c.udemycdn.com/course/240x135/3096364_6113_3.jpg',5),(7,'Rest, despliegues, Heroku, Mongo, Git, GitHub, Sockets, archivos, JWT y mucho más para ser un experto en Node','Node: De cero a experto ( Edición 2021 )','https://img-c.udemycdn.com/course/240x135/1562070_d426_2.jpg',5),(8,'Aprende con el mejor curso Java desde cero usando las mejores prácticas de desarrollo incluye Java EE 9, JPA, Web y más','Máster Completo en Java de cero a experto 2021 (+108 hrs)','https://img-c.udemycdn.com/course/240x135/3078492_1a27_2.jpg',6),(9,'El Curso que te enseña como hacer cualquier Aplicación o Sitio web desde 0 con PHP y MYSQL','PHP 8 y MYSQL: El Curso Completo, Práctico y Desde Cero !','https://img-c.udemycdn.com/course/240x135/672600_1def_7.jpg',7),(10,'Aprende Desarrollo Web con este curso 100% práctico, paso a paso y sin conocimientos previos, INCLUYE PROYECTO FINAL','Desarrollo Web Completo con HTML5, CSS3, JS AJAX PHP y MySQL','https://img-c.udemycdn.com/course/240x135/980450_7fc0_3.jpg',8),(11,'Crea un software profesional en desarrollo web con php, html 5,\r\n    material design y bases de datos de cero a experto','Ingenieria de software','https://i.imgur.com/GYNgOfm.jpg',1),(12,'El objetivo de este curso es convertirse en un desarrollador full stack en Java y React','Fullstack Java y React','https://img-c.udemycdn.com/course/240x135/3657264_4270_2.jpg',9),(13,'Push, Cámara, Mapas, REST API, SQLite, CRUD, Tokens, Storage, Preferencias de usuario, PlayStore, AppStore, Bloc y más!','Flutter: Tu guía completa de desarrollo para IOS y Android','https://img-c.udemycdn.com/course/240x135/2306140_8181.jpg',5),(14,'Aprende a crear cualquier sitio web adaptable a dispositivos móviles con Boostrap 5, el mejor framework de diseño web','Bootstrap 5: El Curso Completo, Práctico y Desde Cero','https://img-c.udemycdn.com/course/240x135/1245130_efdb_10.jpg',7),(15,'En este curso aprenderás desde las bases hasta POO en Python Versión 3. Empieza a Aprender ya Mismo de forma Gratuita.','Master en Python 3.x. Aprende de 0 a EXPERTO con Práctica','https://img-c.udemycdn.com/course/240x135/2297910_788e_2.jpg',10),(16,'El objetivo de este curso es generar un espacio para aprender logica, algoritmos y estructuras de datos en javascript','Estructuras de datos y logica en Javascript','https://img-c.udemycdn.com/course/240x135/3694466_c5db_5.jpg',11),(24,'lejos','pruebaCurso','Bad Request',1),(25,'lejos','pruebaCurso','Bad Request',1),(26,'Pruebaaaa','Curso pruebaaa','asdfgg',1);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `id_estudiante` bigint NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'Jean Pool Mauricio Alcon','jeanpool@gmail.com'),(2,'Mariela Fernandez Real','marielafer@gmail.com'),(3,'Savina Marza Ayma','savinmar@gmail.com'),(4,'Rodrigo Gandarillas Heredia','rodrigogandal@gmail.com'),(5,'Vilma Mamani Flores','vilmamani@gmail.com'),(6,'Briza Marcia Lafuente Paniagua','brizamarcia@gmail.com'),(7,'Gary soliz','gary12@gmail.com'),(8,'Iván Cáceres Flores','ivan123ca@gmail.com'),(9,'Sharon Cusi Limachi','sharon43cu@gmail.com'),(10,'Eddy Montaño LóPez','eddy21mon@gmail.com'),(11,'Efrain Edwin Navia Luna','efrain56na@gmail.com'),(12,'Samuel Elías Rojas Nogales','samuel34rn@gmail.com'),(13,'Ivan Elvis Martinez Achata','ivan77ma@gmail.com'),(14,'David Ismael Angulo Andrade','david55aa@gmail.com'),(15,'Jhanneth Zeballos Flores','jhanneth66zf@gmail.com'),(16,'Pablo Saul Apaza Maguiña','pablo12am@gmail.com'),(17,'Pedro Marquez Quiroz','pedro88mq@gmail.com'),(18,'Shafira Naomi Padro Hinojosa','naomi60ph@gmail.com'),(19,NULL,'');

--------------------------------------------------------------------------------------------------------------------
INSERT INTO `estudiante` 
VALUES (1,'Jean Pool','Mauricio', 'Alcon','jeanpool@gmail.com'),
(2,'Mariela','Fernandez,' ,'Real','marielafer@gmail.com'),
(3,'Savina', 'Marza','Ayma','savinmar@gmail.com'),
(4,'Rodrigo','Gandarillas','Heredia','rodrigogandal@gmail.com'),
(5,'Vilma', 'Mamani', 'Flores','vilmamani@gmail.com'),
(6,'Briza','Marcia','Lafuente Paniagua','brizamarcia@gmail.com'),
(7,'Gary', 'Soliz','Martinez','gary12@gmail.com'),
(8,'Iván','Cáceres',' Flores','ivan123ca@gmail.com'),
(9,'Sharon','Cusi', 'Limachi','sharon43cu@gmail.com'),
(10,'Eddy','Montaño','LóPez','eddy21mon@gmail.com'),
(11,'Efrain Edwin','Navia', 'Luna','efrain56na@gmail.com');
---------------------------------------------------------------------------------------------------------------------
 insert into inscripcion(id_inscripcion,estado,id_curso,id_estudiante)
 values(1, 'ir al curso',1,1);
  insert into inscripcion(id_inscripcion,estado,id_curso,id_estudiante)
 values(2, 'ir al curso',1,2);
  insert into inscripcion(id_inscripcion,estado,id_curso,id_estudiante)
 values(3, 'ir al curso',1,3);
  insert into inscripcion(id_inscripcion,estado,id_curso,id_estudiante)
 values(4, 'ir al curso',2,1);
 --------------------------------------------------------------------------------------------------------------------
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instructor` (
  `id_instructor` bigint NOT NULL AUTO_INCREMENT,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `celular` int NOT NULL,
  `ci` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor`
--

LOCK TABLES `instructor` WRITE;
/*!40000 ALTER TABLE `instructor` DISABLE KEYS */;
INSERT INTO `instructor` VALUES (1,'Camacho','Castillo',76921504,872022,'indira@gmail.com','Indira'),(2,'Baptista','Lopez',76908504,22322,'juan@gmail.com','Juan'),(3,'Meneses','Reinaga',73448504,91122,'marcelo@gmail.com','Marcelo'),(4,'Meneses','Cartagena',6448504,41122,'ruben@gmail.com','Ruben'),(5,'Lopez','Herrera',63658214,412365,'herrera@gmail.com','Fernando'),(6,'Gonzales','Guzman',76923658,4420145,'guzman@gmail.com','Andres José'),(7,'Montaño','Esparza',69521457,6632658,'esparza@gmail.com','Carlos Arturo'),(8,'Valdez','de la Torre',75963254,4412589,'valdez@gmail.com','Juan Pablo'),(9,'Maigua','Peñaloza',76998562,8814205,'maigua@gmail.com','Jhonatan'),(10,'Chavez','Chirou',62365987,4407006,'chirou@gmail.com','Alvaro'),(11,'Aguilar','Sire',71425698,8814578,'sire@gmail.com','Damian');
/*!40000 ALTER TABLE `instructor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` bigint NOT NULL AUTO_INCREMENT,
  `passwd` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `id_instructor` bigint DEFAULT NULL,
  `id_estudiante` bigint DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FKru36s3e0nynlerk2slt7pvnft` (`id_instructor`),
  KEY `FKioi8amqjetmdancxlqdudlje6` (`id_estudiante`),
  CONSTRAINT `FKioi8amqjetmdancxlqdudlje6` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`),
  CONSTRAINT `FKru36s3e0nynlerk2slt7pvnft` FOREIGN KEY (`id_instructor`) REFERENCES `instructor` (`id_instructor`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'1234abc','indira',1,NULL),(2,'2232acc','juan',2,NULL),(3,'4433aacb','marcelo',3,NULL),(4,'2233cb','ruben',4,NULL),(5,'123abcc','fernando',5,NULL),(6,'222abcc','andresJose',6,NULL),(7,'333aacc','CarlosArturo',7,NULL),(8,'jean12','jeanPool',NULL,1),(9,'mariela123','mariela',NULL,2),(10,'savi123','savina',NULL,3),(11,'rodrigo123','rodrigo',NULL,4),(12,'vilma12','vilma',NULL,5),(14,'gary123','gary',NULL,7),(15,'briza123','brizaMarcia',NULL,6),(16,'ivan123','ivan',NULL,8),(17,'sharon123','sharon',NULL,9),(18,'eddy123','eddy',NULL,10),(19,'efrain123','efrainEdwin',NULL,11),(20,'samuel123','samuelElías',NULL,12),(21,'ivan123','ivanElvis',NULL,13),(22,'david123','davidIsmael',NULL,14),(23,'jhane123','jhanneth',NULL,15),(24,'pablo123','pabloSaul',NULL,16),(25,'pedro123','pedro',NULL,17),(26,'naomi123','naomi',NULL,18);
--------------------------------------------------------------------------------------------------
INSERT INTO `usuario` 
VALUES (8,'jean12','jeanPool',NULL,1),
(9,'mariela123','mariela',NULL,2),
(10,'savi123','savina',NULL,3),
(11,'rodrigo123','rodrigo',NULL,4),
(12,'vilma12','vilma',NULL,5),
(14,'gary123','gary',NULL,7);
-----------------------------------------------------------------------------------------------------
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-06 14:14:12
