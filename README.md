🚀 실행 방법
MySQL 서버 실행 (포트: 3307, 비밀번호: 1234)

전제 조건 (이게 충족되면 정상 작동)
MySQL 서버가 실행 중이어야 하고 (포트: 3307, 비번: 1234)

JDBC 연결 URL이 이 DB와 매칭되어 있어야 함
예 - jdbc:mysql://localhost:3307/guestbook?useUnicode=true&characterEncoding=UTF-8


Java 코드에서 이 테이블 구조에 맞춰 INSERT/SELECT 쿼리를 사용하고 있어야 함

예를 들어 INSERT INTO messages (name, message)

또는 SELECT * FROM messages

--------------------------------------------------

IntelliJ에서 GuestbookApp.java 실행

콘솔에서 아래 흐름에 따라 사용:


이름을 입력하세요: 재훈
메시지를 입력하세요: 안녕하세요!
메시지가 저장되었습니다.

--- 전체 메시지 목록 ---
[1] 재훈: 안녕하세요! (2025-07-25 13:00:00)
