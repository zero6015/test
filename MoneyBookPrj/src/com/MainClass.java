package com;

import java.util.ArrayList;
import java.util.Scanner;

import dto.accountInfo;

public class MainClass {

   private static accountInfo accInfo = new accountInfo();      
   private static Scanner scan = new Scanner(System.in);
   private static ArrayList<accountInfo> acc = new ArrayList<accountInfo>();

   public static void main(String[] args) {
      // TODO Auto-generated method stub
     
      
      System.out.println("*** 가계부 ***");

      while (true) {
         printMenu();
         int menu = scan.nextInt();
         if(menu==0) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
         switch (menu) {
         case 1:
            input();
            break;
         case 2:
            output();
            break;
         case 3:
            select();
            break;

         case 4:
            delete();
            break;
         default:
            System.out.println("잘못된 입력 입니다.");
            break;
         }
      }


   }

   private static void input() {
      // TODO Auto-generated method stub   
     accountInfo aInfo = new accountInfo();
    
      System.out.println("1.수입등록");
      System.out.println("2.지출등록");
      System.out.println("3.이전");
      System.out.print("선택:");
      int menu1 = scan.nextInt();

      if (menu1==3) {
         System.out.println("이전화면으로");
         return;
      }
      switch (menu1) {
      case 1:   
         //2. 그 인스턴스 에 데이터를 입력
         scan.nextLine();
         System.out.print("번호: ");
         aInfo.setNum(scan.nextLine());
         System.out.print("날짜: ");
         aInfo.setDate(scan.nextLine());
         System.out.print("수입: ");
         aInfo.setInsum(scan.nextInt());
         scan.nextLine();
         System.out.print("내역: ");
         aInfo.setHistory(scan.nextLine());
       
         acc.add(aInfo);
         break;

      case 2:
         scan.nextLine();
         System.out.print("번호: ");
         aInfo.setNum(scan.nextLine());
         System.out.print("날짜: ");
         aInfo.setDate(scan.nextLine());
         System.out.print("지출: ");
         aInfo.setOutsum(scan.nextInt());
         scan.nextLine();
         System.out.print("내역: ");
         aInfo.setHistory(scan.nextLine());
         
         
         acc.add(aInfo);
                  
         break;     
         
      default:
         System.out.println("잘못된 입력 입니다.");
         break;
      }
   }

   private static void output() {
      // TODO Auto-generated method stub
      accountInfo aInfo = new accountInfo();
 
      System.out.println("1.전체출력");
      System.out.println("2.수입내역출력");
      System.out.println("3.지출내역출력");
      System.out.println("4.이전");
      System.out.print("선택:");
      int menu2 = scan.nextInt();

      if (menu2==4) {
         System.out.println("이전화면으로");
         return;
      }
      switch (menu2) {
      case 1:   
                   
         for (int i = 0; i < acc.size(); i++) {
            accountInfo a = acc.get(i);
            a.showAccountInfo();
         }
         break;
      case 2:
         for (int i = 0; i < acc.size(); i++) {
              accountInfo a = acc.get(i);
              a.showAccountInfo1();
           }
         break;
      case 3:
         for (int i = 0; i < acc.size(); i++) {
              accountInfo a = acc.get(i);
              a.showAccountInfo2();
           }
         break;

      default:
         System.out.println("잘못된 입력 입니다.");
         break;
      }

   }

   private static void select() {
      // TODO Auto-generated method stub
      if(acc.size()==0) {
         //저장된 인스턴스가 없다.
         System.out.println("입력된 데이터가 없습니다.");
         return;
      }
      //검색(찾고자 하는) 이름을 입력 받는다.
       scan.nextLine();
      System.out.print("날짜: ");
      String sDate = scan.nextLine();

      boolean isSearch = false;
      //ArrayList 의 첫번째 인스턴스의 name필드부터 마지막 인스턴스의 name 필드와 sname 이 같은지 비교
      //            꺼내올데이터
      for(accountInfo a : acc) {
         if(sDate.equals(a.getDate())) {
            //검색성공=>출력
            a.showAccountInfo();
            isSearch =true; //검색결과가 있을 경우 true
            //더 이상 검색 필요x -> 반복문 종료   
            break; 
         }
      }
      if(isSearch==false) { //검색 결과가 있을경우 출력하지 않는다.
         System.out.println("검색 결과 없음");
      }

   }

   private static void delete() {
      // TODO Auto-generated method stub
      // 데이터가 없다면 검색 과정을 모두 처리할 필요가 없음.
      if(acc.size() == 0) {
         //저장된 인스턴스가 없음.
         System.out.println("입력된 데이터가 없습니다.");
         return;
      }
      // 검색(찾고자 하는) 이름을 입력 받는다.
      scan.nextLine();
      System.out.print("삭제할 번호: ");
      String sNum = scan.nextLine();

      int i;      
      for(i = 0; i < acc.size(); i++) {
         accountInfo a = acc.get(i);
         if(sNum.equals(a.getNum())) {
            acc.remove(i);
            System.out.println("삭제 완료");
            break;
         }
      }      
      if(i == acc.size()) {
         System.out.println("검색 결과 없음.");
      }
   }

   public static void printMenu() {
     System.out.println();
      System.out.println("<<메뉴>>");
      System.out.println("1. 내역 등록");
      System.out.println("2. 내역 출력");
      System.out.println("3. 내역 검색");
      System.out.println("4. 내역 삭제");
      System.out.println("0. 종료");
      System.out.println("================");
      System.out.print("선택 :");

   }

}