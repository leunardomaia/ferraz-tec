
CREATE SCHEMA IF NOT EXISTS `ferrazTec` DEFAULT CHARACTER SET utf8 ;
USE `ferrazTec` ;

-- -----------------------------------------------------
-- Table `ferrazTec`.`atendente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`atendente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) CHARACTER SET 'utf8' NOT NULL,
  `telefone` VARCHAR(30) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`produto` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `descricao` VARCHAR(200) NOT NULL,
  `quantidade` INT NOT NULL,
  `preco` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`cliente` (
  `id` INT NOT NULL,
  `nome` VARCHAR(60) NOT NULL,
  `telefone` VARCHAR(30) NOT NULL,
  `cpf` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `telefone_UNIQUE` (`telefone` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`atendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`atendimento` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `dataHoraAtendimento` DATETIME NOT NULL,
  `cliente_id` INT NOT NULL,
  `atendente_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_venda_cliente1_idx` (`cliente_id` ASC),
  INDEX `fk_atendimento_atendente1_idx` (`atendente_id` ASC),
  CONSTRAINT `fk_venda_cliente1`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `ferrazTec`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_atendimento_atendente1`
    FOREIGN KEY (`atendente_id`)
    REFERENCES `ferrazTec`.`atendente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`mao_obra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`mao_obra` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `dataHora` DATETIME NOT NULL,
  `preco` DECIMAL(10,2) NOT NULL,
  `descricao` VARCHAR(200) NULL,
  `atendimento_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_mao_obra_atendimento1_idx` (`atendimento_id` ASC),
  CONSTRAINT `fk_mao_obra_atendimento1`
    FOREIGN KEY (`atendimento_id`)
    REFERENCES `ferrazTec`.`atendimento` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`usuario` (
  `idusuario` INT NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `atendente_id` INT NOT NULL,
  PRIMARY KEY (`idusuario`),
  INDEX `fk_usuario_atendente1_idx` (`atendente_id` ASC),
  CONSTRAINT `fk_usuario_atendente1`
    FOREIGN KEY (`atendente_id`)
    REFERENCES `ferrazTec`.`atendente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ferrazTec`.`venda_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ferrazTec`.`venda_produto` (
  `produto_id` INT UNSIGNED NOT NULL,
  `atendimento_id` INT UNSIGNED NOT NULL,
  `quantidade` INT NOT NULL,
  `precoVenda` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`produto_id`, `atendimento_id`),
  INDEX `fk_produto_has_atendimento_atendimento1_idx` (`atendimento_id` ASC),
  INDEX `fk_produto_has_atendimento_produto1_idx` (`produto_id` ASC),
  CONSTRAINT `fk_produto_has_atendimento_produto1`
    FOREIGN KEY (`produto_id`)
    REFERENCES `ferrazTec`.`produto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_produto_has_atendimento_atendimento1`
    FOREIGN KEY (`atendimento_id`)
    REFERENCES `ferrazTec`.`atendimento` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


dshbhfb
dvsdfkhvbad
sdvadu
sdvfdjb
sdvndfn