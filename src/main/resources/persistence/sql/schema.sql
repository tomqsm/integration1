CREATE TABLE inputarchive(
    id      NUMBER PRIMARY KEY,
    json    VARCHAR2(3500),
    source  VARCHAR2(10) CHECK (source IN ('OPUSL', 'PEGAZ', 'ABS', 'UNKNOWN')),
    ts      timestamp
);
CREATE SEQUENCE  inputarchive_seq  MINVALUE 1 INCREMENT BY 1 START WITH 1 CACHE 100;
UPDATE inputarchive SET id = inputarchive_seq.nextval;
