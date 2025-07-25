package com.example.guestbook;

import java.sql.*;
import java.util.Scanner;

public class GuestbookApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/guestbook";
        String user = "root";
        String password = "1234";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                Scanner sc = new Scanner(System.in)
        ) {
            System.out.println("✅ MySQL 연결 성공!");

            while (true) {
                System.out.println("\n1. 메시지 작성");
                System.out.println("2. 메시지 목록 보기");
                System.out.println("0. 종료");
                System.out.print("선택 > ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("메시지: ");
                    String message = sc.nextLine();

                    String insertSql = "INSERT INTO message (name, content) VALUES (?, ?)";
                    try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                        pstmt.setString(1, name);
                        pstmt.setString(2, message);
                        pstmt.executeUpdate();
                        System.out.println("✅ 메시지 저장 완료!");
                    }

                } else if (choice == 2) {
                    String selectSql = "SELECT * FROM message ORDER BY created_at DESC";
                    try (Statement stmt = conn.createStatement();
                         ResultSet rs = stmt.executeQuery(selectSql)) {

                        System.out.println("\n📬 저장된 메시지 목록:");
                        while (rs.next()) {
                            System.out.printf("[%s] %s: %s\n",
                                    rs.getTimestamp("created_at"),
                                    rs.getString("name"),
                                    rs.getString("message"));
                        }
                    }

                } else if (choice == 0) {
                    System.out.println("👋 종료합니다.");
                    break;
                } else {
                    System.out.println("❌ 잘못된 입력입니다.");
                }
            }

        } catch (Exception e) {
            System.out.println("❌ 오류: " + e.getMessage());
        }
    }
}