<h2> DB Engineering Project  출퇴근 문서 자동화</h2>

-------



1. 환경

|        | 버전       |
| ------ | ---------- |
| JSP    |            |
| Tomcat | 9.0        |
| Oracle | 11.2.0.2.0 |



* 데이터베이스 계정 생성

  [데이터베이스 sql문] : (https://github.com/Richsea/Auto_documentation_Project/blob/main/database.sql)

>sqlplus "/as sysdba"
>
>> CREATE USER class4 identified by 1234;
>> GRANT CONNECT, RESOURCE, DBA TO class4;

