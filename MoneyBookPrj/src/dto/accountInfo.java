package dto;

public class accountInfo {
   private String Num;
   private String Date;
   private int insum;
   private int outsum;
   public int sum;
   private String History;
   public int imall ; 
   public int outall;
   

   public String getNum() {
      return Num;
   }

   public void setNum(String num) {
      Num = num;
   }

   public String getDate() {
      return Date;
   }

   public void setDate(String date) {
      Date = date;
   }

   public int getInsum() {
      return insum;
   }

   public void setInsum(int insum) {
      this.insum = insum;
   }

   public int getOutsum() {
      return outsum;
   }

   public void setOutsum(int outsum) {
      this.outsum = outsum;
   }

   public int getSum() {
      return sum;
   }

   public void setSum(int sum) {
      this.sum = sum;
   }

   public String getHistory() {
      return History;
   }

   public void setHistory(String history) {
      History = history;
   }

   public int getImall() {
      return imall;
   }

   public void setImall(int imall) {
      this.imall = imall;
   }

   public int getOutall() {
      return outall;
   }

   public void setOutall(int outall) {
      this.outall = outall;
   }

   public accountInfo() {}
   
   //정보를 출력하는 메소드 
         public void showAccountInfo(){
             imall += getInsum(); 
              outall += getOutsum(); 
              sum = imall-outall;
               
            System.out.println("번호: "+ Num);      
            System.out.println("날짜: "+ Date);
            System.out.println("수입: "+ insum);
            System.out.println("지출: "+ outsum);
            System.out.println("합계: "+ sum);
            System.out.println("내역: "+ History);
            System.out.println();
         
         }

         public void showAccountInfo1(){
            
            System.out.println("번호: "+ Num);      
            System.out.println("날짜: "+ Date);
            System.out.println("수입: "+ insum);
            System.out.println("총수입내역: "+ imall);
            System.out.println("내역: "+ History);
         }
         public void showAccountInfo2(){

            System.out.println("번호: "+ Num);      
            System.out.println("날짜: "+ Date);
            System.out.println("지출: "+ outsum);
            System.out.println("지출내역: "+ outall);
            System.out.println("내역: "+ History);
         }
         
   
}

//insum+=insum;
//outsum+=outsum;
//sum=insum-outsum;

//int money=0;
//int incomeSum=0;
//int spendSum=0;
//
//for(int i = 0; i < acc.size(); i++) {
//      accountInfo a = acc.get(i);
//   // a.showAccountInfo();
//    
//       incomeSum += a.getInsum();
//       spendSum += a.getOutsum(); 
//   }

//int sum=0;
//int incomeSum=0;
//int spendSum=0;
//
//incomeSum+=insum;
//spendSum+=outsum;
//sum=insum-outsum;