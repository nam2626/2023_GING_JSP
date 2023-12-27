--------------------------------------------------------
--  파일이 생성됨 - 수요일-12월-27-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MAJOR
--------------------------------------------------------

  CREATE TABLE "MAJOR" 
   (	"MAJOR_NO" NUMBER, 
	"MAJOR_NAME" VARCHAR2(50 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "STUDENT" 
   (	"STD_NO" CHAR(8 BYTE), 
	"STD_NAME" VARCHAR2(30 BYTE), 
	"STD_SCORE" NUMBER(3,2), 
	"GENDER" CHAR(1 BYTE) DEFAULT 'M', 
	"MAJOR_NO" NUMBER
   ) ;
--------------------------------------------------------
--  DDL for Table STUDENT_SCHOLARSHIP
--------------------------------------------------------

  CREATE TABLE "STUDENT_SCHOLARSHIP" 
   (	"SCHOLARSHIP_NO" NUMBER, 
	"STD_NO" CHAR(8 BYTE), 
	"MONEY" NUMBER
   ) ;
REM INSERTING into MAJOR
SET DEFINE OFF;
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (1,'컴퓨터공학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (2,'생물학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (3,'경제학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (4,'컴퓨터 과학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (5,'경영학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (6,'생활체육학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (7,'게임학과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (8,'실용음악과');
Insert into MAJOR (MAJOR_NO,MAJOR_NAME) values (9,'테스트1');
REM INSERTING into STUDENT
SET DEFINE OFF;
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20051747','제갈윤미',4.3,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20101534','배진하',3.6,'M',4);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20161609','심성숙',3.6,'M',7);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20081092','표춘수',2.1,'F',2);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20051955','설현석',3.5,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20231111','홍길동',2.1,'M',4);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20111620','추재윤',2.1,'M',7);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20011316','배-원우',2.9,'M',2);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20061311','예우진',2.7,'F',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20111483','이동욱',3.9,'F',4);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20111092','하혜자',3.3,'F',7);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20232222','김철수',3.45,'F',2);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20031678','정유연',2.9,'F',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20101053','황태윤',2.7,'M',4);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20051302','김선욱',3.4,'M',3);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20101786','양성주',3.4,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20181010','탁용태',2.6,'M',4);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20201111','김씨2',3.2,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20191570','안혜영',3.7,'M',7);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20251111','AAA',3,'M',2);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20203333','김씨3',3.2,'F',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20204444','김씨4',3.2,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20205555','김씨5',3.2,'M',5);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20241111','박철수',3.4,'M',3);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('2022111 ','테스트',3.4,'M',3);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20243333','박서영',3.4,'F',6);
Insert into STUDENT (STD_NO,STD_NAME,STD_SCORE,GENDER,MAJOR_NO) values ('20244444','이인수',4.4,'M',2);
REM INSERTING into STUDENT_SCHOLARSHIP
SET DEFINE OFF;
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (1,'20241111',220);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (2,'20201111',570);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (3,'20101786',566);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (4,'20202222',528);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (5,'20111620',408);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (6,'20111620',549);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (7,'20244444',266);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (8,'20061311',577);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (9,'20205555',535);
Insert into STUDENT_SCHOLARSHIP (SCHOLARSHIP_NO,STD_NO,MONEY) values (10,'20101786',586);
--------------------------------------------------------
--  Constraints for Table MAJOR
--------------------------------------------------------

  ALTER TABLE "MAJOR" ADD CONSTRAINT "MAJOR_PK" PRIMARY KEY ("MAJOR_NO") ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "STUDENT" ADD PRIMARY KEY ("STD_NO") ENABLE;
  ALTER TABLE "STUDENT" MODIFY ("STD_NAME" NOT NULL ENABLE);
