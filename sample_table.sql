CREATE TABLE `sample`.`notice`
(
    `idx`         INT         NOT NULL AUTO_INCREMENT,
    `author`      INT         NOT NULL,
    `title`       VARCHAR(45) NOT NULL,
    `content`     VARCHAR(2000) NULL,
    `create_date` DATE NULL,
    `update_date` VARCHAR(45) NULL,
    PRIMARY KEY (`idx`)
);
