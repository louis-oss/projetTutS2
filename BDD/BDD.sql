-- MySQL Script generated by MySQL Workbench
-- Wed Jan  8 08:52:09 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Prospecte`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`devis` ;




-- -----------------------------------------------------
-- Table `mydb`.`Client`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Client` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Client` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`Technicien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Technicien` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Technicien` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NOT NULL,
  `coutHoraire` decimal(8,2),
  `grade` varchar(45),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`commercial`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`commercial` ;

CREATE TABLE IF NOT EXISTS `mydb`.`commercial` (
  `id` INT NOT NULL,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NOT NULL,
  `pourcentage` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`prospecte`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`prospecte` ;

CREATE TABLE IF NOT EXISTS `mydb`.`prospecte` (
  `IDcommercial` INT NOT NULL,
  `IDClient` INT NOT NULL,
  `dateRV` DATE NULL,
  `modif` VARCHAR(45) NULL,
  PRIMARY KEY (`IDcommercial`, `IDClient`),
  CONSTRAINT `fk_commercial_has_Client_commercial`
    FOREIGN KEY (`IDcommercial`)
    REFERENCES `mydb`.`commercial` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_commercial_has_Client_Client1`
    FOREIGN KEY (`IDClient`)
    REFERENCES `mydb`.`Client` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`devis`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `mydb`.`devis` (
    `num` INT NOT NULL PRIMARY KEY,
    `nom` VARCHAR(45) NOT NULL,
    `montant` DECIMAL(8 , 2 ) NOT NULL,
    `dateProp` DATE NOT NULL,
    `dateSignature` DATE NOT NULL,
    `modif` VARCHAR(45) NOT NULL,
    `clientID` int not null,
    `projetID` int not null,
      CONSTRAINT `fk_devisClient`
    FOREIGN KEY (`clientID`)
    REFERENCES `mydb`.`client` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_devisProjet`
    FOREIGN KEY (`projetID`)
    REFERENCES `mydb`.`projet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)  ENGINE=INNODB;


-- -----------------------------------------------------
-- Table `mydb`.`Facture`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Facture` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Facture` (
  `num` INT NOT NULL,
  `numDevis` int,
  PRIMARY KEY (`num`),
    CONSTRAINT `fk_factureDevis`
    FOREIGN KEY (`numDevis`)
    REFERENCES `mydb`.`devis` (`num`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `mydb`.`Matériel_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Matériel_type` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Matériel_type` (
  `ID` INT NOT NULL,
  `nom` varchar(45),
  PRIMARY KEY (`ID`)
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Matériel`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Matériel` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Matériel` (
  `ID` INT NOT NULL,
  `nom` varchar(45),
  `IDType` int,
  PRIMARY KEY (`ID`),
    CONSTRAINT `fk_matérielMatériel_type`
    FOREIGN KEY (`IDtype`)
    REFERENCES `mydb`.`matériel_type` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Projet`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Projet` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Projet` (
  `ID` INT NOT NULL,
  `commercialID` int,
  `nom` varchar(45) NOT NULL,
  `duréeEstimée` int,
  `duréeFinale` int,
  `statut` varchar(45),
  PRIMARY KEY (`ID`),
    CONSTRAINT `fk_projetCommercial`
    FOREIGN KEY (`commercialID`)
    REFERENCES `mydb`.`Commercial` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Nécessite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Nécessite` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Nécessite` (
  `projetID` INT NOT NULL,
  `matérielID` INT NOT NULL,
  `quantité` int,
  `dateCommande` date,
  `dateLivraison` date,
  `prixAchat` decimal(8,2),
  PRIMARY KEY (`projetID`, `matérielID`),
    CONSTRAINT `fk_nécessiteProjet`
    FOREIGN KEY (`projetID`)
    REFERENCES `mydb`.`Projet` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_nécessiteMatériel`
    FOREIGN KEY (`matérielID`)
    REFERENCES `mydb`.`Matériel` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Compétence`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Compétence` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Compétence` (
  `ID` INT NOT NULL,
  `nom` varchar(45),
  PRIMARY KEY (`ID`)
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Activité_type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Activité_type` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Activité_type` (
  `ID` INT NOT NULL,
  `nom` varchar(45) unique,
  PRIMARY KEY (`ID`)
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Activité`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Activité` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Activité` (
  `ID` INT NOT NULL,
  `duréePrévue` INT,
  `résumé` varchar(45),
   `détail` varchar(45),
  `statut` varchar(45) ,
  `IDType` int,
  `dateDébut` date default null,
  `dateFin` date default null,
  PRIMARY KEY (`ID`),
    CONSTRAINT `fk_activitéActivité_type`
    FOREIGN KEY (`IDType`)
    REFERENCES `mydb`.`activité_type` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Compose`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Compose` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Compose` (
  `projetID` INT NOT NULL,
  `activitéID` INT NOT NULL,
  PRIMARY KEY (`projetID`,`ActivitéID`),
    CONSTRAINT `fk_composeActivité`
    FOREIGN KEY (`activitéID`)
    REFERENCES `mydb`.`activité` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_composeProjet`
    FOREIGN KEY (`projetID`)
    REFERENCES `mydb`.`Projet` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Mobilise`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Mobilise` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Mobilise` (
  `compétenceID` INT NOT NULL,
  `activité_typeID` INT NOT NULL,
  PRIMARY KEY (`compétenceID`,`Activité_typeID`),
    CONSTRAINT `fk_mobiliseActivité_type`
    FOREIGN KEY (`activité_typeID`)
    REFERENCES `mydb`.`activité_type` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_mobiliseCompétence`
    FOREIGN KEY (`compétenceID`)
    REFERENCES `mydb`.`Compétence` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Affecté`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Affecté` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Affecté` (
  `technicienID` INT NOT NULL,
  `activitéID` INT NOT NULL,
  PRIMARY KEY (`technicienID`,`ActivitéID`),
    CONSTRAINT `fk_affectéActivité`
    FOREIGN KEY (`activitéID`)
    REFERENCES `mydb`.`activité` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_affectéTechnicien`
    FOREIGN KEY (`technicienID`)
    REFERENCES `mydb`.`technicien` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Possède`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Possède` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Possède` (
    `compétenceID` INT NOT NULL,
    `technicienID` INT NOT NULL,
    `niveau` VARCHAR(45),
    PRIMARY KEY (`technicienID` , `compétenceID`),
    CONSTRAINT `fk_possèdeCompétence` FOREIGN KEY (`compétenceID`)
        REFERENCES `mydb`.`compétence` (`ID`)
        ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT `fk_possèdeTechnicien` FOREIGN KEY (`technicienID`)
        REFERENCES `mydb`.`technicien` (`ID`)
        ON DELETE NO ACTION ON UPDATE NO ACTION
)
ENGINE = InnoDB;

CREATE INDEX `fk_commercial_has_Client_Client1_idx` ON `mydb`.`prospecte` (`IDClient` ASC);

CREATE INDEX `fk_commercial_has_Client_commercial_idx` ON `mydb`.`prospecte` (`IDcommercial` ASC);


-- --------------------------------------------------
-- Ajout AG pour les utilisateurs
-- --------------------------------------------------
DROP TABLE IF EXISTS  `mydb`.`Utilisateur`;

CREATE TABLE IF NOT EXISTS `mydb`.`Utilisateur` (
  ID INT NOT NULL,
  LOGIN VARCHAR(45) UNIQUE NOT NULL,
  PASSWORD VARCHAR(128),
  TYPE_UTILISATEUR VARCHAR(64),
  PRIMARY KEY(ID)
)ENGINE=InnoDB;

CREATE INDEX idx_login ON `mydb`.`Utilisateur` (LOGIN ASC);

ALTER TABLE `mydb`.`Client` 
ADD UTILISATEUR_ID INT,
add FOREIGN KEY(UTILISATEUR_ID) REFERENCES `mydb`.`Utilisateur`(ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `mydb`.`Technicien`
ADD UTILISATEUR_ID INT,
add FOREIGN KEY(UTILISATEUR_ID) REFERENCES `mydb`.`Utilisateur`(ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `mydb`.`commercial`
ADD UTILISATEUR_ID INT,
add FOREIGN KEY(UTILISATEUR_ID) REFERENCES `mydb`.`Utilisateur`(ID) ON DELETE RESTRICT ON UPDATE RESTRICT;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use mydb;
set sql_safe_updates=0;

delete from Utilisateur;

insert into Utilisateur 
values(1,'pmartin','746F746F','technicien'),
(2,'cmeunier','746F746F','technicien'),
(3,'ybenaissa','746F746F','technicien'),
(4,'sollivier','746F746F','technicien'),
(5,'sdjamel','746F746F','technicien'),
(6,'llandure','746F746F','technicien'),
(7,'gzilla','746F746F','technicien'),
(8,'bdemongeot','746F746F','technicien'),
(9,'jcouston','746F746F','technicien'),
(10,'fpieux','746F746F','technicien'),
(11,'gflayol','746F746F','commercial'),
(12,'cmeunier2','746F746F','commercial'),
(13,'jbringer','746F746F','commercial'),
(14,'gdespierres','746F746F','client'),
(15,'omeunier','746F746F','client'),
(16,'abandoni','746F746F','client'),
(17,'yqueffelec','746F746F','client'),
(18,'cmiossec','746F746F','client'),
(19,'llandure2','746F746F','client'),
(20,'jnkoula','746F746F','client'),
(21,'ljamot','746F746F','client'),
(22,'gollivier','746F746F','client'),
(23,'cdugue','746F746F','client'),
(24,'gdespierres2','746F746F','client'),
(25,'hclouzet','746F746F','client'),
(26,'jbrossard','','client'),
(27,'smayeur','','client'),
(28,'vpicard','','client'),
(29,'jlarochette','','client'),
(30,'amaigne','','client'),
(31,'ljamot2','','client'),
(32,'grond','','client'),
(33,'apopier','','client');

delete from compétence;
insert into compétence values (1,'développement C/C++/C#'),
(2, 'réseau'),
(3,'analyste cobol'),
(4,'méthode agile'),
(5, 'web'),
(6, 'maintenance'),
(7,'développement java'),
(8,'base de données');

delete from technicien;
insert into  technicien values (1,'Martin','Pierre',30,'junior',1),
(2,'Meunier','Charles',100,'senior',2),
(3,'Benaissa','Yasmina',30,'junior',3),
(4,'Ollivier','Sarah',50,'partner',4),
(5,'Djamel','Sabri',30,'junior',5),
(6,'Landuré','Ludovic',100,'junior',6),
(7,'Nzilla','Godefroy',30,'junior',7),
(8,'Demongeot','Benoit',50,'partner',8),
(9,'Couston','Jasmine',30,'junior',9),
(10,'Pieux','Fabien',30,'junior',10);

delete from activité_type;
insert into activité_type values 
(1,'développement'),
(2, 'déploiement'),
(3,'maintenance'),
(4,'solution innovante'),
(5, 'migration'),
(6, 'service après vente');

delete from commercial;
insert into  commercial values 
(1,'Flayol','Géraldine',5,11),
(2,'Meunier','Carlos',3,12),
(3,'Bringer','Julien',3,13);

delete from client;
insert into  client values 
(1,'Despierres','Gérard',14),
(2,'Meunier','Olivier',15),
(3,'Bandoni','Alice',16),
(4,'Queffelec','Yann',17),
(5, 'Miossec','Christophe',18),
(6,'Landuré','Ludovic',19),
(7,'Nkouka','Joseph',20),
(8,'Jamot','Loic',21),
(9,'Ollivier','Gaëlle',22),
(10,'Dugué','Corentin',23),
(11,'Despierres','Gaspard',24),
(12,'Clouzet','Henriette',25),
(13,'Brossard','Jean',26),
(14,'Mayeur','Suzette',27),
(15, 'Picard','Vincent',28),
(16,'Larochette','Jérémy',29),
(17,'Maigne','Adrien',30),
(18,'Jamot','Loic',31),
(19,'Rond','Guillaume',32),
(20,'Popier','Alexandre',33)
;

delete from matériel_type;
insert into matériel_type values (1,'périphérqiue'),
(2, 'analyse'),
(3,'maintenance électronique'),
(4,'support numérique'),
(5, 'pc'),
(6, 'tablette'),
(7,'logiciel')
;

delete from projet;
 insert into projet values
 (1,1,'smart city',500, 750, 'fini'),
 (2,2,'war gaming',200, NULL, ' en attente'),
 (3,1,'bitcoin',400,NULL , 'en cours'),
  (4,3,'siteWeb',500, 750, 'fini'),
 (5,2,'Entrprise 3.0',2000, NULL, ' en attente'),
 (6,1,'Try Me',400,NULL , 'en cours'),
  (7,1,'smart city',500, 750, 'fini'),
 (8,2,'dofus',2000, 1550, ' fini'),
 (9,1,'WoW',40000,NULL , 'en cours'),
  (10,1,'smart city',500, 750, 'fini'),
 (11,2,'site vitrine IUP',50, NULL, ' en attente'),
 (12,3,'innov''Dijon',1400,NULL , 'en cours')
 ;
 
 
 delete from devis;
 insert into devis values
 (1,'arnaque',50000, '2020-01-30', '2020-02-15','aucune',1, 11),
 (2,'tout beau tout nouveau',15000, '2020-07-30', '2020-05-17','application web ',2, 7),
 (3,'just for you',50000, '2020-02-15', '2020-07-21','aucune',5, 12),
  (4,'accroche',7000, '2020-05-01', '2020-11-01','nouveau langage',3, 4),
 (5,'attrape nigaud',12000,'2001-02-14', '2002-04-01','application web ',7, 6),
 (6,'try to catch me',500,'2020-12-07', '2020-07-01','nouveau langage',20, 1),
  (7,'sérieusement',50750, '2020-04-13', '2020-08-01','nouveau langage',19, 12),
 (8,'please stand up',12050, '2020-11-19', '2020-12-25','changement de lieu',13, 3),
 (9,'the real slim shady',0, '2020-07-01', '2020-07-02','application web ',15, 10),
  (10,'without me',25500, '2020-07-01', '2020-07-02','aucune',2, 7),
 (11,'candy store',45000, '2020-07-01', '2020-07-02','aucune',13, 12),
 (12,'innov''Dijon',11400,'2020-07-01', '2020-07-02','application web ',15, 9)
 ;
 
 delete from facture;
insert into facture values
(1,2),
(2, 3),
(3,4),
(4,5),
(5, 4),
(6, 6),
(7,8),
(8,10),
(9,4),
(10,7),
(11, 1),
(12, 12),
(13,11),
(14,10)
;


delete from matériel;
insert into matériel values 
(1,'souris',1),
(2, 'sas',2),
(3,'powerpoint',4),
(4,'asus',5),
(5, 'spark',2),
(6, 'windows',7),
(7,'vitrine intelligente',4),
(8, 'raspberry',3),
(9,'mamy choice',6),
(10,'mac',5),
(11, 'haut parleur',1),
(12, 'imprimante',1)
;

delete from possède;
insert into possède values
 (1,1,'simple'),
(2, 2,'intermédiaire'),
(3,4,'intermédiaire'),
(4,5,'simple'),
(5,2,'avancé'),
(5,7,'avancé'),
(7,4,'simple'),
(8,10,'simple'),
(7,8,'avancé'),
(3,6,'avancé'),
(1, 3,'simple'),
(4, 7,'avancé'),
(3,8,'intermédiaire'),
(4,10,'intermédiaire'),
(5, 3,'simple'),
(5, 9,'intermédiaire'),
(7,6,'simple'),
(8, 4,'simple')
;


delete from activité;
insert into activité values
 (1,250,'montée en compétence','du vent','prévue',1,null,null),
(2, 350,'solution technique innovante','du mistral','terminée',2,null,null),
(3,0,'révolution numérique','asimov avait raison','en cours',4,null,null),
(4,10,'optimisation de l''existant', 'pas de sous','prévue',5,null,null),
(5,25,'intelligence artificielle','Au royaume des aveugles','annulée',3,null,null)
;

delete from affecté;
insert into affecté values
 (1,1),
(3, 2),
(3,4),
(4,5),
(7,5),
(8,5),
(9,4),
(6,4),
(10,1),
(2,1)
;

delete from compose;
insert into compose values
 (1,1),
(3, 2),
(3,4),
(4,5),
(7,5),
(8,5),
(9,4),
(6,4),
(10,3),
(12,1),
 (1,5),
(1, 2),
(1,3),
(1,4),
(7,4)
;


delete from prospecte;
insert into prospecte values
 (1,1,'2019-06-01','premier contact'),
(3, 2,'2019-11-01','premier contact'),
(1,4,'2020-06-01','harcélement'),
(2,5,'2020-01-01','coptation'),
(1,15,'2019-07-01','premier contact'),
(3,5,'2019-08-01','coptation'),
(1,14,'2020-02-15','premier contact'),
(2,4,'2019-03-28','coptation'),
(1,13,'2019-12-21','premier contact'),
(2,11,'2019-12-13','premier contact'),
 (1,9,'2019-10-14','coptation'),
(1, 19,'2020-04-05','coptation'),
(3,19,'2020-07-09','harcélement'),
(3,20,'2020-03-01','premier contact'),
(1,8,'2019-05-01','premier contact')
;

delete from nécessite;
insert into nécessite values
 (1,1,5,'2019-06-01','2019-08-01',150),
(2, 2,1,'2019-11-01','2020-06-01',250),
(3,4,1,'2020-06-01','2020-06-01',150),
(4,5,1,'2020-01-01','2020-06-11',156),
(5,10,3,'2019-07-01','2019-07-01',850),
(6,6,2,'2019-08-01','2019-08-06',45),
(7,10,0,'2020-02-15','2020-02-14',140),
(8,7,1,'2019-03-28','2019-06-01',0),
(9,3,4,'2019-12-21','2019-12-21',150),
(12,11,20,'2019-12-13','2019-12-14',10000),
 (11,9,5,'2019-10-14','2020-02-01',360),
(1, 9,3,'2020-04-05','2020-07-28',450),
(3,11,1,'2020-07-09','2020-11-18',3000),
(4,2,15,'2020-03-01','2020-06-15',250),
(3,8,5,'2019-05-01','2019-06-17',125)
;