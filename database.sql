sqlplus "/as sysdba"
CREATE USER class4 identified by 1234;
GRANT CONNECT, RESOURCE, DBA TO class4;