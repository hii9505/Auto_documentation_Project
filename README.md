<h2> DB Engineering Project  출퇴근 문서 자동화</h2>

-------



1. 환경

|        | 버전       |
| ------ | ---------- |
| JSP    |            |
| Tomcat | 9.0        |
| Oracle | 11.2.0.2.0 |
| jdbc   | ojdbc6     |



* 데이터베이스 계정 생성

  [데이터베이스 sql문](https://github.com/Richsea/Auto_documentation_Project/blob/main/database.sql)

>sqlplus "/as sysdba"
>
>> CREATE USER class4 identified by 1234;
>>
>> GRANT CONNECT, RESOURCE, DBA TO class4;



* Java build path 설정
  1. property - Java Build Path - add - servlet-api.jar
  2. property - Java Build Path - add - ojdbc6.jar
  3. property - Deployment Assembly - add - Java Build Path Entries - ojdbc6.jar



* 시작
  * index.jsp로 시작

