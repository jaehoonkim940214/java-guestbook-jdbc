# 📝 방명록 웹 애플리케이션 (Java + MySQL)

IntelliJ와 Java, MySQL을 사용하여 구현한 방명록 웹 애플리케이션입니다.  
Maven 기반 프로젝트로 JDBC를 이용해 DB와 연동하며, 간단한 웹서버 기능을 포함합니다.

---

## 📌 주요 기능

- 사용자 이름과 메시지를 입력하면 DB에 저장
- 작성된 메시지 목록을 브라우저에서 조회 가능
- MySQL 연동 및 자동 생성 시각 기록
- UTF-8 인코딩 처리로 한글 메시지도 문제없이 저장

---

## 🛠 사용 기술

- Java 17
- IntelliJ IDEA
- MySQL 8.x (포트: 3307)
- JDBC (Java Database Connectivity)
- Maven

---

🚀 실행 방법
MySQL 서버 실행 (포트: 3307)
비밀번호: 1234 (설정한 값 기준)

IntelliJ에서 GuestbookServer.java 실행

브라우저에서 접속:

arduino
복사
편집
http://localhost:8080
메시지 작성 → DB에 저장
작성된 메시지 목록 출력
