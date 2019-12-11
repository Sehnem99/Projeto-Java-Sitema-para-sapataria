SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP DATABASE IF EXISTS SHOEMAKER;

CREATE DATABASE IF NOT EXISTS `SHOEMAKER` 
DEFAULT 
CHARACTER SET utf8 
COLLATE utf8_general_ci;

USE `SHOEMAKER` ;


CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`CLIENTES` (
  `COD_CLIENTE` INT NOT NULL AUTO_INCREMENT,
  `NOME_CLIENTE` VARCHAR(45) NOT NULL,
  `CONTATO` VARCHAR(15) NULL,
  `CPF` VARCHAR(15) NOT NULL,
  `DATA_NASC` VARCHAR(15) NULL,
  `CEP` INT NULL,
  `LOGRADOURO` VARCHAR(45) NULL,
  `BAIRRO` VARCHAR(45) NULL,
  `CIDADE` VARCHAR(45) NULL,
  `UF` VARCHAR(45) NULL,
  `ATIVO` INT(1) NULL,
  NUM INT NULL,
  PRIMARY KEY (`COD_CLIENTE`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TIPOS_SAPATO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`TIPOS_SAPATO` (
  `COD_TIPO_SAPATO` INT NOT NULL AUTO_INCREMENT,
  `NOME_TIPO_SAPATO` VARCHAR(45) NULL,
  PRIMARY KEY (`COD_TIPO_SAPATO`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`COR_SAPATO` (
  `COD_COR_SAPATO` INT NOT NULL AUTO_INCREMENT,
  `NOME_COR_SAPATO` VARCHAR(45) NULL,
  PRIMARY KEY (`COD_COR_SAPATO`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `mydb`.`SAPATO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`SAPATO` (
  `COD_SAPATO` INT NOT NULL AUTO_INCREMENT,
  `COD_CLIENTE` INT NOT NULL,
  `COD_TIPO_SAPATO` INT NOT NULL,
  `COD_COR_SAPATO` INT NOT NULL, 
  `NUMERO` VARCHAR(5) NULL,
  `MARCA` VARCHAR(45) NULL,
  `CONSERTO` VARCHAR(45) NULL,
  `DATA_ENTRADA` DATE NOT NULL,
  `DATA_SAIDA` DATE NULL,
  `VALOR` DECIMAL(10,2) NULL,
  PRIMARY KEY (`COD_SAPATO`),
  INDEX `fk_SAPATO_CLIENTES_idx` (`COD_CLIENTE` ASC),
  INDEX `fk_SAPATO_TIPOS_SAPAT_idx` (`COD_TIPO_SAPATO` ASC),
  INDEX `fk_SAPATO_COR_SAPATO_idx` (`COD_COR_SAPATO` ASC),
  
  CONSTRAINT `fk_SAPATO_CLIENTES`
    FOREIGN KEY (`COD_CLIENTE`)
    REFERENCES `SHOEMAKER`.`CLIENTES` (`COD_CLIENTE`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    
  CONSTRAINT `fk_SAPATO_TIPOS_SAPATO`
    FOREIGN KEY (`COD_TIPO_SAPATO`)
    REFERENCES `SHOEMAKER`.`TIPOS_SAPATO` (`COD_TIPO_SAPATO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
 
 CONSTRAINT `fk_SAPATO_COR_SAPATO`
    FOREIGN KEY (`COD_COR_SAPATO`)
    REFERENCES `SHOEMAKER`.`COR_SAPATO` (`COD_COR_SAPATO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)    

ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`VENDAS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`VENDAS` (
  `COD_VENDA` INT NOT NULL AUTO_INCREMENT,
  `COD_SAPATO` INT NOT NULL,
  `VALOR_FINAL` DECIMAL(10,2) NOT NULL,
  `DATA_PAGAMENTO` DATE NULL,
  PRIMARY KEY (`COD_VENDA`),
  INDEX `fk_VENDAS_SAPATO_idx` (`COD_SAPATO` ASC),
  CONSTRAINT `fk_VENDAS_SAPATO`
    FOREIGN KEY (`COD_SAPATO`)
    REFERENCES `SHOEMAKER`.`SAPATO` (`COD_SAPATO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `mydb`.`TIPOS_ACESSO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`TIPOS_ACESSO` (
  `COD_TIPO_ACESSO` INT NOT NULL AUTO_INCREMENT,
  `TIPO_ACESSO` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`COD_TIPO_ACESSO`))
ENGINE = InnoDB;

INSERT INTO TIPOS_ACESSO (TIPO_ACESSO)
VALUES ('ADMINISTRADOR');

-- -----------------------------------------------------
-- Table `mydb`.`USUARIOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`USUARIOS` (
  `COD_USUARIO` INT NOT NULL AUTO_INCREMENT,
  `LOGIN` VARCHAR(45) NOT NULL,
  `SENHA` VARCHAR(45) NOT NULL,
  `COD_TIPO_ACESSO` INT NOT NULL,
  PRIMARY KEY (`COD_USUARIO`),
  INDEX `fk_USUARIOS_TIPOS_ACESSO1_idx` (`COD_TIPO_ACESSO` ASC),
  CONSTRAINT `fk_USUARIOS_TIPOS_ACESSO1`
    FOREIGN KEY (`COD_TIPO_ACESSO`)
    REFERENCES `SHOEMAKER`.`TIPOS_ACESSO` (`COD_TIPO_ACESSO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO USUARIOS(LOGIN,SENHA,COD_TIPO_ACESSO)
VALUES ('Eduardo','TESTE','1'),
('Matheus','TESTE','1'),
('Gabriel','TESTE','1');


-- -----------------------------------------------------
-- Table `mydb`.`ALTERACOES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`ALTERACOES` (
  `COD_ALTERACAO` INT NOT NULL,
  `COD_VENDA` INT NOT NULL,
  `DESCRICAO_ALTERACAO` LONGTEXT NOT NULL,
  PRIMARY KEY (`COD_ALTERACAO`),
  INDEX `fk_ALTERACOES_VENDAS1_idx` (`COD_VENDA` ASC),
  CONSTRAINT `fk_ALTERACOES_VENDAS1`
    FOREIGN KEY (`COD_VENDA`)
    REFERENCES `SHOEMAKER`.`VENDAS` (`COD_VENDA`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `SHOEMAKER`.`DESPESA` (
  `COD_DESPESA` INT NOT NULL,
  `DESCRICAO_DESPESA` VARCHAR(45) NOT NULL,
  `VALOR` DECIMAL(10,2) NOT NULL,
  `DATA_CADASTRO` datetime NULL,
  PRIMARY KEY ( `COD_DESPESA`)
)ENGINE = InnoDB;

INSERT INTO tipos_sapato
VALUES (1, 'Alpargata'),
(2, 'Bota Feminina'),
(3,'Bota Masculina'),
(4,'Chinelo'),
(5,'Chuteira'),
(6,'Coturno'),
(7,'Galocha'),
(8,'Mocassim'),
(9,'Sandália Feminina'),
(10,'Sandália Masculina'),
(11,'Sapatênis'),
(12,'Sapato Feminino'),
(13,'Sapato Masculino'),
(14,'Sapatilha'),
(15,'Tamanco'),
(16,'Tênis Feminino'),
(17,'Tênis Masculino');

INSERT INTO COR_SAPATO
VALUES (1, 'Amarelo'),
(2, 'Azul'),
(3, 'Bege'),
(4, 'Branco'),
(5, 'Cinza'),
(6, 'Marrom'),
(7, 'Preto'),
(8, 'Rosa'),
(9, 'Roxo'),
(10, 'Verde'),
(11, 'Vermelho');




