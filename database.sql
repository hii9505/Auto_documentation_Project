``` create database account ```

sqlplus "/as sysdba"
CREATE USER class4 identified by 1234;
GRANT CONNECT, RESOURCE, DBA TO class4;

```#########################```
``` Login ```
CREATE TABLE login
(
    id VARCHAR2(10) PRIMARY KEY,
    pw VARCHAR2(15),
    name VARCHAR2(10),
    email VARCHAR2(20),
    isadmin NUMBER(1) CONSTRAINT boolean_verified_check CHECK(isadmin IN (0, 1)),
);

``` emp ```
CREATE TABLE emp
(
    name VARCHAR2(10) PRIMARY KEY,
    empno VARCHAR2(3),
    manager VARCHAR2(5) NOT NULL
);

``` private_info ```
CREATE TABLE private_info
(
    empno VARCHAR2(7) PRIMARY KEY,
    name VARCHAR2(10) NOT NULL,
    emp VARCHAR2(15),
    position VARCHAR2(6) DEFAULT '사원',
    phone NUMBER(11),
    entryDate DATE,
    id VARCHAR2(10) UNIQUE NOT NULL
);

``` work_status ```
CREATE TABLE work_status
(
    empno VARCHAR2(7) PRIMARY KEY,
    workhour NUMBER(2) DEFAULT 0,
    situation VARCHAR2(6) DEFAULT '퇴근',
    start_time DATE,
    end_time DATE
);

COMMIT;