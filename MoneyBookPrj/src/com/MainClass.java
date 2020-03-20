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
     
      
      System.out.println("*** ����� ***");

      while (true) {
         printMenu();
         int menu = scan.nextInt();
         if(menu==0) {
            System.out.println("���α׷��� �����մϴ�.");
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
            System.out.println("�߸��� �Է� �Դϴ�.");
            break;
         }
      }


   }

   private static void input() {
      // TODO Auto-generated method stub   
     accountInfo aInfo = new accountInfo();
    
      System.out.println("1.���Ե��");
      System.out.println("2.������");
      System.out.println("3.����");
      System.out.print("����:");
      int menu1 = scan.nextInt();

      if (menu1==3) {
         System.out.println("����ȭ������");
         return;
      }
      switch (menu1) {
      case 1:   
         //2. �� �ν��Ͻ� �� �����͸� �Է�
         scan.nextLine();
         System.out.print("��ȣ: ");
         aInfo.setNum(scan.nextLine());
         System.out.print("��¥: ");
         aInfo.setDate(scan.nextLine());
         System.out.print("����: ");
         aInfo.setInsum(scan.nextInt());
         scan.nextLine();
         System.out.print("����: ");
         aInfo.setHistory(scan.nextLine());
       
         acc.add(aInfo);
         break;

      case 2:
         scan.nextLine();
         System.out.print("��ȣ: ");
         aInfo.setNum(scan.nextLine());
         System.out.print("��¥: ");
         aInfo.setDate(scan.nextLine());
         System.out.print("����: ");
         aInfo.setOutsum(scan.nextInt());
         scan.nextLine();
         System.out.print("����: ");
         aInfo.setHistory(scan.nextLine());
         
         
         acc.add(aInfo);
                  
         break;     
         
      default:
         System.out.println("�߸��� �Է� �Դϴ�.");
         break;
      }
   }

   private static void output() {
      // TODO Auto-generated method stub
      accountInfo aInfo = new accountInfo();
 
      System.out.println("1.��ü���");
      System.out.println("2.���Գ������");
      System.out.println("3.���⳻�����");
      System.out.println("4.����");
      System.out.print("����:");
      int menu2 = scan.nextInt();

      if (menu2==4) {
         System.out.println("����ȭ������");
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
         System.out.println("�߸��� �Է� �Դϴ�.");
         break;
      }

   }

   private static void select() {
      // TODO Auto-generated method stub
      if(acc.size()==0) {
         //����� �ν��Ͻ��� ����.
         System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
         return;
      }
      //�˻�(ã���� �ϴ�) �̸��� �Է� �޴´�.
       scan.nextLine();
      System.out.print("��¥: ");
      String sDate = scan.nextLine();

      boolean isSearch = false;
      //ArrayList �� ù��° �ν��Ͻ��� name�ʵ���� ������ �ν��Ͻ��� name �ʵ�� sname �� ������ ��
      //            �����õ�����
      for(accountInfo a : acc) {
         if(sDate.equals(a.getDate())) {
            //�˻�����=>���
            a.showAccountInfo();
            isSearch =true; //�˻������ ���� ��� true
            //�� �̻� �˻� �ʿ�x -> �ݺ��� ����   
            break; 
         }
      }
      if(isSearch==false) { //�˻� ����� ������� ������� �ʴ´�.
         System.out.println("�˻� ��� ����");
      }

   }

   private static void delete() {
      // TODO Auto-generated method stub
      // �����Ͱ� ���ٸ� �˻� ������ ��� ó���� �ʿ䰡 ����.
      if(acc.size() == 0) {
         //����� �ν��Ͻ��� ����.
         System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
         return;
      }
      // �˻�(ã���� �ϴ�) �̸��� �Է� �޴´�.
      scan.nextLine();
      System.out.print("������ ��ȣ: ");
      String sNum = scan.nextLine();

      int i;      
      for(i = 0; i < acc.size(); i++) {
         accountInfo a = acc.get(i);
         if(sNum.equals(a.getNum())) {
            acc.remove(i);
            System.out.println("���� �Ϸ�");
            break;
         }
      }      
      if(i == acc.size()) {
         System.out.println("�˻� ��� ����.");
      }
   }

   public static void printMenu() {
     System.out.println();
      System.out.println("<<�޴�>>");
      System.out.println("1. ���� ���");
      System.out.println("2. ���� ���");
      System.out.println("3. ���� �˻�");
      System.out.println("4. ���� ����");
      System.out.println("0. ����");
      System.out.println("================");
      System.out.print("���� :");

   }

}