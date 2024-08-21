CREATE TABLE `t_blogs`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `title`       varchar(255) DEFAULT NULL,
    `content`     text,
    `created_at`  datetime DEFAULT NULL,
    `updated_at`  datetime DEFAULT NULL,
     `author`     varchar(255) DEFAULT NULL,
     `tags`       varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
)

