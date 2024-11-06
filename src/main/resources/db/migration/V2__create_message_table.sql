CREATE TABLE if NOT EXISTS message(
    id                VARCHAR(36) CONSTRAINT message_id_pk PRIMARY KEY DEFAULT gen_random_uuid(),
    content           VARCHAR(255),
    created_at        TIMESTAMP WITH TIME ZONE NOT NULL,
    version           bigint NOT NULL
);
