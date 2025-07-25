# Java Guestbook JDBC

콘솔 기반의 간단한 방명록 시스템입니다.  
사용자의 이름과 메시지를 입력받아 MySQL 데이터베이스에 저장하고,  
저장된 메시지를 시간순으로 조회할 수 있도록 구현했습니다.

---

## 📌 주요 기능

- ✅ 사용자 입력을 통해 메시지 DB에 저장
- ✅ 저장된 메시지를 시간순으로 조회
- ✅ MySQL 연결 성공/실패 메시지 처리
- ✅ 메뉴 선택 기반 콘솔 UI

---

## 💻 기술 스택

| 항목        | 내용                      |
|-------------|---------------------------|
| Language    | Java 23                   |
| DB          | MySQL 8 (port: 3307)      |
| Build Tool  | Maven                     |
| IDE         | IntelliJ IDEA             |
| DB 연결     | JDBC                      |

---

## 🧩 테이블 구조

```sql
CREATE TABLE message (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
